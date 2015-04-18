package teste.erro;

import org.antlr.v4.runtime.*;

/**
 * Error listener que sobrepoe os metodos padrao para,
 * alem da mensagem de erro usual, imprimir a localizacao 
 * do token problematico.
 */
public class ErrorListenerVerboso extends BaseErrorListener {
	
	@Override
	public void syntaxError(
			Recognizer<?, ?> recognizer,
			Object offendingSymbol,
			int line, int charPositionInLine,
			String msg,
			RecognitionException e)
	{
	    //Imprime a mensagem de erro padrao
	    System.err.println(msg);
	    
	    //Imprime o local do caractere problematico
	    System.err.println(
	    		"Caractere " +
	    		charPositionInLine + " na regra " + 
	    		offendingSymbol);
    }
	
}
