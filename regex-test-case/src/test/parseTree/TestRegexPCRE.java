package test.parseTree;

import generated.regexPCRE.RegularExpressionPCRELexer;
import generated.regexPCRE.RegularExpressionPCREParser;
import generated.regexPCRE.RegularExpressionPCREParser.ExpressionContext;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import test.listeners.TestRegexListenerERE;

public class TestRegexPCRE {
	
	private RegularExpressionPCREParser pcreParser;
	private ExpressionContext exprContext;
	
	
	public RegularExpressionPCREParser getPcreParser() {
		return pcreParser;
	}

	public ExpressionContext getExprContext() {
		return exprContext;
	}

	public void setExprContext(ExpressionContext exprContext) {
		this.exprContext = exprContext;
	}
	
	public void setPcreParser(RegularExpressionPCREParser pcreParser) {
		this.pcreParser = pcreParser;
	}
	

	public TestRegexPCRE(String input, String opcao) throws IOException {
		
		//Recebe uma string do usuario pelo terminal e inicializa a parse tree
		criarParseTree(input);
		
		//Checa se foram passados argumentos
		if (!opcao.equals(null)){
			
			//Se o 1o argumento  for '-list', exibe a parse tree em forma de lista
			if (opcao.equals("-list")) imprimirParseTree(exprContext);
			
			//Se o 1o argumento for '-gui', exibe a parse tree de forma grafica
			else if (opcao.equals("-gui")) parserTreeGui(exprContext, pcreParser);
			
			//Caso contrario, traduza a entrada do usuario
			else traduzirListener(exprContext);
		}
		
		//Se nao foram passados argumentos, traduza a entrada do usuario
		else traduzirListener(exprContext);
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
		RegularExpressionPCRELexer lexer = new RegularExpressionPCRELexer(inputAntrl);
		
		// Cria um stream de tokens retirados do lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		RegularExpressionPCREParser parser = new RegularExpressionPCREParser(tokens);
		setPcreParser(parser);
		
		// Cria a ParseTree comecando pela regra inicial 'expression'
		ExpressionContext tree = parser.expression();
		setExprContext(tree);
		
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
	 * Realiza a traducao da arvore usando um parse tree walker e um listener,
	 * imprimindo os resultados no console.
	 * @param tree Uma parse tree
	 */
	private void traduzirListener(ParseTree tree){
		
		// Cria um 'andador' de arvore que pode chamar callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		System.out.println("");
		
		// Ande pela arvore, usando o TestRegexListener para escutar os callbacks
		// e imprimir os resultados na tela
		walker.walk(new TestRegexListenerERE(), tree);
		
		System.out.println("");
	}
	
	/** 
	 * Exibe uma janela com uma representacao grafica da parse tree.
	 * @param tree A parse tree
	 * @param parser O parser que gerou a parse tree
	 */
	private void parserTreeGui(ExpressionContext tree, RegularExpressionPCREParser parser){
		
		//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
		//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		tree.inspect(parser);
	}

}
