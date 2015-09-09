package exception;

/**
 * Excecao utilizada quando nao existem metadados "userdata" em
 * um objeto JSON.
 *
 * @author tiso
 *
 */
public class NonExistentMetadata extends MalformedJson {

	private static final long serialVersionUID = -13070820269824768L;

	public NonExistentMetadata() {
		super();
	}

	public NonExistentMetadata(String message) {
		super(message);
	}

	public NonExistentMetadata(String message, Throwable cause) {
		super(message, cause);
	}

	public NonExistentMetadata(Throwable cause) {
		super(cause);
	}

}
