package teste;

import teste.enumType.Regra;
import teste.to.TraducaoTO;
import gerado.RegularExpressionEREBaseVisitor;
import gerado.RegularExpressionEREParser.*;

/**
 * Utiliza o padrao Visitor para "visitar" uma parse tree e,
 * para cada no diferente da arvore, armazena uma traducao equivalente
 * em linguagem natural, em estrutura de arvore com texto identado.<br>
 * <br>
 * O metodo visit() recebe uma parse tree e realiza a traducao. O resultado
 * e armazenado em uma variavel da classe.<br>
 * <br> 
 * Todos os metodos visitor retornam nulo. A traducao pode ser recuperada
 * utilizando o metodo getTraducao().<br>
 * <br>
 * Os metodos visitor que aumentam a identacao sempre vao
 * diminui-la apos visitar todos os seus filhos.<br>
 * <br>
 * @author Tiso
 */
public class Tradutor extends RegularExpressionEREBaseVisitor<Void> {
	
	//  ------- VARIAVEIS  ------- 
	
	/** Classe que vai armazenar as traducoes individuais dos metodos visit. */
	private Traducao traducao = new Traducao();
	
	/** Texto atual antes de ser traduzido. */
	private String textoOriginal;
	
	/** Traducao atual recebida por um metodo visit. */
	private String textoTraduzido;
	
	/** A regra que disparou a traducao atual. */
	private Regra tipoRegra;
	
	/** O nivel atual na analize da arvore. */
	private int nivelAtual = 0;
	
	/** A quantidade de grupos de captura encontrados. */
	private int contadorGrupos = 0;
	
	/** A quantidade relativa de multiplas opcoes encontradas. */
	private int contadorOpcoes = 0;
	
	
	//  ------- METODOS ------- 
	
	/**
	 * Faz a traducao dos elementos de uma arvore de
	 * analise (parse tree) e retorna um objeto Traducao,
	 * que contem o resultado da traducao.
	 * 
	 * @param ctx Uma parse Tree
	 * @return Um objeto Traducao
	 */
	public Traducao traduzir (ExpressionContext ctx){
		
		//Visita a raiz da arvore, e todas as suas filhas
		visit(ctx);
		
		return traducao;
	}
	
	/**
	 * Armazena o texto original, traduzido, tipo de regra
	 * e nivel de profundidade atuais (armazenados nas variaveis
	 * globais da classe) em um objeto de transferencia.<br>
	 * <br>
	 * Esse objeto de transferencia e entao armazenado dentro
	 * de uma instancia da classe Traducao.
	 */
	private void armazena (){
		
		//Um objeto de transferencia que contem todas as informacoes
		//sobre a traducao feita
		TraducaoTO to = new TraducaoTO();
		
		to.setTipoRegra(tipoRegra);
		to.setNivel(nivelAtual);
		to.setOriginal(textoOriginal);
		to.setTraducao(textoTraduzido);
		
		//Adciona o objeto na instancia da classe Traducao
		traducao.addTraducao(to);
	}
	
	/**
	 * Remove todas as ocorrencias do caractere de escape \ dentro
	 * de um texto, salvo ocorrencias de \\ que viram \ .
	 * 
	 * @param texto O texto que deve ser alterado
	 * @return Um novo texto que nao contem \
	 */
    private String removeEscape(String texto){
    	
        int posicaoAtual = 0;		//Posicao atual no buffer
        char caractereAtual;		//Caractere atual do texto de entrada
        char proximoCaractere;		//Caractere seguinte ao atual do texto de entrada
        char escape = '\\';			//Apenas uma barra invertida
        
        //Buffer de String, para fazer a construcao da nova String
        StringBuffer buffer = new StringBuffer(texto.length());
        
        //Tamanho maximo do buffer
        buffer.setLength(texto.length());
        
        //Para todos os caracteres no texto de entrada
        for (int i=0; i<texto.length(); i++){
        	
        	//Recupera o caractere atual
            caractereAtual = texto.charAt(i);
            
            //Verefica se ele nao e uma barra invertida
            if(caractereAtual != escape){
            	
            	//Adiciona o caractere no buffer
            	buffer.setCharAt(posicaoAtual++, caractereAtual);
            }
            
            //Se o caractere for uma barra invertida
            else {
            	
            	//Recupera o proximo caractere
            	proximoCaractere = texto.charAt(i+1);
            	
            	//Se o proximo caractere tambem for uma barra invertida
            	if(proximoCaractere == escape){
            		
            		//Adiciona o proximo caractere (a barra invertida) no buffet
            		buffer.setCharAt(posicaoAtual++, proximoCaractere);
            		
            		//Aumenta o contador uma posicao a mais, para
            		//nao ler esta barra invertida denovo
            		i++;
            	}
            	//Se o proximo caractere nao for uma barra invertida,
            	//ignora a barra invertida atual
            }
        }
        
        return buffer.toString();
    }
	
	
	//  ------- VISITORS  -------
	
	/** Quando visita uma expressao, visita todos os filhos dela. */
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita multiplas opcoes, traduz 'Uma das opcoes: ',
	 *  aumenta o nivel de identacao, inicia a contagem de opcoes
	 *  e visita todos os filhos dela.*/
	@Override
	public Void visitMultiple(MultipleContext ctx) {
		
		tipoRegra		= Regra.MULTIPLE;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Uma das opcoes: ";
		
		armazena ();
		
		nivelAtual++;
		
		/** Salva o contador de opcoes atual e zera ele.
		 *  Necessario pois pode existir multiplas opcoes
		 *  dentro de um grupo que faz parte de multiplas
		 *  opcoes.
		 */
		int temp = contadorOpcoes;
		contadorOpcoes = 0;
		
		visitChildren(ctx);
		
		//Retorna o contador ao seu estado original
		contadorOpcoes = temp;
		
		nivelAtual--;
		
		return null;
	}
	
	/** Quando visita uma subexpressao, aumenta o contador de opcoes,
	 * traduz 'Opcao n:', aumenta o nivel de identacao e 
	 * visita todos os filhos dela.*/
	@Override
	public Void visitSubExpression(SubExpressionContext ctx) {
		
		/** Testa se este no da arvore e do mesmo tipo do pai
		 *  Necessario pois uma subExpression pode ser filha de uma
		 *  subExpression, e nao queremos aumentar o contador
		 *  nessa situacao.
		 */
		int pai   = ctx.getParent().getRuleIndex();
		int filho = ctx.getRuleIndex();
		
		//Se o pai nao for uma SubExpression, aumenta o contador
		if (pai != filho){
			contadorOpcoes++;
			
			tipoRegra		= Regra.SUB_EXPRESSION;
			textoOriginal	= ctx.getText();
			textoTraduzido	= "Opcao " + contadorOpcoes + ":";
			
			armazena();
			
			nivelAtual++;
		}
		
		visitChildren(ctx);
		
		nivelAtual--;
		
		return null;
	}
	
	/** Quando visita um grupo, aumenta o contador de grupos,
	 *  traduz'Grupo n:', aumenta o nivel de identacao
	 *  e visita todos os filhos dele. */
	@Override
	public Void visitGroup(GroupContext ctx) {
		
		contadorGrupos++;
		
		tipoRegra		= Regra.GROUP;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Grupo " + contadorGrupos + ":";
		
		armazena();
		
		nivelAtual++;
		visitChildren(ctx);
		nivelAtual--;
		
		return null;
	}
	
	/** Quando visita uma posicao, visita todos os filhos dela. */
	@Override
	public Void visitAnchor(AnchorContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma posicao de inicio, traduz 'No inicio do texto'.*/
	@Override
	public Void visitStartAnchor(StartAnchorContext ctx) {
		
		tipoRegra		= Regra.START_ANCHOR;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "No inicio do texto";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma posicao de fim, traduz 'No final do texto'. */
	@Override
	public Void visitEndAnchor(EndAnchorContext ctx) {
		
		tipoRegra		= Regra.END_ANCHOR;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "No final do texto";
		
		armazena();
		
		return null;
	}
	
	/**
	 * Quando visita uma repeticao correta, visita o quantificador,
	 * aumenta o nivel de identacao e visita a parte quantificada.
	 */
	@Override
	public Void visitCorrectRepetition(CorrectRepetitionContext ctx) {
		
		//Visita o simbolo quantificador
		visit(ctx.quantifier());
		
		nivelAtual++;
		
		//Visita a expressao quantificada
		visit(ctx.quantified());
		
		nivelAtual--;
		
		return null;
	}
	
	/** Quando visita um quantificador, visita todos os filhos dele. */
	@Override
	public Void visitQuantifier(QuantifierContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita o quantificador '+', traduz 'Um ou mais:'. */
	@Override
	public Void visitOneOrMore(OneOrMoreContext ctx) {
		
		tipoRegra		= Regra.ONE_OR_MORE;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Um ou mais:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita o quantificador '*', traduz 'Zero ou mais:'. */
	@Override
	public Void visitZeroOrMore(ZeroOrMoreContext ctx) {
		
		tipoRegra		= Regra.ZERO_OR_MORE;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Zero ou mais:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita o quantificador '?', traduz 'Pode ou nao conter:'. */
	@Override
	public Void visitConditional(ConditionalContext ctx) {
		
		tipoRegra		= Regra.CONDITIONAL;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Pode ou nao conter:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita o quantificador {n}, recupera o valor de n
	 *  e traduz 'Exatamente n ocorrencias de:'. */
	@Override
	public Void visitExact(ExactContext ctx) {
		
		tipoRegra		= Regra.EXACT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Exatamente " + ctx.value().getText() + " ocorrencias de:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita o quantificador {n,}, recupera o valor de n
	 *  e traduz 'Pelo menos n ocorrencias de:'. */
	@Override
	public Void visitAtLeast(AtLeastContext ctx) {
		
		tipoRegra		= Regra.AT_LEAST;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Pelo menos " + ctx.value().getText() + " ocorrencias de:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita o quantificador {n,m}, recupera os valores de n e m
	 *  e traduz 'Entre n e m ocorrencias de:'. */
	@Override
	public Void visitBetween(BetweenContext ctx) {
		
		tipoRegra		= Regra.BETWEEN;
		textoOriginal	= ctx.getText();
		
		textoTraduzido	=	"Entre " + 
							ctx.firstValue().getText() + 
							" e " + 
							ctx.lastValue().getText() + 
							" ocorrencias de:";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma expressao quantificada, visita todos os filhos dela. */
	@Override
	public Void visitQuantified(QuantifiedContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma lista, visita todos os filhos dela. */
	@Override
	public Void visitList(ListContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma lista negativa, traduz
	 *  'Qualquer caractere que nao seja:', aumenta
	 *  o nivel de identacao e visita 
	 *  todos os filhos dela. */
	@Override
	public Void visitNegativeList(NegativeListContext ctx) {
		
		tipoRegra		= Regra.NEGATIVE_LIST;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Qualquer caractere que nao seja:";
		
		armazena();
		
		nivelAtual++;
		visitChildren(ctx);
		nivelAtual--;
		
		return null;
	}
	
	/** Quando visita uma lista positiva, traduz 
	 * 'Qualquer um dos caracteres:', aumenta o nivel de identacao
	 * e visita todos os filhos dela. */
	@Override
	public Void visitPositiveList(PositiveListContext ctx) {
		
		tipoRegra		= Regra.POSITIVE_LIST;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Qualquer um dos caracteres:";
		
		armazena();
		
		nivelAtual++;
		visitChildren(ctx);
		nivelAtual--;
		
		return null;
	}
	
	/**
	 * Quando visita um primeiro elemento de lista,
	 * visita todos os filhos dele.
	 */
	@Override
	public Void visitListFirstElement(ListFirstElementContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/**
	 * Quando visita um caractere de lista que perdeu seu significado especial,
	 * armazena o caractere.
	 */
	@Override
	public Void visitListNoSpecial(ListNoSpecialContext ctx) {
		
		tipoRegra		= Regra.LIST_NO_SPECIAL;
		textoOriginal	= ctx.getText();
		textoTraduzido	= ctx.getText();
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma serie de caracteres especial,
	 * recupera o caractere da esquerda e o caractere da direita, 
	 * e traduz 'Todos os caracteres entre ESQUERDA e DIREITA'.
	 */
	@Override
	public Void visitListFirstRange(ListFirstRangeContext ctx) {
		
		/**
		 * Uma serie tem o formato A-B, onde A e B sao caracteres comuns
		 * 
		 * Os filhos serao:
		 * 0: A
		 * 1: -
		 * 2: B
		 */
		
		//Recupera os textos
		String a = ctx.getChild(0).getText();
		String b = ctx.getChild(2).getText();
		
		tipoRegra		= Regra.LIST_FIRST_RANGE;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Todos os caracteres entre '" + a + "' e '" + b + "'";
		
		armazena();
		
		return null;
	}
	
	/** 
	 * Quando visita um elemento de lista, visita todos os filhos dele. 
	 */
	@Override
	public Void visitListElement(ListElementContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/**
	 * Quando visita o ultimo caractere de uma lista que perdeu
	 * seu significado especial, armazena o caractere.
	 */
	@Override
	public Void visitListLastElement(ListLastElementContext ctx) {
		
		tipoRegra		= Regra.LIST_LAST_ELEMENT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= ctx.getText();
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma serie de caracteres, recupera o caractere da esquerda
	 *  e o caractere da direita, e traduz 
	 *  'Todos os caracteres entre ESQUERDA e DIREITA'. */
	@Override
	public Void visitRange(RangeContext ctx) {
		
		/**
		 * Uma serie tem o formato A-B, onde A e B sao caracteres comuns
		 * 
		 * Os filhos serao:
		 * 0: A
		 * 1: -
		 * 2: B
		 */
		
		//Recupera os textos
		String a = ctx.getChild(0).getText();
		String b = ctx.getChild(2).getText();
		
		tipoRegra		= Regra.RANGE;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Todos os caracteres entre '" + a + "' e '" + b + "'";
		
		armazena();
		
		return null;
	}
	
	/**
	 * Quando visita um caractere de lista, armazena o caractere.
	 */
	@Override
	public Void visitListCharacter(ListCharacterContext ctx) {
		
		tipoRegra		= Regra.LIST_CHARACTER;
		textoOriginal	= ctx.getText();
		textoTraduzido	= ctx.getText();
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres,
	 *  visita todos os filhos dela. */
	@Override
	public Void visitCharclass(CharclassContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando Visita o nome da um tipo de classe, 
	 *  visita todos os filhos dela. */
	@Override
	public Void visitClassname(ClassnameContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma classe alfanumerica,
	 *  traduz 'Caracteres alfanumericos'. */
	@Override
	public Void visitAlnum(AlnumContext ctx) {
		
		tipoRegra		= Regra.ALNUM;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres alfanumericos";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe alafabetica,
	 *  traduz 'Caracteres alfabeticos'. */
	@Override
	public Void visitAlpha(AlphaContext ctx) {
		
		tipoRegra		= Regra.ALPHA;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres alfabeticos";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de espaco,
	 *  traduz 'Espaco e tabulacao'. */
	@Override
	public Void visitBlank(BlankContext ctx) {
		
		tipoRegra		= Regra.BLANK;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Espaco e tabulacao";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de controle,
	 *  traduz 'Caracteres de controle'. */
	@Override
	public Void visitCntrl(CntrlContext ctx) {
		
		tipoRegra		= Regra.CNTRL;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres de controle";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de digitos,
	 *  traduz 'Digitos'. */
	@Override
	public Void visitDigitclass(DigitclassContext ctx) {
		
		tipoRegra		= Regra.DIGIT_CLASS;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Digitos";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres visiveis,
	 *  traduz 'Caracteres visiveis'. */
	@Override
	public Void visitGraph(GraphContext ctx) {
		
		tipoRegra		= Regra.GRAPH;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres visiveis";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de letras minusculas,
	 *  traduz 'Letras minusculas'. */
	@Override
	public Void visitLower(LowerContext ctx) {
		
		tipoRegra		= Regra.LOWER;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Letras minusculas";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres imprimiveis,
	 *  traduz 'Caracteres visiveis e espaco'. */
	@Override
	public Void visitPrint(PrintContext ctx) {
		
		tipoRegra		= Regra.PRINT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres visiveis e espaco";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de pontucao,
	 *  traduz 'Caracteres de pontucao'. */
	@Override
	public Void visitPunct(PunctContext ctx) {
		
		tipoRegra		= Regra.PUNCT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres de pontucao";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres de espacamento,
	 *  traduz 'Caracteres brancos'. */
	@Override
	public Void visitSpaceclass(SpaceclassContext ctx) {
		
		tipoRegra		= Regra.PUNCT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres brancos";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de letras maiusculas,
	 *  traduz 'Letras maiusculas'. */
	@Override
	public Void visitUpper(UpperContext ctx) {
		
		tipoRegra		= Regra.UPPER;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Letras maiusculas";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma classe de digitos hexadecimais,
	 *  traduz 'Numeros hexadecimais'. */
	@Override
	public Void visitXdigit(XdigitContext ctx) {
		
		tipoRegra		= Regra.X_DIGIT;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Numeros hexadecimais";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita um ponto,
	 *  traduz 'Qualquer caractere'. */
	@Override
	public Void visitAnychar(AnycharContext ctx) {
		
		tipoRegra		= Regra.ANY_CHAR;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Qualquer caractere";
		
		armazena();
		
		return null;
	}
	
	/** Quando visita uma colecao de caracteres, traduz 
	 *  'Caracteres: ' + a String da colecao. */
	@Override
	public Void visitCharacters(CharactersContext ctx) {
		
		String caracteres = ctx.getText();
		
		//Remove todas as barra invertidas, caso essa colecao
		//tenha caracteres escapados
		String semEscape = removeEscape(caracteres);
		
		tipoRegra		= Regra.CHARACTERS;
		textoOriginal	= ctx.getText();
		textoTraduzido	= "Caracteres: " + semEscape;
		
		armazena();
		
		return null;
	}
	
	/** Quando visita um caractere, armazena o caractere .*/
	@Override
	public Void visitCharacter(CharacterContext ctx) {
		
		tipoRegra		= Regra.CHARACTER;
		textoOriginal	= ctx.getText();
		textoTraduzido	= ctx.getText();
		
		armazena();
		
		return null;
	}

}
