package test.errorReporting;

import org.antlr.v4.runtime.*;
import java.util.*;

/**
 * Error listener que imprime a pilha de invocacao de regras 
 * seguido pela mensagem de erro usual, melhorada com informacoes do
 * token problematico.
 */
public class VerboseListener extends BaseErrorListener {
	
	@Override
	public void syntaxError(
		Recognizer<?, ?> recognizer,
		Object offendingSymbol,
		int line, int charPositionInLine,
		String msg,
		RecognitionException e)
	{
		
		//Pilha de invocacao de regras
	    List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
	    
	    //Inverte a pilha para facilitar a leitura
	    Collections.reverse(stack);
	    
	    //Imprime a mensagem de erro padrao
	    System.err.println(msg);
	    
	    //Imprime o local do caractere problematico
	    System.err.println(
	    		"Linha " + line + ", caractere " +
	    		charPositionInLine + " em " + 
	    		offendingSymbol);
	    
	    //Imprime a pilha
	    System.err.println("Pilha de regras: " + stack);
	    
    }
	
}
