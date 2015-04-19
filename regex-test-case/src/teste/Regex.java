package teste;

import gerado.RegularExpressionERELexer;
import gerado.RegularExpressionEREParser;
import gerado.RegularExpressionEREParser.ExpressionContext;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import teste.erro.ErrorHandlerPortugues;
import teste.erro.ErrorListenerVerboso;

public class Regex {
	
	private RegularExpressionEREParser posixParser;
	private ExpressionContext expressionContext;
	
	public RegularExpressionEREParser getPosixParser() {
		return posixParser;
	}

	public ExpressionContext getExpContext() {
		return expressionContext;
	}
	
	public void setPosixParser(RegularExpressionEREParser posixParser) {
		this.posixParser = posixParser;
	}

	public void setExpContext(ExpressionContext expContext) {
		this.expressionContext = expContext;
	}
	
	public Regex(String input, String opcao) throws IOException {
		 
		//Recebe uma string do usuario pelo terminal e inicializa a parse tree
		criarParseTree(input);
		
		//Checa se foram passados argumentos
		if (!opcao.isEmpty()){
			
			//Se o 1o argumento  for '-list', exibe a parse tree em forma de lista
			if (opcao.equals("-list")) imprimirParseTree(expressionContext);
			
			//Se o 1o argumento for '-gui', exibe a parse tree de forma grafica
			else if (opcao.equals("-gui")) parserTreeGui(expressionContext, posixParser);
			
			//Caso contrario, traduza a entrada do usuario
			else traduzirVisitor(expressionContext);
		}
		
		//Se nao foram passados argumentos, traduza a entrada do usuario
		else traduzirVisitor(expressionContext);
	}
	 
	 /** 
	  * Inicializa o parser, lexer, e cria a parse tree a partir da
	  * entrada do usuario.
	 * @throws IOException
	  */
	private void criarParseTree(String input) throws IOException {
		
		// Cria um stream de chars a partir de um texto digitado pelo usuario
		ANTLRInputStream inputAntrl = new ANTLRInputStream(input);
		
		// Cria um lexer que recebe o stream de chars
		RegularExpressionERELexer lexer = new RegularExpressionERELexer(inputAntrl);
		
		// Cria um stream de tokens retirados do lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		RegularExpressionEREParser parser = new RegularExpressionEREParser(tokens);
		
		// Remove o listener de erros padrao do parser
		parser.removeErrorListeners();
		
		// Adciona um listener de erros customizado
		parser.addErrorListener(new ErrorListenerVerboso());
		
		//Troca o Error Handler padrao por um com mensagens em portugues
		parser.setErrorHandler(new ErrorHandlerPortugues());
		
		// Cria a ParseTree comecando pela regra inicial 'expression'
		ExpressionContext expContext = parser.expression();
		
		// Seta as variaveis privadas da classe
		setPosixParser(parser);
		setExpContext(expContext);
	}
	
	/**
	 * Imprime a parse tree no console em forma de listas estilo LISP
	 * @param tree Uma parse tree
	 */
	private void imprimirParseTree(ParseTree tree){
		
		System.out.println("");
		System.out.println(tree.toStringTree());
		System.out.println("");
	}
	
	/**
	 * Realiza a traducao da arvore usando um parse tree visitor,
	 * imprimindo os resultados no console.
	 * @param tree Uma parse tree
	 */
	private void traduzirVisitor(ParseTree tree){
		
		Tradutor visitor = new Tradutor();
		
		System.out.println("");
		visitor.visit(tree);
		System.out.println("");
	}
	
	/** 
	 * Exibe uma janela com uma representacao grafica da parse tree.
	 * @param tree A parse tree
	 * @param parser O parser que gerou a parse tree
	 */
	private void parserTreeGui(ExpressionContext tree, RegularExpressionEREParser parser){
		
		//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
		//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		tree.inspect(parser);
	}

}
