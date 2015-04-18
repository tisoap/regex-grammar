package teste.erro;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * Error handler que sobrepoe os metodos padrao para utilizar
 * mensagens em portugues.
 */
public class ErrorHandlerPortugues extends DefaultErrorStrategy {

	@Override
	protected void reportNoViableAlternative(
			Parser recognizer,
			NoViableAltException e)
	{
		
		TokenStream tokens = recognizer.getInputStream();
		
		String input;
		
		if ( tokens!=null ) {
			if ( e.getStartToken().getType()==Token.EOF ) input = "<fim de arquivo>";
			else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
		}
		else input = "<desconhecido>";
		
		String msg = "Nenhuma alternativa viável na entrada " + escapeWSAndQuote(input);
		
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}
	
	@Override
	protected void reportInputMismatch(
			Parser recognizer,
			InputMismatchException e)
	{
		
		String msg = "Entrada errada " + getTokenErrorDisplay(e.getOffendingToken()) + 
		" estava esperando por um destes elementos: " + e.getExpectedTokens().toString(recognizer.getVocabulary());
		
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}
	
	@Override
	protected void reportUnwantedToken(Parser recognizer) {
		
		if (inErrorRecoveryMode(recognizer)) return;

		beginErrorCondition(recognizer);

		Token t = recognizer.getCurrentToken();
		
		String tokenName = getTokenErrorDisplay(t);
		
		IntervalSet expecting = getExpectedTokens(recognizer);
		
		String msg = "Entrada adcional " + tokenName + " estava esperando por " +
			expecting.toString(recognizer.getVocabulary());
		
		recognizer.notifyErrorListeners(t, msg, null);
	}
	
	@Override
	protected void reportMissingToken(Parser recognizer) {
		
		if (inErrorRecoveryMode(recognizer)) return;

		beginErrorCondition(recognizer);

		Token t = recognizer.getCurrentToken();
		
		IntervalSet expecting = getExpectedTokens(recognizer);
		
		String msg = " Está faltando " + expecting.toString(recognizer.getVocabulary()) +
			" em " + getTokenErrorDisplay(t);

		recognizer.notifyErrorListeners(t, msg, null);
	}
	
}
