package exception;

/**
 * Excecao utilizada quando e encontrado um no nao terminal
 * no JSON e este nao possui filhos.
 *
 * @author tiso
 *
 */
public class ParentWithNoChildren extends MalformedJson {

	private static final long serialVersionUID = 4633030648062383789L;

	public ParentWithNoChildren() {
		super();
	}

	public ParentWithNoChildren(String message) {
		super(message);
	}

	public ParentWithNoChildren(String message, Throwable cause) {
		super(message, cause);
	}

	public ParentWithNoChildren(Throwable cause) {
		super(cause);
	}

}
