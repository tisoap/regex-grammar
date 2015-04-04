package test.parseTree;

import generated.regexPerl.RegularExpressionPerlLexer;
import generated.regexPerl.RegularExpressionPerlParser;
import generated.regexPerl.RegularExpressionPerlParser.ExpressionContext;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import test.listeners.TestRegexListenerERE;

public class TestRegexPerl {
	
	private RegularExpressionPerlParser posixParser;
	private RegularExpressionPerlParser.ExpressionContext tree;
	
	
	/** Getters */
	
	public ExpressionContext getTree() {
		return tree;
	}

	public RegularExpressionPerlParser getParser() {
		return posixParser;
	}
	
	
	/** Setters */

	public void setParser(RegularExpressionPerlParser parser) {
		this.posixParser = parser;
	}
	
	public void setTree(ExpressionContext tree) {
		this.tree = tree;
	}
	

	/** 
	 * Usuario digita pela entrada de texto padrao uma expressao regular,
	 * seguido de uma quebra de linha e o caractere de fim de arquivo (EOF). Como resultado,
	 * e imprimido na tela uma versao em estrutura de arvore e linguagem natural da
	 * expressao.<br>
	 * <br>
	 * O argumento -gui exibe uma representacao grafica da parse tree gerada.<br>
	 * <br>
	 * O argumento -list exibe a parse tree em forma de lista.<br>
	 * <br>
	 * EOF: no Windows Ctrl+Z, em Unix Ctrl+D 
	 * @param opcao Opcional, aceita argumentos -gui ou -list
	 * @throws IOException */
	 public TestRegexPerl(String opcao) throws IOException {

		//Recebe uma string do usuario pelo terminal e inicializa a parse tree
		criarParseTree();
		
		//Checa se foram passados argumentos
		if (!opcao.equals(null)){
			
			//Se o 1o argumento  for '-list', exibe a parse tree em forma de lista
			if (opcao.equals("-list")) imprimirParseTree(tree);
			
			//Se o 1o argumento for '-gui', exibe a parse tree de forma grafica
			else if (opcao.equals("-gui")) parserTreeGui(tree, posixParser);
			
			//Caso contrario, traduza a entrada do usuario
			else traduzirListener(tree);
		}
		
		//Se nao foram passados argumentos, traduza a entrada do usuario
		else traduzirListener(tree);
	}
	 
	 /** 
	  * Inicializa o parser, lexer, e cria a parse tree a partir da
	  * entrada do usuario.
	 * @throws IOException
	  */
	private void criarParseTree() throws IOException {
		
		// Cria um stream de chars a partir de um texto digitado pelo usuario
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// Cria um lexer que recebe o stream de chars
		RegularExpressionPerlLexer lexer = new RegularExpressionPerlLexer(input);
		
		// Cria um stream de tokens retirados do lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		RegularExpressionPerlParser parser = new RegularExpressionPerlParser(tokens);
		setParser(parser);
		
		// Cria a ParseTree comecando pela regra inicial 'expression'
		RegularExpressionPerlParser.ExpressionContext tree = parser.expression();
		setTree(tree);
		
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
	private void parserTreeGui(ExpressionContext tree, RegularExpressionPerlParser parser){
		
		//http://stackoverflow.com/questions/29353114/running-antrl-testrig-gui-from-within-a-java-application
		//http:/www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		tree.inspect(parser);
	}

}
