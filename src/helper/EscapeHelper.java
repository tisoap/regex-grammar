package helper;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Classe auxiliar com metodos para escape de texto.
 */
public class EscapeHelper {
	
	/**
	 * Escapa as barras invertidas e as aspas duplas de uma string,
	 * nesta ordem.
	 * 
	 * @param string
	 * 	A string a ser escapada.
	 * 
	 * @return
	 * 	A string escapada.
	 */
	public static String escapeString(String string){
		return escapeDoubleQuote(escapeReverseSolidus(string));
	}
	
	/**
	 * Retira o escape de barras invertidas e de aspas duplas
	 * de uma string, nesta ordem.
	 * 
	 * @param string
	 * 	A string escapada.
	 * 
	 * @return
	 * 	A string sem escapes.
	 */
	public static String unescapeString(String string){
		return unescapeDoubleQuote(unescapeReverseSolidus(string));
	}
	
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
	 * Remove o escape de todas as aspas duplas de um texto.
	 * 
	 * @param string
	 * 	O texto com escape de aspas duplas.
	 * 
	 * @return
	 * 	O texto sem escape.
	 */
	public static String unescapeDoubleQuote(String string){
		
		return string.replaceAll("\\\\\"", "\"");
        //     string.replaceAll( \\" , " );  <- O que as Strings representam
        //     string.replaceAll( \" , " );   <- O que a maquina regex entende
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
	 * Remove o escape de todas as barras invertidas de um texto.
	 * 
	 * @param string
	 * 	O texto com escape de barras invertidas.
	 * 
	 * @return
	 * 	O texto sem escape.
	 */
	public static String unescapeReverseSolidus(String string){
		
		return string.replaceAll("\\\\\\\\","\\\\");
        //     string.replaceAll( \\\\ , \\ );  <- O que as Strings representam  
        //     string.replaceAll( \\ , \ );     <- O que a maquina regex entende  
		
	}
	
	/**
	 * Remove todas as quebras de linha de um texto.<br>
	 * <br>
	 * Sao removidos os caracteres "Carriage Return" e
	 * "New Line". "Carriage Return" so e removido
	 * se estiver imediatamente a esquerda de um
	 * "New Line".
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
	}
	
	/**
	 * Faz o decode de todas as entidades HTML
	 * de uma String para caracteres literais.
	 * 
	 * @param html
	 *  O texto com entidades HTML.
	 *  
	 * @return
	 *  O texto com caracteres literais.
	 */
	public static String decodeHtmlString(String html) {
		
		return StringEscapeUtils.unescapeHtml4(html);
	}
	
}
