package helper;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Classe auxiliar com metodos para escape de texto.
 */
public class EscapeHelper {
	
	/**
	 * Escapa todas as aspas duplas de um texto.
	 * 
	 * @param string
	 *  O texto a ser escapado.
	 *  
	 * @return
	 *  O texto com as aspas duplas escapadas.
	 */
	public static String escapeDoubleQuote(String string){
		
		return string.replaceAll("\"", "\\\\\"");
        //     string.replaceAll( " , \\" );  <- O que as Strings representam
        //     string.replaceAll( " , \" );   <- O que a maquina regex entende
	}
	
	/**
	 * Escapa todas as barras invertidas de um texto.
	 * 
	 * @param string
	 * 	O texto a ser escapado.
	 * 
	 * @return
	 * 	O texto com as barras invertidas escapadas.
	 */
	public static String escapeReverseSolidus(String string){
		
		return string.replaceAll("\\\\","\\\\\\\\");
        //     string.replaceAll( \\ , \\\\ );  <- O que as Strings representam  
        //     string.replaceAll( \ , \\ );     <- O que a maquina regex entende  
		
	}
	
	/**
	 * Remove todas as quebras de linha de um texto.
	 * Sao removidos os caracteres "New Line" e
	 * "Carriage Return".
	 * 
	 * @param string
	 * 	O texto com quebras de linha.
	 * 
	 * @return
	 * 	O texto sem quebras de linha.
	 */
	public static String removeNewLines(String string){
		
		// \r?  -> Pode ou nao ter "Carriage Return"
		// \n   -> "New Line"
		return string.replaceAll("\r?\n", "");
	}
	
	/**
	 * Faz o encode de todos os caracteres especiais 
	 * de uma String para entidades html.
	 * 
	 * @param html
	 *  O texto com caracteres especiais.
	 *  
	 * @return
	 *  O texto com entidades HTML.
	 */
	public static String encodeHtmlString(String html) {
		
		return StringEscapeUtils.escapeHtml4(html);
		
		/**
		return html
				.replaceAll("\"","&quot;")
				.replaceAll("'","&#39;")
				.replaceAll("<","&lt;")
				.replaceAll(">","&gt;")
				.replaceAll("&","&amp;")
				;
		*/
	}
	
	/**
	 * Faz o decode de todas as entidades HTML
	 * de uma String para caracteres especiais.
	 * 
	 * @param html
	 *  O texto com entidades HTML.
	 *  
	 * @return
	 *  O texto com caracteres especiais.
	 */
	public static String decodeHtmlString(String html) {
		/**
		return html
				.replaceAll("&quot;","\"")
				.replaceAll("&#39;","'")
				.replaceAll("&lt;","<")
				.replaceAll("&gt;",">")
				.replaceAll("&amp;","&")
				;
		*/
		
		return StringEscapeUtils.unescapeHtml4(html);
	}
	
}
