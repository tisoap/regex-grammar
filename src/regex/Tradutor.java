package regex;

import regex.enumType.RegraRegex;
import regex.transfer.TraducaoTO;
import generated.RegularExpressionEREBaseVisitor;
import generated.RegularExpressionEREParser.*;

/**
 * Utiliza o padrão Visitor para "visitar" uma parse tree e,
 * para cada nó diferente da árvore, armazena uma tradução equivalente
 * em linguagem natural.
 */
public class Tradutor extends RegularExpressionEREBaseVisitor<Void> {

	//  ------- VARIAVEIS  -------

	/** ----- DS 19-21 ----- **/
	/** Objeto que vai armazenar as traducoes individuais dos metodos visit. */
	private Traducao traducao  = new Traducao();

	/** O nivel de profundidade atual na arvore de analise. */
	private int nivelAtual     = 0;

	/** A quantidade de grupos de captura encontrados.
	 *  Este numero e usado no texto da traducao. (Ex: "Grupo 2:")*/
	private int contadorGrupos = 0;

	/** A quantidade de multiplas opcoes encontradas.
	 *  Este numero e usado no texto da traducao. (Ex: "Opcao 3:")*/
	private int contadorOpcoes = 0;


	//  ------- METODOS -------

	/**
	 * Faz a traducao dos elementos de uma arvore de
	 * analise (parse tree) e retorna um objeto Traducao,
	 * que contem o resultado da traducao.
	 *
	 * @param ctx
	 *  Uma parse Tree
	 *  
	 * @return
	 *  Um objeto Traducao
	 */
	public Traducao traduzir (ExpressionContext ctx){

		//Visita a raiz da arvore, e todas as suas filhas
		visit(ctx);

		//Retorna uma instancia da classe Traducao, ja populada
		return traducao;
	}

	/**
	 * Armazena as informacoes de uma traducao individual em um objeto
	 * de transferencia, e armazena este objeto em uma lista.
	 *
	 * @param tipoRegra
	 *  A regra no qual a traducao pertence.
	 *  
	 * @param textoOriginal
	 *  O texto original antes de ser traduzido.
	 *  
	 * @param textoTraduzido
	 *  A traducao.
	 *  
	 * @param terminal
	 *  Indicacao se a regra e terminal.
	 */
	private void armazena (
			RegraRegex  tipoRegra,
			String      textoOriginal,
			String      textoTraduzido,
			boolean     terminal)
	{
		//Um objeto de transferencia que contem todas as informacoes
		//sobre a traducao feita
		/** ----- DS 31-32 ----- **/
		TraducaoTO to = populaTraducaoTO(tipoRegra, textoOriginal, textoTraduzido, terminal);

		//Adciona o objeto de tranferencia em uma lista
		//dentro do objeto Traducao
		/** ----- DS 33-34 ----- **/
		traducao.addTraducao(to);
	}

	/**
	 * Sobrecarga do metodo armazenar() para incluir o numero encontrado
	 * em uma regra de repeticao "EXACT" ou "AT_LEAST".
	 *
	 * @param tipoRegra 
	 *  A regra no qual a traducao pertence.
	 *  
	 * @param textoOriginal
	 *  O texto original antes de ser traduzido.
	 *  
	 * @param textoTraduzido
	 *  A traducao.
	 *  
	 * @param terminal
	 *  Indicacao se a regra e terminal.
	 *  
	 * @param numero1
	 *  O valor numerico da repeticao.
	 */
	private void armazena (
			RegraRegex  tipoRegra,
			String      textoOriginal,
			String      textoTraduzido,
			boolean    terminal,
			int         numero1)
	{
		TraducaoTO to = populaTraducaoTO(tipoRegra, textoTraduzido, textoTraduzido, terminal);

		to.setNumero1(numero1);

		traducao.addTraducao(to);
	}

	/**
	 * Sobrecarga do metodo armazenar() para incluir os numeros encontrado
	 * em uma regra de repeticao "BETWEEN".
	 *
	 * @param tipoRegra
	 *  A regra no qual a traducao pertence.
	 *  
	 * @param textoOriginal
	 *  O texto original antes de ser traduzido.
	 *  
	 * @param textoTraduzido
	 *  A traducao.
	 * @param terminal
	 *  Indicacao se a regra e terminal.
	 *  
	 * @param numero1
	 *  O primeiro valor numerico da repeticao.
	 *  
	 * @param numero2
	 *  O segundo valor numerico da repeticao.
	 */
	private void armazena (
			RegraRegex  tipoRegra,
			String      textoOriginal,
			String      textoTraduzido,
			boolean     terminal,
			int         numero1,
			int         numero2)
	{
		TraducaoTO to = populaTraducaoTO(tipoRegra, textoTraduzido, textoTraduzido, terminal);

		to.setNumero1(numero1);
		to.setNumero2(numero2);

		traducao.addTraducao(to);
	}

	/**
	 * Sobrecarga do metodo armazenar() para incluir os caracteres encontrados
	 * em uma serie RANGE ou LIST_FIRST_RANGE
	 *
	 * @param tipoRegra
	 *  A regra no qual a traducao pertence.
	 *  
	 * @param textoOriginal
	 *  O texto original antes de ser traduzido.
	 *  
	 * @param textoTraduzido
	 *  A traducao.
	 *  
	 * @param terminal
	 *  Indicacao se a regra e terminal.
	 *  
	 * @param caractere1
	 *  O primeiro caractere da serie.
	 *  
	 * @param caractere2
	 *  O segundo caractere da serie.
	 */
	private void armazena (
			RegraRegex  tipoRegra,
			String      textoOriginal,
			String      textoTraduzido,
			boolean     terminal,
			String      caractere1,
			String      caractere2)
	{
		TraducaoTO to = populaTraducaoTO(tipoRegra, textoTraduzido, textoTraduzido, terminal);

		to.setCaractere1(caractere1);
		to.setCaractere2(caractere2);

		traducao.addTraducao(to);
	}

	/**
	 * Popula e retorna um objeto de transferencia TraducaoTO com
	 * os parametros passados.
	 *
	 * @param tipoRegra
	 *  A regra no qual a traducao pertence.
	 *  
	 * @param textoOriginal
	 *  O texto original antes de ser traduzido.
	 *  
	 * @param textoTraduzido
	 *  A traducao.
	 *  
	 * @param terminal
	 *  Indicacao se a regra e terminal.
	 *  
	 * @return
	 *  Um objeto de transferencia TraducaoTO
	 */
	private TraducaoTO populaTraducaoTO(
			RegraRegex  tipoRegra,
			String      textoOriginal,
			String      textoTraduzido,
			boolean     terminal)
	{
		TraducaoTO to = new TraducaoTO();

		to.setTipoRegra(tipoRegra);
		to.setNivel(nivelAtual);
		to.setTextoOriginal(textoOriginal);
		to.setTraducao(textoTraduzido);
		to.setTerminal(terminal);
		
		return to;
	}

	/**
	 * Remove todas as ocorrencias do caractere de escape \ dentro
	 * de um texto, salvo ocorrencias de \\ que viram \ .
	 *
	 * @param
	 *  texto O texto que deve ser alterado
	 *  
	 * @return
	 *  Um novo texto que nao contem \
	 */
	private String removeEscape(String texto){

		int  posicaoAtual      = 0    ; //Posicao atual no buffer
		char escape            = '\\' ; //Barra invertida
		char caractereAtual;            //Caractere atual do texto de entrada
		char proximoCaractere;          //Caractere seguinte ao atual do texto de entrada

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

					//Adiciona o proximo caractere (a barra invertida) no buffer
					buffer.setCharAt(posicaoAtual++, proximoCaractere);

					//Aumenta o contador uma posicao a mais, para
					//pular a leitura da barra invertida
					i++;
				}

				//Se o proximo caractere nao for uma barra invertida,
				//ignora a barra invertida atual, nao adicionando ela
				//no buffer.
				
				//Como um caractere foi ignorado aqui, e
				//preciso diminuir o tamanho do buffer
				buffer.setLength(buffer.length()-1);
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

		armazena(RegraRegex.MULTIPLE, ctx.getText(), "Uma das opções:", false);

		nivelAtual++;

		/**
		 * Salva o contador de opcoes atual e zera ele.
		 *
		 * Necessario pois podem existir multiplas opcoes
		 * dentro de um grupo que faz parte de multiplas
		 * opcoes.
		 *
		 * Em um caso assim, queremos contar apenas as
		 * opcoes da regra MULTIPLE atual, e nao da que se
		 * encontra em um nivel mais acima.
		 */
		int temp = contadorOpcoes;
		contadorOpcoes = 0;

		visitChildren(ctx);

		//Retorna o contador de opcoes ao seu estado original
		contadorOpcoes = temp;

		nivelAtual--;

		return null;
	}

	/** Quando visita uma subexpressao, aumenta o contador de opcoes,
	 *  traduz 'Opcao n:', aumenta o nivel de identacao e
	 *  visita todos os filhos dela.*/
	@Override
	public Void visitSubExpression(SubExpressionContext ctx) {

		/**
		 * Testa se este no da arvore e do mesmo tipo do pai.
		 *
		 * Necessario pois uma subExpression pode ser filha de uma
		 * subExpression, e nao queremos aumentar o contador
		 * nessa situacao.
		 */
		int pai   = ctx.getParent().getRuleIndex();
		int filho = ctx.getRuleIndex();

		//Se o pai nao for uma SubExpression
		if (pai != filho){
			contadorOpcoes++;

			armazena(RegraRegex.SUB_EXPRESSION, ctx.getText(), "Opção " + contadorOpcoes + ":", false);

			nivelAtual++;
			visitChildren(ctx);
			nivelAtual--;
		}

		//Se o pai for uma subexpressao
		else {

			visitChildren(ctx);
		}

		return null;
	}

	/** Quando visita um grupo, aumenta o contador de grupos,
	 *  traduz 'Grupo n:', aumenta o nivel de identacao
	 *  e visita todos os filhos dele. */
	@Override
	public Void visitGroup(GroupContext ctx) {

		contadorGrupos++;

		armazena(RegraRegex.GROUP, ctx.getText(), "Grupo " + contadorGrupos + ":", false);

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

		armazena(RegraRegex.START_ANCHOR, ctx.getText(), "No início do texto", true);

		return null;
	}

	/** Quando visita uma posicao de fim, traduz 'No final do texto'. */
	@Override
	public Void visitEndAnchor(EndAnchorContext ctx) {

		armazena(RegraRegex.END_ANCHOR, ctx.getText(), "No final do texto", true);

		return null;
	}

	/** Quando visita uma repeticao, visita o quantificador,
	 *  aumenta o nivel de identacao e visita a parte quantificada.
	 */
	@Override
	public Void visitRepetition(RepetitionContext ctx) {
		
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

		armazena(RegraRegex.ONE_OR_MORE, ctx.getText(), "Um ou mais:", false);

		return null;
	}

	/** Quando visita o quantificador '*', traduz 'Zero ou mais:'. */
	@Override
	public Void visitZeroOrMore(ZeroOrMoreContext ctx) {

		armazena(RegraRegex.ZERO_OR_MORE, ctx.getText(), "Zero ou mais:", false);

		return null;
	}

	/** Quando visita o quantificador '?', traduz 'Pode ou nao conter:'. */
	@Override
	public Void visitConditional(ConditionalContext ctx) {

		armazena(RegraRegex.CONDITIONAL, ctx.getText(), "Pode ou não conter:", false);

		return null;
	}

	/** Quando visita o quantificador {n}, recupera o valor de n
	 *  e traduz 'Exatamente n ocorrencias de:'. */
	@Override
	public Void visitExact(ExactContext ctx) {

		//Recupera o valor de 'n' como uma String
		String stringNumber = ctx.value().getText();

		//Converte o valor de 'n' encontrado para um numero interio
		int number = Integer.parseInt(stringNumber);

		armazena(RegraRegex.EXACT, ctx.getText(), "Exatamente " + stringNumber + " ocorrências de:", false, number);

		return null;
	}

	/** Quando visita o quantificador {n,}, recupera o valor de n
	 *  e traduz 'Pelo menos n ocorrencias de:'. */
	@Override
	public Void visitAtLeast(AtLeastContext ctx) {

		String stringNumber = ctx.value().getText();
		int number = Integer.parseInt(stringNumber);

		armazena(RegraRegex.AT_LEAST, ctx.getText(), "Pelo menos " + stringNumber + " ocorrências de:", false, number);

		return null;
	}

	/** Quando visita o quantificador {n,m}, recupera os valores de n e m
	 *  e traduz 'Entre n e m ocorrencias de:'. */
	@Override
	public Void visitBetween(BetweenContext ctx) {

		String stringFirstNumber = ctx.firstValue().getText();
		String stringLastNumber  = ctx.lastValue().getText();

		int firstNumber = Integer.parseInt(stringFirstNumber);
		int lastNumber  = Integer.parseInt(stringLastNumber);

		armazena(RegraRegex.BETWEEN, ctx.getText(), "Entre " + stringFirstNumber + " e " + stringLastNumber + " ocorrencias de:", false, firstNumber, lastNumber);

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

		armazena(RegraRegex.NEGATIVE_LIST, ctx.getText(), "Qualquer caractere que não seja:", false);

		nivelAtual++;
		visitChildren(ctx);
		nivelAtual--;

		return null;
	}

	/** Quando visita uma lista positiva, traduz
	 *  'Qualquer um dos caracteres:', aumenta o nivel de identacao
	 *  e visita todos os filhos dela. */
	@Override
	public Void visitPositiveList(PositiveListContext ctx) {

		armazena(RegraRegex.POSITIVE_LIST, ctx.getText(), "Qualquer um dos caracteres:", false);

		nivelAtual++;
		visitChildren(ctx);
		nivelAtual--;

		return null;
	}

	/**
	 * Quando visita uma colecao de elementos de lista,
	 * visita todos os filhos dela.
	 */
	@Override
	public Void visitListElements(ListElementsContext ctx) {

		visitChildren(ctx);

		return null;
	}

	/** Quando visita um primeiro elemento de lista,
	 *  visita todos os filhos dele.
	 */
	@Override
	public Void visitListFirstElement(ListFirstElementContext ctx) {

		visitChildren(ctx);

		return null;
	}

	/** Quando visita um caractere de lista que perdeu seu significado especial,
	 *  armazena o caractere.
	 */
	@Override
	public Void visitListNoSpecial(ListNoSpecialContext ctx) {

		armazena(RegraRegex.LIST_NO_SPECIAL, ctx.getText(), ctx.getText(), true);

		return null;
	}

	/** Quando visita uma serie de caracteres especial,
	 *  recupera o caractere da esquerda e o caractere da direita,
	 *  e traduz 'Todos os caracteres entre ESQUERDA e DIREITA'.
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

		//Recupera os caracteres
		String a = ctx.getChild(0).getText();
		String b = ctx.getChild(2).getText();

		armazena(RegraRegex.LIST_FIRST_RANGE, ctx.getText(), "Todos os caracteres entre '" + a + "' e '" + b + "'", true,a,b);

		return null;
	}

	/** Quando visita um elemento de lista, visita todos os filhos dele.
	 */
	@Override
	public Void visitListElement(ListElementContext ctx) {

		visitChildren(ctx);

		return null;
	}

	/** Quando visita o ultimo caractere de uma lista que perdeu
	 *  seu significado especial, armazena o caractere.
	 */
	@Override
	public Void visitListLastElement(ListLastElementContext ctx) {

		armazena(RegraRegex.LIST_LAST_ELEMENT, ctx.getText(), ctx.getText(), true);

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

		//Recupera os caracteres
		String a = ctx.getChild(0).getText();
		String b = ctx.getChild(2).getText();

		armazena(RegraRegex.RANGE, ctx.getText(), "Todos os caracteres entre '" + a + "' e '" + b + "'", true,a,b);

		return null;
	}

	/** Quando visita um caractere de lista, armazena o caractere.
	 */
	@Override
	public Void visitListCharacter(ListCharacterContext ctx) {

		armazena(RegraRegex.LIST_CHARACTER, ctx.getText(), ctx.getText(), true);

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

		armazena(RegraRegex.ALNUM, ctx.getText(), "Caracteres alfanuméricos", true);

		return null;
	}

	/** Quando visita uma classe alafabetica,
	 *  traduz 'Caracteres alfabeticos'. */
	@Override
	public Void visitAlpha(AlphaContext ctx) {

		armazena(RegraRegex.ALPHA, ctx.getText(), "Caracteres alfabéticos", true);

		return null;
	}

	/** Quando visita uma classe de espaco,
	 *  traduz 'Espaco e tabulacao'. */
	@Override
	public Void visitBlank(BlankContext ctx) {

		armazena(RegraRegex.BLANK, ctx.getText(), "Espaço e tabulação", true);

		return null;
	}

	/** Quando visita uma classe de controle,
	 *  traduz 'Caracteres de controle'. */
	@Override
	public Void visitCntrl(CntrlContext ctx) {

		armazena(RegraRegex.CNTRL, ctx.getText(), "Caracteres de controle", true);

		return null;
	}

	/** Quando visita uma classe de digitos,
	 *  traduz 'Digitos'. */
	@Override
	public Void visitDigitclass(DigitclassContext ctx) {

		armazena(RegraRegex.DIGIT_CLASS, ctx.getText(), "Dígitos", true);

		return null;
	}

	/** Quando visita uma classe de caracteres visiveis,
	 *  traduz 'Caracteres visiveis'. */
	@Override
	public Void visitGraph(GraphContext ctx) {

		armazena(RegraRegex.GRAPH, ctx.getText(), "Caracteres visíveis", true);

		return null;
	}

	/** Quando visita uma classe de letras minusculas,
	 *  traduz 'Letras minusculas'. */
	@Override
	public Void visitLower(LowerContext ctx) {

		armazena(RegraRegex.LOWER, ctx.getText(), "Letras minúsculas", true);

		return null;
	}

	/** Quando visita uma classe de caracteres imprimiveis,
	 *  traduz 'Caracteres visiveis e espaco'. */
	@Override
	public Void visitPrint(PrintContext ctx) {

		armazena(RegraRegex.PRINT, ctx.getText(), "Caracteres visíveis e espaço", true);

		return null;
	}

	/** Quando visita uma classe de pontucao,
	 *  traduz 'Caracteres de pontucao'. */
	@Override
	public Void visitPunct(PunctContext ctx) {

		armazena(RegraRegex.PUNCT, ctx.getText(), "Caracteres de pontuação", true);

		return null;
	}

	/** Quando visita uma classe de caracteres de espacamento,
	 *  traduz 'Caracteres brancos'. */
	@Override
	public Void visitSpaceclass(SpaceclassContext ctx) {

		armazena(RegraRegex.SPACE_CLASS, ctx.getText(), "Caracteres brancos", true);

		return null;
	}

	/** Quando visita uma classe de letras maiusculas,
	 *  traduz 'Letras maiusculas'. */
	@Override
	public Void visitUpper(UpperContext ctx) {

		armazena(RegraRegex.UPPER, ctx.getText(), "Letras maiúsculas", true);

		return null;
	}

	/** Quando visita uma classe de digitos hexadecimais,
	 *  traduz 'Numeros hexadecimais'. */
	@Override
	public Void visitXdigit(XdigitContext ctx) {

		armazena(RegraRegex.X_DIGIT, ctx.getText(), "Números hexadecimais", true);

		return null;
	}

	/** Quando visita um ponto,
	 *  traduz 'Qualquer caractere'. */
	@Override
	public Void visitAnychar(AnycharContext ctx) {

		armazena(RegraRegex.ANY_CHAR, ctx.getText(), "Qualquer caractere", true);

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
		
		armazena(RegraRegex.CHARACTERS, ctx.getText(), "Caracteres: " + semEscape, true);

		return null;
	}

	/** Quando visita um caractere, armazena o caractere .*/
	@Override
	public Void visitCharacter(CharacterContext ctx) {

		armazena(RegraRegex.CHARACTER, ctx.getText(), "Caracteres: " + ctx.getText(), true);

		return null;
	}

}
