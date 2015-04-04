package test;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import regexGrammar.RegularExpressionLexer;
import regexGrammar.RegularExpressionParser;
import regexGrammar.RegularExpressionParser.ExpressionContext;

public class TestRegex {
	
	private static RegularExpressionParser parser;
	private static ExpressionContext tree;
	
	public static ExpressionContext getTree() {
		return tree;
	}

	public static void setTree(ExpressionContext tree) {
		TestRegex.tree = tree;
	}

	public static RegularExpressionParser getParser() {
		return parser;
	}

	public static void setParser(RegularExpressionParser parser) {
		TestRegex.parser = parser;
	}

	/** 
	 * Metodo principal para testes com a gramatica.<br>
	 * <br>
	 * Usuario digita pela entrada de texto padrao uma expressao regular,
	 * seguido de uma quebra de linha e o caractere de fim de arquivo (EOF). Como resultado,
	 * e imprimido na tela uma versao em estrutura de arvore e linguagem natural da
	 * expressao.<br>
	 * <br>
	 * EOF: no Windows Ctrl+Z, em Unix Ctrl+D 
	 * @throws Exception */
	 public static void main(String[] args) throws Exception {

		criarParseTree();
		 
		if (args.length > 0){
			if (args[0].equals("-list"))
				imprimirParseTree(tree);
			else if (args[0].equals("-gui"))
				parserTreeGui(tree, parser);
			else 
				traduzirListener(tree);
		}
		else traduzirListener(tree);

	}
	 
	 /** 
	  * Inicializa o parser, lexer, e cria a parse tree a partir da
	  * entrada do usuario.
	 * @throws IOException
	  */
	public static void criarParseTree() throws IOException {
		
		// Cria um stream de chars a partir de um texto digitado pelo usuario
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// Cria um lexer que recebe o stream de chars
		RegularExpressionLexer lexer = new RegularExpressionLexer(input);
		
		// Cria um stream de tokens retirados do lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		RegularExpressionParser parser = new RegularExpressionParser(tokens);
		setParser(parser);
		
		// Cria a ParseTree comecando pela regra 'expression'
		ExpressionContext tree = parser.expression();
		setTree(tree);
		
	}
	
	/**
	 * Imprime a parse tree no console em forma de listas estilo LISP
	 */
	public static void imprimirParseTree(ParseTree tree){
		System.out.println("");
		System.out.println(tree.toStringTree());
		System.out.println("");
	}
	
	/**
	 * Realiza a traducao da arvore usando um parse tree walker e um listener,
	 * imprimindo os resultados no console.
	 */
	public static void traduzirListener(ParseTree tree){
		// Cria um 'andador' de arvore que pode chamar callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		System.out.println("");
		
		// Ande pela arvore, usando o TestRegexListener para escutar os callbacks
		// e imprimir os resultados na tela
		walker.walk(new TestRegexListener(), tree);
		
		System.out.println("");
	}
	
	/** 
	 * Exibe uma janela com uma representacao grafica da parse tree
	 * @param tree A parse tree
	 * @param parser O parser que gerou a parse tree
	 */
	public static void parserTreeGui(ExpressionContext tree, RegularExpressionParser parser){
		/**
		 * http://www.antlr.org/api/JavaTool/org/antlr/v4/runtime/RuleContext.html#inspect%28org.antlr.v4.runtime.Parser%29
		 */
		tree.inspect(parser);
	}

}
