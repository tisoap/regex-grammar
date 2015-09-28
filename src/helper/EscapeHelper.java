package helper;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Classe auxiliar com metodos para escape de texto.
 */
public class EscapeHelper {
	
	/**
	 * Escapa todas as aspas duplas de um texto com
	 * barras invertidas, e remove todas as quebras de
	 * linha do mesmo.
	 * 
	 * @param string
	 *  O texto a ser escapado.
	 *  
	 * @return
	 *  O texto escapado e sem quebras de linha.
	 */
	public static String escapeString(String string){

		String quote = "\"";
		String escape = "\\";
		String escapedQuote = escape+escape+quote;

		//Escapa todas as aspas duplas com uma barra invertida
		string = string.replaceAll(quote,escapedQuote);
		
		//Remove todas as quebras de linha
		string = string.replaceAll("\r?\n", "");

		return string;
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
		
		html = StringEscapeUtils.escapeHtml4(html);
		
		return html;
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
		
		html = StringEscapeUtils.unescapeHtml4(html);
		
		return html;
		
	}
	
}
