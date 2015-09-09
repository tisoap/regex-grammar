package regex;

import gerado.RegularExpressionERELexer;
import gerado.RegularExpressionEREParser;
import gerado.RegularExpressionEREParser.ExpressionContext;

import java.io.IOException;

import org.antlr.v4.runtime.*;

import regex.erro.ErrorHandlerPortugues;
import regex.erro.ErrorListenerPortugues;

/**
 * Realiza a validacao e traducao para linguagem natural de
 * uma Expressao regular.<br>
 * <br>
 *
 * @author Tiso
 *
 */
public class Regex {

	// ----- VARIAVEIS -----

	/** A expressao regular enviada pelo usuario. */
	private String regularExpresion;

	/** Instancia do stream de caracteres criado a partir do texto
	 *  da expressao regular.*/
	private ANTLRInputStream input;

	/** Instancia do lexer da gramatica de expressoes regulares. */
	private RegularExpressionERELexer lexer;

	/** Instancia dos tokens reconhecidos pelo lexer. */
	private CommonTokenStream tokens;

	/** Instancia do parser da gramatica de expressoes regulares. */
	private RegularExpressionEREParser parser;

	/** Instancia da parse tree resultante da avaliacao do parser.
	 *  ExpressionContext é uma classe aninhada de RegularExpressionEREParser. */
	private ExpressionContext parseTreeContext = null;

	/** Instancia da classe responsavel pela traducao. */
	private Tradutor tradutor;

	/** Instancia da classe que contem o resultado de uma traducao. */
	private Traducao traducao;

	/** Listener de erros do parser. */
	private ErrorListenerPortugues errorListener;
	
	/** Mensagem de erro retornada pela validacao caso tenham
	 * ocorridos erros. */
	private String errorMessage = "";

	/** Posicao do erro retornada pela validacao caso tenham
	 * ocorridos erros.*/
	private String errorPosition = "";
	
	/** Indica se ocorreram erros durante a analise da expressao. */
	private boolean expressaoValida;

	// ----- GETTERS -----

	public boolean isExpressaoValida() {
		return expressaoValida;
	}
	public String getRegularExpresion() {
		return regularExpresion;
	}
	public Traducao getTraducao() {
		return traducao;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getErrorPosition(){
		return errorPosition;
	}

	// ----- SETTERS -----

	public void setRegularExpresion(String regularExpresion) {
		this.regularExpresion = regularExpresion;
	}


	// ----- CONSTRUTOR -----

	/**
	 * Construtor que inicializa as variaveis da classe.
	 *
	 * @param input Uma String que contem uma expressao regular
	 * @throws IOException
	 */
	public Regex(String input)
			throws IOException{

		//Armazena a expressao recebida
		setRegularExpresion(input);

		//Tenta incializar o parser e o lexer
		inicializar();
	}

	/**
	 * Construtor vazio. Utilizado pelas classes de teste JUnit.
	 */
	public Regex(){

	}


	// ----- METODOS -----

	/**
	 * Inicializa o parser e o lexer.
	 *
	 * @throws IOException
	 *  Sao utilizados arquivos de texto '.tokens'
	 *  com informacoes sobre os tokens aceitos pela gramatica,
	 *
	 *  Logo é possível que ocorra um erro de I/O.
	 */
	public void inicializar()
			throws IOException {

		//Cria um stream de chars a partir de um texto digitado pelo usuario
		/** ----- DS 4-5 ----- **/
		input  = new ANTLRInputStream(regularExpresion);

		//Cria um lexer que recebe o stream de chars
		/** ----- DS 6-7 ----- **/
		lexer  = new RegularExpressionERELexer(input);

		//Cria um stream de tokens a partir do lexer
		/** ----- DS 8-9 ----- **/
		tokens = new CommonTokenStream(lexer);

		//Cria um parser que recebe o stream de tokens
		/** ----- DS 10-11 ----- **/
		parser = new RegularExpressionEREParser(tokens);

		// Troca o Error Listener padrao do parser por um com mensagens em portugues
		parser.removeErrorListeners();

		/** ----- DS 12-13 ----- **/
		parser.addErrorListener(new ErrorListenerPortugues());

		// Troca o Error Handler padrao do parser por um com mensagens em portugues
		/** ----- DS 14-15 ----- **/
		parser.setErrorHandler(new ErrorHandlerPortugues());
	}

	/**
	 * Realiza a análise de estrutura da expressão regular,
	 * utilizando o parser. Gera uma árvore de análise.
	 *
	 * @return Falso se ocorreram erros durante o processo de análise.
	 * Verdadeiro caso contrário.
	 */
	private void analisar() {

		// Realiza a analise de estrutura,
		//começando pela regra inicial "expression"

		/** ----- DS 22-25 ----- **/
		parseTreeContext = parser.expression();

		/**
		 * Recupera o error listener utilizado pelo parser.
		 *
		 * Um parser pode ter mais de um error listener,
		 * mas no caso só existe um atrelado a ele,
		 * que é o ErrorListenerPortugues adcionado pelo
		 * metodo Inicializar() desta classe.
		 *
		 * Logo, só é necessário recuperar o primeiro
		 * error listener (primeiro indice incia em 0)
		 * e fazer um cast para ErrorListenerPortugues.
		 */

		/** ----- DS 26-27 ----- **/
		errorListener =
			(ErrorListenerPortugues) parser.getErrorListeners().get(0);

		//Recupera a mensagem de erro armazenada no error lisneter.
		//Sera uma string vazia se nao ocorreram erros.
		errorMessage = errorListener.getErrorMessage();
		
		//Recupera a mensagem indicando a posicao do erro
		//Sera um string vazia se nao ocorream erros.
		errorPosition = errorListener.getErrorPosition();
		
		//Recupera um valor booleano que indica se a expressao
		//ocorreram erros durante a analize da expressao.
		expressaoValida = !errorListener.isErro();
	}
	
	public boolean validar(){
		
		analisar();
		
		return expressaoValida;
	}

	/**
	 * Realiza a traducao da expressao.
	 *
	 * @return Um objeto com o resultado da traducao.
	 */
	public Traducao traduzir(){

		//Cria uma nova instancia da classe responsavel pela traducao
		/** ----- DS 18 ----- **/
		tradutor = new Tradutor();

		//Cria a arvore de análise e retorna um boolean
		//indicando se ocorreram erros durante o processo.
		expressaoValida = validar();

		//Cria a traducao da expressao, utilizando a arvore de análise gerada
		/** ----- DS 30-35 ----- **/
		traducao = tradutor.traduzir(parseTreeContext);

		//Se ocorreran erros durante a analise, armazena as informacoes dos erros
		if (!expressaoValida){
			
			//Popula o objeto traducao com as informacoes de erro
			traducao.setOcorreuErro(true);
			traducao.setMensagemErro(errorMessage);
			traducao.setPosicaoErro(errorPosition);
		}

		return traducao;
	}

	/**
	 * Imprime a parse tree no console em forma
	 * de listas estilo LISP. Para testes apenas.
	 */
	public void parseTreeList(){
		analisar();
		System.out.println(parseTreeContext.toStringTree());
	}

	/**
	 * Exibe uma janela com uma representacao grafica da parse tree.
	 * Para testes apenas.
	 */
	public void parserTreeGui(){

		analisar();

		//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
		//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		parseTreeContext.inspect(parser);
	}

}
