package exception;

/**
 * Excecao utilizada quando um metadado "userdata" de um objeto
 * JSON nao esta no padrao aceito pela biblioteca DHTMLX Tree.
 * <br>
 * O formato aceito pode ser visto nesta pagina:<br>
 * http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
 */
public class MalformedMetadata extends MalformedJson {

	private static final long serialVersionUID = -8307807954745919831L;

	public MalformedMetadata() {
		super();
	}

	public MalformedMetadata(String message) {
		super(message);
	}

	public MalformedMetadata(String message, Throwable cause) {
		super(message, cause);
	}

	public MalformedMetadata(Throwable cause) {
		super(cause);
	}

}
