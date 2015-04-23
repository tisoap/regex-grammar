package teste;

import gerado.RegularExpressionERELexer;
import gerado.RegularExpressionEREParser;
import gerado.RegularExpressionEREParser.ExpressionContext;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import teste.erro.ErrorHandlerPortugues;

//TODO Criar metodo que retorna um Transfer Object

/**
 * Realiza a validacao e traducao para linguagem natural de
 * uma Expressao regular.
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
	
	/** Instancia da parse tree resultante da avaliacao do parser. */
	private ExpressionContext parseTreeContext = null;
	
	/** Instancia da classe responsavel pela traducao. */
	private Tradutor tradutor;
	
	
	// ----- GETTERS ----- 
	
	public RegularExpressionEREParser getParser() {
		return parser;
	}

	/** Sera nulo se o metodo validar() nao foi executado. */
	public ExpressionContext getParseTreeContext() {
		return parseTreeContext;
	}

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
	
	/** Sera nulo se o metodo traduzir() nao foi executado. */
	public Tradutor getVisitor() {
		return tradutor;
	}
	
	
	// ----- SETTERS ----- 
	
	public void setParser(RegularExpressionEREParser parser) {
		this.parser = parser;
	}

	public void setParseTreeContext(ExpressionContext parseTreeContext) {
		this.parseTreeContext = parseTreeContext;
	}

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
	
	public void setVisitor(Tradutor visitor) {
		this.tradutor = visitor;
	}
	
	
	// ----- CONSTRUTOR ----- 
	
	/**
	 * Construtor que inicializa as variaveis da classe.
	 * 
	 * @param input Uma String que contem uma expressao regular
	 */
	public Regex(String input){
		
		//Armazena a expressao recebida
		setRegularExpresion(input);
		
		
		try {
			//Tenta incializar o parser e o lexer 
			inicializar();
		
		} catch (IOException e) {
			
			//Imprime uma mensagem de erro se nao conseguir carregar os arquivos necessarios
			
			System.err.println("Erro de disco ao tentar carregar os arquivos '.tokens'");
			e.printStackTrace();
		}
	}
	
	
	// ----- METODOS ----- 
	
	/** 
	 * Inicializa o parser e o lexer.
	 * 
	 * @throws IOException 
	 *  Este metodo utiliza arquivos texto '.tokens'
	 *  com informacoes sobre os tokens aceitos pela gramatica.
	 */
	private void inicializar()
			throws IOException {
		
		// Cria um stream de chars a partir de um texto digitado pelo usuario
		input  = new ANTLRInputStream(regularExpresion);
		
		// Cria um lexer que recebe o stream de chars
		lexer  = new RegularExpressionERELexer(input);
		
		// Cria um stream de tokens retirados do lexer
		tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		parser = new RegularExpressionEREParser(tokens);
		
		// Troca o Error Handler padrao do parser por um com mensagens em portugues
		parser.setErrorHandler(new ErrorHandlerPortugues());
	}
	
	/**
	 * Avalia a expressao regular recebida.
	 * Se estiver correta, inicializa a parse tree.
	 * Se estiver errada, levanta uma excecao.
	 * 
	 * @throws Exception
	 */
	public void validar()
			throws Exception {
		
		//Tenta criar a parse tree, comencando pela regra inicial 'expression'
		parseTreeContext = parser.expression();
	}
	
	/**
	 * Realiza a traducao da expressao, fazendo uso da parse tree
	 * gerada pelo metodo validar().
	 */
	public void traduzir(){
		
		//Cria uma nova instancia da classe responsavel pela traducao
		tradutor = new Tradutor();
		
		System.out.println("");
		
		if (parseTreeContext.equals(null))
			System.err.println("Necessario ter executado o metodo validar() antes de traduzir.");
		else
			//Inicia a traducao da expressao, utilizando a parse tree
			tradutor.visit(parseTreeContext);
		
		System.out.println("");
	}
	
	/**
	 * Imprime a parse tree no console em forma
	 * de listas estilo LISP. Para testes apenas.
	 */
	public void parseTreeList(){
		
		System.out.println("");
		
		if (parseTreeContext.equals(null))
			System.err.println("Necessario ter executado o metodo validar() antes de imprimir a lista.");
		else
			System.out.println(parseTreeContext.toStringTree());
		
		System.out.println("");
	}
	
	/** 
	 * Exibe uma janela com uma representacao grafica da parse tree.
	 * Para testes apenas.
	 */
	public void parserTreeGui(){
		
		if (parseTreeContext.equals(null))
			System.err.println("Necessario ter executado o metodo validar() antes de exibir a parse tree.");
		else
			//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
			//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
			parseTreeContext.inspect(parser);
	}
	
}
