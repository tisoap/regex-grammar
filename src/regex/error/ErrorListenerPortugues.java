package regex.error;

import org.antlr.v4.runtime.*;

/**
 * Error listener que sobrepoe o metodo padrao para armazenar
 * informacoes sobre o erro.
 */
public class ErrorListenerPortugues extends BaseErrorListener {


	//----- VARIAVEIS -----

	/** Texto com a mensagem de erro. */
	private String errorMessage = "";

	/** Texto com a expressao original e uma linha extra com '^',
	 *  indicando os caracteres problematicos no texto original. */
	private String errorPosition = "";

	/** Indica se ocorreu ou nao um erro. */
	private boolean erro = false;


	//----- GETTERS -----

	/**
	 *
	 * @return
	 *  Valor boleano que indica se ocorreram ou não erros
	 *  durante o processo de criação da árvore de análise.
	 */
	public boolean isErro() {
		return erro;
	}

	/**
	 *
	 * @return
	 *  String contendo a mensagem de erro retornada pelo
	 *  parser durante a análise. Será vazia se não ocorreram erros.
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 *
	 * @return
	 *  String contendo o texto da expressão regular
	 *  original em uma linha, e na segunda linha uma serie
	 *  de '^' (acento circumflexo) residindo nas mesmas posicoes
	 *  onde foram identificados erros na expressão. Será
	 *  vazia se não ocorreram erros.<br>
	 *  <br>
	 *  Este texto só será útil se exibido em fonte
	 *  monoespaçada.
	 */
	public String getErrorPosition() {
		return errorPosition;
	}


	//----- METODOS -----

	/**
	 * Imprime a mensagem de erro no console e levanta uma
	 * execao do tipo RuntimeException.
	 */
	@Override
	public void syntaxError(
			Recognizer<?, ?> recognizer,
			Object offendingSymbol,
			int line,
			int charPositionInLine,
			String msg,
			RecognitionException e) {

		erro = true;

		//Troca a mensagem de erro padrão de predicador semantico
		//por uma em portugues.
		if (e instanceof FailedPredicateException)
			errorMessage = "Os valores inseridos não são válidos.";
		else
			errorMessage = msg;

		errorPosition = underlineError(recognizer, (Token) offendingSymbol, line, e);

	}

	/**
	* Indica a posicao do caractere problematico no texto original
	* colocando '^' imediatamente abaixo dele.
	*
	* @param recognizer
	* @param offendingToken
	* @param line
	* @param charPositionInLine
	*/
	protected String underlineError (
			Recognizer<?, ?> recognizer,
			Token offendingToken,
			int line,
			RecognitionException e){

		int start;
		int stop;

		CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
		String input = tokens.getTokenSource().getInputStream().toString();
		String[] lines = input.split("\n");
		String errorLine = lines[line - 1];

		if (e instanceof NoViableAltException) {
			start = ((NoViableAltException) e).getStartToken().getStartIndex();
			stop = ((NoViableAltException) e).getOffendingToken().getStopIndex();
		}
		else if (e instanceof FailedPredicateException){

			start = ((FailedPredicateException) e).getPredIndex();
			stop = ((FailedPredicateException) e).getOffendingToken().getStopIndex() - 1;
		}
		else {
			start = offendingToken.getStartIndex();
			stop = offendingToken.getStopIndex();
		}

		StringBuffer buffer = new StringBuffer();


		if (start>=0 && stop>=0){

			buffer.append(errorLine);
			buffer.append("\n");

			if (start <= stop) {

				for (int i=0; i<start; i++)
					buffer.append(" ");

				for (int i=start; i<=stop; i++)
					buffer.append("^");
			}
		}

		buffer.append("\n");

		return buffer.toString();
	}

}