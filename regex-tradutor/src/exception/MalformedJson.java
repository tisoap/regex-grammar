package exception;

/**
 * Execao utilizada quando um objeto JSON recebido pela classe
 * Construtor nao esta no formato aceito pela biblioteca
 * DHTMLX Tree.<br>
 * <br>
 * O formato aceito pode ser visto nesta pagina:<br>
 * http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
 *
 * @author tiso
 *
 */
public class MalformedJson extends Exception {

	private static final long serialVersionUID = -5602608862555070579L;

	public MalformedJson() {
		super();
	}

	public MalformedJson(String message) {
		super(message);
	}

	public MalformedJson(String message, Throwable cause) {
		super(message, cause);
	}

	public MalformedJson(Throwable cause) {
		super(cause);
	}
}
