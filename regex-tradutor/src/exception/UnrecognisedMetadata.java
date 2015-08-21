package exception;

/**
 * Excecao utilizada quando um metadado "userdata" de
 * um objeto JSON nao e reconhecido pela aplicacao.
 * 
 * @author tiso
 *
 */
public class UnrecognisedMetadata extends MalformedJson {
	
	private static final long serialVersionUID = 4072490455418228025L;
	
	public UnrecognisedMetadata() {
		super();
	}
	
	public UnrecognisedMetadata(String message) {
		super(message);
	}
	
	public UnrecognisedMetadata(String message, Throwable cause) {
		super(message, cause);
	}
	public UnrecognisedMetadata(Throwable cause) {
		super(cause);
	}
}
