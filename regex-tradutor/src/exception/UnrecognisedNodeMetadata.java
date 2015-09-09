package exception;

/**
 * @author tiso
 *
 */
public class UnrecognisedNodeMetadata extends Exception {

	private static final long serialVersionUID = 4072490455418228025L;

	public UnrecognisedNodeMetadata() {
		super();
	}

	public UnrecognisedNodeMetadata(String message) {
		super(message);
	}

	public UnrecognisedNodeMetadata(String message, Throwable cause) {
		super(message, cause);
	}

	public UnrecognisedNodeMetadata(Throwable cause) {
		super(cause);
	}
}
