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
	
	/** String com a expressao regular enviada pelo usuario. */
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
	
	
	// ----- GETTERS -----
	
	public String getRegularExpresion() {
		return regularExpresion;
	}
	public ANTLRInputStream getInput() {
		return input;
	}
	public RegularExpressionERELexer getLexer() {
		return lexer;
	}
	public CommonTokenStream getTokens() {
		return tokens;
	}
	public RegularExpressionEREParser getParser() {
		return parser;
	}
	public ExpressionContext getParseTreeContext() {
		return parseTreeContext;
	}
	public Tradutor getTradutor() {
		return tradutor;
	}
	public Traducao getTraducao() {
		return traducao;
	}
	
	
	// ----- SETTERS -----
	
	public void setRegularExpresion(String regularExpresion) {
		this.regularExpresion = regularExpresion;
	}
	public void setInput(ANTLRInputStream input) {
		this.input = input;
	}
	public void setLexer(RegularExpressionERELexer lexer) {
		this.lexer = lexer;
	}
	public void setTokens(CommonTokenStream tokens) {
		this.tokens = tokens;
	}
	public void setParser(RegularExpressionEREParser parser) {
		this.parser = parser;
	}
	public void setParseTreeContext(ExpressionContext parseTreeContext) {
		this.parseTreeContext = parseTreeContext;
	}
	public void setTradutor(Tradutor tradutor) {
		this.tradutor = tradutor;
	}
	public void setTraducao(Traducao traducao) {
		this.traducao = traducao;
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
		input  = new ANTLRInputStream(regularExpresion);
		
		//Cria um lexer que recebe o stream de chars
		lexer  = new RegularExpressionERELexer(input);
		
		//Cria um stream de tokens a partir do lexer
		tokens = new CommonTokenStream(lexer);
		
		//Cria um parser que recebe o stream de tokens
		parser = new RegularExpressionEREParser(tokens);
		
		//Troca o Error Listener padrao do parser por um com mensagens em portugues
		parser.removeErrorListeners();
		parser.addErrorListener(new ErrorListenerPortugues());
		
		//Troca o Error Handler padrao do parser por um com mensagens em portugues		
		parser.setErrorHandler(new ErrorHandlerPortugues());
	}
	
	/**
	 * Realiza a análise de estrutura da expressão regular,
	 * utilizando o parser. Gera uma árvore de análise.
	 * 
	 * @return Falso se ocorreram erros durante o processo de análise.
	 * Verdadeiro caso contrário.
	 */
	public boolean validar() {
		
		//Realiza a analise de estrutura
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
		errorListener = 
			(ErrorListenerPortugues) parser.getErrorListeners().get(0);
		
		//Verifica se ocorreram erros
		if (errorListener.isErro())
			return false;
		else
			return true;
	}
	
	/**
	 * Realiza a traducao da expressao.
	 * 
	 * @return Um objeto com o resultado da traducao.
	 */
	public Traducao traduzir(){
		
		//Cria uma nova instancia da classe responsavel pela traducao
		tradutor = new Tradutor();
		
		//Cria a arvore de análise e retorna um boolean
		//indicando se ocorreram erros durante o processo.
		boolean semErroAnalise = validar();
		
		//Cria a traducao da expressao, utilizando a arvore de análise gerada
		traducao = tradutor.traduzir(parseTreeContext);
		
		//Se ocorreran erros durante a analise, armazena as informacoes dos erros
		if (!semErroAnalise){
			
			//Recupera a mensagem de erro do listener
			String erro = errorListener.getErrorMessage();
			
			//Recupera a mensagem indicando a posicao do erro
			String posicao = errorListener.getErrorPosition();
			
			//Popula o objeto traducao com as informacoes de erro
			traducao.setOcorreuErro(true);
			traducao.setMensagemErro(erro);
			traducao.setPosicaoErro(posicao);
		}
		
		return traducao;
	}
	
	/**
	 * Imprime a parse tree no console em forma
	 * de listas estilo LISP. Para testes apenas.
	 */
	public void parseTreeList(){
		
		System.out.println();
		
		validar();
		
		System.out.println(parseTreeContext.toStringTree());
		
		System.out.println();
	}
	
	/** 
	 * Exibe uma janela com uma representacao grafica da parse tree.
	 * Para testes apenas.
	 */
	public void parserTreeGui(){
		
		validar();
		
		//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
		//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		parseTreeContext.inspect(parser);
	}
	
}
