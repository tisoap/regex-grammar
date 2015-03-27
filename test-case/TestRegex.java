import org.antlr.v4.runtime.*;   
import org.antlr.v4.runtime.tree.*;

public class TestRegex {
	
	public static void main(String [] args) throws Exception {
		
		// Cria um stream de chars que le da entrada padrao (no caso o terminal)
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// Cria um lexer que recebe o stream de chars
		RegularExpressionLexer lexer = new RegularExpressionLexer(input);
		
		// Cria um stream de tokens retirados do lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Cria um parser que recebe o stream de tokens
		RegularExpressionParser parser = new RegularExpressionParser(tokens);
		
		// Cria a ParseTree comecando pela regra 'expression'
		ParseTree tree = parser.expression();
		
		// Imprime a ParseTree resultante em formato de lista estilo LISP
		//System.out.println(tree.toStringTree(parser));
		
		// Cria um 'andador' de arvore que pode chamar callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		
		// Ande pela arvore, usando o TestRegexListener para escutar os callbacks
		walker.walk(new TestRegexListener(), tree);
	}

}
