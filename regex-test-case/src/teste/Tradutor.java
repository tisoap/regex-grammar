package teste;

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
	
	/** Contem a concatenacao de todas as traducoes individuais dos
	 *  metodos visitor.*/
	public String traducao = "";
	
	/** O nivel de identacao atual na analize da arvore. */
	private int nivelAtual = 0;
	
	/** A quantidade de grupos de captura encontrados. */
	private int contadorGrupos = 0;
	
	/** A quantidade relativa de multiplas opcoes encontradas. */
	private int contadorOpcoes = 0;
	
	
	//  ------- GETTERS  ------- 
	
	/**
	 * Retorna uma String contendo a traducao
	 * da expressao regular. Sera vazio se nao
	 * foi executado o metodo visit().
	 */
	public String getTraducao() {
		return traducao;
	}
	
	
	//  ------- METODOS AUXILIARES  ------- 
	
	/** 
	 * Cria uma identacao de espacos de acordo com o nivel desejado.
	 * 
	 * @param x O nivel de identacao desejado.
	 * @return Uma String com 3 espacos vezes o numero da identacao.*/
	public String calcularIdentacao (int x) {
		
		String ident = "";
		
		for (int i = 0; i < x; i++){
			ident += "   ";
		}
		
		return ident;
	}
	
	/** Concatena um texto na variavel 'traducao',
	 *  adcionando uma identacao no comeco e uma quebra
	 *  de linha no final. */
	public void armazena (String texto){
		
		String identacao = calcularIdentacao(nivelAtual);
		
		traducao += identacao + texto + "\n";
	}
	
	/**
	 * Remove todas as ocorrencias de um caractere epecifico
	 * dentro de um texto.
	 * 
	 * @param texto O texto que deve ser alterado
	 * @param caractere O caractere que deve ser removido
	 * @return Um novo texto que nao contem o caractere escolhido
	 */
    public String removeCaractere(String texto, char caractere){
    	
        StringBuffer buffer = new StringBuffer(texto.length());
        
        buffer.setLength(texto.length());
        
        int posicaoAtual = 0;
        
        for (int i=0; i<texto.length(); i++){
        	
            char caractereAtual = texto.charAt(i);
            
            if(caractereAtual != caractere)
            	buffer.setCharAt(posicaoAtual++, caractereAtual);
            
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
		
		armazena("Uma das opcoes: ");
		
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
			armazena("Opcao " + contadorOpcoes + ":");
		}
		
		nivelAtual++;
		
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
		
		armazena("Grupo " + contadorGrupos + ":");
		
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
		
		armazena("No inicio do texto");
		
		return null;
	}
	
	/** Quando visita uma posicao de fim, traduz 'No final do texto'. */
	@Override
	public Void visitEndAnchor(EndAnchorContext ctx) {
		
		armazena("No final do texto");
		
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
		
		armazena("Um ou mais:");
		
		return null;
	}
	
	/** Quando visita o quantificador '*', traduz 'Zero ou mais:'. */
	@Override
	public Void visitZeroOrMore(ZeroOrMoreContext ctx) {
		
		armazena("Zero ou mais:");
		
		return null;
	}
	
	/** Quando visita o quantificador '?', traduz 'Pode ou nao conter:'. */
	@Override
	public Void visitConditional(ConditionalContext ctx) {
		
		armazena("Pode ou nao conter:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n}, recupera o valor de n
	 *  e traduz 'Exatamente n ocorrencias de:'. */
	@Override
	public Void visitExact(ExactContext ctx) {
		
		armazena("Exatamente " + ctx.value().getText() + " ocorrencias de:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n,}, recupera o valor de n
	 *  e traduz 'Pelo menos n ocorrencias de:'. */
	@Override
	public Void visitAtLeast(AtLeastContext ctx) {
		
		armazena("Pelo menos " + ctx.value().getText() + " ocorrencias de:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n,m}, recupera os valores de n e m
	 *  e traduz 'Entre n e m ocorrencias de:'. */
	@Override
	public Void visitBetween(BetweenContext ctx) {
		
		armazena(
				"Entre " + 
				ctx.firstValue().getText() + 
				" e " + 
				ctx.lastValue().getText() + 
				" ocorrencias de:");
		
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
		
		armazena("Qualquer caractere que nao seja:");
		
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
		
		armazena("Qualquer um dos caracteres:");
		
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
		
		armazena(ctx.getText());
		
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
		
		armazena("Todos os caracteres entre '" + a + "' e '" + b + "'");
		
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
		
		armazena(ctx.getText());
		
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
		
		armazena("Todos os caracteres entre '" + a + "' e '" + b + "'");
		
		return null;
	}
	
	/**
	 * Quando visita um caractere de lista, armazena o caractere.
	 */
	@Override
	public Void visitListCharacter(ListCharacterContext ctx) {
		
		armazena(ctx.getText());
		
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
		
		armazena("Caracteres alfanumericos");
		
		return null;
	}
	
	/** Quando visita uma classe alafabetica,
	 *  traduz 'Caracteres alfabeticos'. */
	@Override
	public Void visitAlpha(AlphaContext ctx) {
		
		armazena("Caracteres alfabeticos");
		
		return null;
	}
	
	/** Quando visita uma classe de espaco,
	 *  traduz 'Espaco e tabulacao'. */
	@Override
	public Void visitBlank(BlankContext ctx) {
		
		armazena("Espaco e tabulacao");
		
		return null;
	}
	
	/** Quando visita uma classe de controle,
	 *  traduz 'Caracteres de controle'. */
	@Override
	public Void visitCntrl(CntrlContext ctx) {
		
		armazena("Caracteres de controle");
		
		return null;
	}
	
	/** Quando visita uma classe de digitos,
	 *  traduz 'Digitos'. */
	@Override
	public Void visitDigitclass(DigitclassContext ctx) {
		
		armazena("Digitos");
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres visiveis,
	 *  traduz 'Caracteres visiveis'. */
	@Override
	public Void visitGraph(GraphContext ctx) {
		
		armazena("Caracteres visiveis");
		
		return null;
	}
	
	/** Quando visita uma classe de letras minusculas,
	 *  traduz 'Letras minusculas'. */
	@Override
	public Void visitLower(LowerContext ctx) {
		
		armazena("Letras minusculas");
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres imprimiveis,
	 *  traduz 'Caracteres visiveis e espaco'. */
	@Override
	public Void visitPrint(PrintContext ctx) {
		
		armazena("Caracteres visiveis e espaco");
		
		return null;
	}
	
	/** Quando visita uma classe de pontucao,
	 *  traduz 'Caracteres de pontucao'. */
	@Override
	public Void visitPunct(PunctContext ctx) {
		
		armazena("Caracteres de pontucao");
		
		return null;
	}
	
	/** Quando visita uma classe de caracteres de espacamento,
	 *  traduz 'Caracteres brancos'. */
	@Override
	public Void visitSpaceclass(SpaceclassContext ctx) {
		
		armazena("Caracteres brancos");
		
		return null;
	}
	
	/** Quando visita uma classe de letras maiusculas,
	 *  traduz 'Letras maiusculas'. */
	@Override
	public Void visitUpper(UpperContext ctx) {
		
		armazena("Letras maiusculas");
		
		return null;
	}
	
	/** Quando visita uma classe de digitos hexadecimais,
	 *  traduz 'Numeros hexadecimais'. */
	@Override
	public Void visitXdigit(XdigitContext ctx) {
		
		armazena("Numeros hexadecimais");
		
		return null;
	}
	
	/** Quando visita um ponto,
	 *  traduz 'Qualquer caractere'. */
	@Override
	public Void visitAnychar(AnycharContext ctx) {
		
		armazena("Qualquer caractere");
		
		return null;
	}
	
	/** Quando visita uma colecao de caracteres, traduz 
	 *  'Caracteres: ' + a String da colecao. */
	@Override
	public Void visitCharacters(CharactersContext ctx) {
		
		String caracteres = ctx.getText();
		
		//Remove todas as barra invertidas, caso essa colecao
		//tenha caracteres escapados
		String semEscape = removeCaractere(caracteres, '\\');
		
		armazena("Caracteres: " + semEscape);
		
		return null;
	}
	
	/** Quando visita um caractere, armazena o caractere .*/
	@Override
	public Void visitCharacter(CharacterContext ctx) {
		
		armazena(ctx.getText());
		
		return null;
	}

}
