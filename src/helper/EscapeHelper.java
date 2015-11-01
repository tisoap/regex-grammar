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
	 * Remove todas as ocorrencias do caractere de escape \ dentro
	 * de um texto, salvo ocorrencias de \\ que viram \ .
	 *
	 * @param
	 *  texto O texto que deve ser alterado
	 *
	 * @return
	 *  Um novo texto que nao contem \
	 */
	public static String removeEscape(String texto){

		int  posicaoAtual      = 0    ; //Posicao atual no buffer
		char escape            = '\\' ; //Barra invertida
		char caractereAtual;            //Caractere atual do texto de entrada
		char proximoCaractere;          //Caractere seguinte ao atual do texto de entrada

		//Buffer de String, para fazer a construcao da nova String
		StringBuffer buffer = new StringBuffer(texto.length());

		//Tamanho maximo do buffer
		buffer.setLength(texto.length());

		//Para todos os caracteres no texto de entrada
		for (int i=0; i<texto.length(); i++){

			//Recupera o caractere atual
			caractereAtual = texto.charAt(i);

			//Verefica se ele nao e uma barra invertida
			if(caractereAtual != escape)
				//Adiciona o caractere no buffer
				buffer.setCharAt(posicaoAtual++, caractereAtual);
			else if (i<texto.length()){

				//Recupera o proximo caractere
				proximoCaractere = texto.charAt(i+1);

				//Se o proximo caractere tambem for uma barra invertida
				if(proximoCaractere == escape){

					//Adiciona o proximo caractere (a barra invertida) no buffer
					buffer.setCharAt(posicaoAtual++, proximoCaractere);

					//Aumenta o contador uma posicao a mais, para
					//pular a leitura da barra invertida
					i++;
				}

				//Se o proximo caractere nao for uma barra invertida,
				//ignora a barra invertida atual, nao adicionando ela
				//no buffer.

				//Como um caractere foi ignorado aqui, e
				//preciso diminuir o tamanho do buffer
				buffer.setLength(buffer.length()-1);
			}
		}

		return buffer.toString();
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
