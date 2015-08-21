package exception;

/**
 * Excecao utilizada quando o valor de um metadado do tipo "regra"
 * nao e reconhecido pela aplicacao.
 * 
 * @author tiso
 *
 */
public class UnrecognisedRule extends MalformedJson {
	
	private static final long serialVersionUID = 8002399404074649275L;
	
	public UnrecognisedRule() {
		super();
	}
	
	public UnrecognisedRule(String message) {
		super(message);
	}
	
	public UnrecognisedRule(String message, Throwable cause) {
		super(message, cause);
	}
	public UnrecognisedRule(Throwable cause) {
		super(cause);
	}
}
