package regex;

import java.io.IOException;
import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import exception.MalformedJson;
import exception.MalformedMetadata;
import exception.NonExistentMetadata;
import exception.ParentWithNoChildren;
import exception.UnrecognisedMetadata;
import exception.UnrecognisedRule;
import regex.enumType.RegraRegex;
import regex.transfer.TraducaoTO;

/**
 * Realiza a construcao e validacao de uma expressao regular
 * a partir de uma linguagem natural.
 */
public class Construtor {

	/**
	 * Array com todos os caracteres especiais de
	 * Expressoes Regulares que precisam ser escapados para
	 * que sejam interpretador literalmente.
	 *
	 * A barra de escape '\' precisa ser o 1o item do array,
	 * para evitar que escapes de outros caracteres sejam
	 * escapados depois.
	 */
	private static final String[] specialChar = {
			"\\",
			"(",
			")",
			"[",
			"]",
			"{",
			"}",
			".",
			"+",
			"*",
			"|",
			"^",
			"$",
			"?"
	};

	/**
	 * Constroi uma expressao regular a partir de um Objeto JSON que contenha
	 * uma expressao em linguagem natural.<br>
	 * <br>
	 * E assumido que o objeto JSON esta no formato aceito
	 * pela biblioteca DHTMLX Tree:<br>
	 * <br>
	 * {@link http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate }
	 *
	 *
	 * @param jsonString
	 *  Um objeto JSON em String.
	 *
	 * @return
	 *  Uma String contendo a expressao regular montada.
	 *
	 * @throws MalformedJson
	 *  Se o JSON recebido nao esta no formato aceito pela
	 *  biblioteca DHTMLX Tree.
	 *
	 * @throws MalformedMetadata
	 *  Se os metadados de um elemento nao estao no formato aceito pela
	 *  biblioteca DHTMLX Tree.
	 *
	 * @throws NonExistentMetadata
	 *  Se nao existem metadados em um elemento.
	 *
	 * @throws UnrecognisedMetadata
	 *  Se existe um metadado nao reconhecido pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws UnrecognisedRule
	 *  Se existe uma regra nao reconhecida pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws IOException
	 *  Se ocorreu um erro de IO durante a validacao.
	 */
	public Regex construir(String jsonString)
			throws UnrecognisedMetadata, MalformedJson,
			NonExistentMetadata, UnrecognisedRule, MalformedMetadata,
			IOException {

		JsonReader  reader;
		JsonObject  json;
		JsonArray   itens;
		String      strigRegex;
		Regex       regex;



		//Cria um objeto JSON a partir de uma String
		//http://docs.oracle.com/javaee/7/api/javax/json/JsonObject.html

		/** DS2 04-05*/
		reader = Json.createReader(new StringReader(jsonString));
		/** DS2 06-07*/
		json   = reader.readObject();
		/** DS2 08-09*/
		reader.close();

		//Recupera o 1o array do objeto JSON,
		//que contem todos os itens da raiz
		/** DS2 10-11*/
		itens = json.getJsonArray("item");

		//Se este array nao existir, levanta uma excecao
		if ((itens == null) || (itens.size() < 1))
			throw new MalformedJson(
					"JSON recebido nao esta no formato suportado."
					);
		else {

			//Constroi o texto regex a partir do itens do array
			strigRegex = textoRegex(itens);

			//Valida o texto usando a classe Regex
			/** DS2 18-31*/
			regex = new Regex(strigRegex);
			/** DS2 32-33*/
			regex.validar();

			//Retorna a instancia da classe Regex, que
			//contem a expressao e informacoes sobre a
			//validacao.
			/** DS2 34*/
			return regex;
		}
	}

	/**
	 * Itera todos os itens de uma array JSON recursivamente,
	 * criando uma string regex.
	 *
	 * @param array
	 *  Um array de objetos JSON
	 *
	 * @return
	 *  A expressao regular montada em String
	 *
	 * @throws MalformedMetadata
	 *  Se os metadados de um elemento nao estao no formato aceito pela
	 *  biblioteca DHTMLX Tree.
	 *
	 * @throws NonExistentMetadata
	 *  Se nao existem metadados em um elemento.
	 *
	 * @throws UnrecognisedMetadata
	 *  Se existe um metadado nao reconhecido pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws UnrecognisedRule
	 *  Se existe uma regra nao reconhecida pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws ParentWithNoChildren
	 *  Se o array recebido for vazio.
	 */
	private String textoRegex(JsonArray array)
			throws UnrecognisedMetadata, NonExistentMetadata,
			UnrecognisedRule, MalformedMetadata, ParentWithNoChildren {

		StringBuffer  buffer = new StringBuffer();
		JsonArray     userdataArray;
		JsonObject    node;
		TraducaoTO    nodeData;

		if ((array == null) || (array.size() < 1))
			throw new ParentWithNoChildren(
					"Um no nao terminal nao possui filhos."
					);

		//Itera todos os valores do array
		for (JsonValue jsonValue : array) {

			//Faz cast do valor encontrado para objeto JSON
			node = (JsonObject) jsonValue;

			//Recupera o valor da chave "userdata" como
			//um array de objetos JSON
			/** DS2 12-13*/
			userdataArray = node.getJsonArray("userdata");

			if ((userdataArray == null) || (userdataArray.size() < 1))
				throw new NonExistentMetadata(
						"Nao foram encontrados metadados em um dos nos."
						);

			/**
			 * Itera todos os itens do array userdata,
			 * retornando um objeto de transferencia.
			 *
			 * Este objeto contem os metadados de um
			 * no especifico da arvore.
			 */
			nodeData = nodeData(userdataArray);

			//Se o no for terminal
			if (nodeData.isTerminal())
				//Recupere o texto regex equivalente deste no
				//e adicione-o ao String buffer
				buffer.append(
						textoTerminal(nodeData)
						);
			else
				//Recupera o texto regex equivalente deste no
				//e de todos os seus filhos e adicione-o
				//ao String buffer
				buffer.append(
						textoNaoTerminal(node, nodeData)
						);
		}

		return buffer.toString();
	}

	/**
	 * Itera um array de objetos JSON que correspondem as informacoes
	 * "userdata" de um objeto JSON especifico, e retorna um objeto de
	 * transferencia populado com estas informacoes.<br>
	 * <br>
	 *
	 * Estas informacoes sao os metadados de um no da arvore.<br>
	 * <br>
	 *
	 * Cada objeto deste array deve ser composto por dois pares de chave/valor.
	 * As chaves serao sempre "name" e "content". Este e o padrao definido
	 * pela biblioteca DHTMLX Tree:<br>
	 * <br>
	 * {@link http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate }
	 *
	 * @param userdata
	 *  Um array de objetos JSON
	 *
	 * @return
	 *  Um objeto de transferencia UserdataTO
	 *
	 * @throws MalformedMetadata
	 *  Se os metadados de um elemento nao estao no formato aceito pela
	 *  biblioteca DHTMLX Tree.
	 *
	 * @throws UnrecognisedMetadata
	 *  Se existe um metadado nao reconhecido pela aplicacao
	 *  em um dos elementos.
	 */
	private TraducaoTO nodeData(JsonArray userdata)
			throws UnrecognisedMetadata, MalformedMetadata {

		/** DS2 14-15*/
		TraducaoTO  to       = new TraducaoTO();
		JsonObject  data     = null;
		String      content  = null;
		String      dataType = null;
		RegraRegex  regra    = null;

		boolean	    terminal;
		int         nivel, numero1, numero2;

		//Itera todos os valores do array
		for (JsonValue jsonValue : userdata) {

			//Faz cast do valor encontrado para objeto JSON
			data = (JsonObject) jsonValue;

			//Tenta recuperar valores de algumas chaves deste objeto JSON
			try {
				/** DS2 16-17 */

				//Recupera o nome do tipo de dado contido neste objeto JSON
				dataType = data.getString("name");

				//Recupera o dado propriamente dito
				content = data.getString("content");
			}

			//Se uma das chaves nao existir ou nao puder ser armazenada em
			//uma String, levanta uma execao de metadados mal formados
			catch (NullPointerException|ClassCastException e) {
				throw new MalformedMetadata(
						"Os metadados de um no nao estao em um formato reconhecido."
						);
			}

			//Se uma das chaves nao tiver um valor, levanta uma execao
			//de metadados mal formados
			if ((dataType == "undefined") || (content == "undefined"))
				throw new MalformedMetadata(
						"Os metadados de um no nao possuem valores validos."
						);

			switch (dataType) {

			case "regra":
				regra = RegraRegex.valueOf(content);
				to.setTipoRegra(regra);
				break;

			case "terminal":
				terminal = Boolean.parseBoolean(content);
				to.setTerminal(terminal);
				break;

			case "nivel":
				nivel = Integer.parseInt(content);
				to.setNivel(nivel);
				break;

			case "texto":
				to.setTextoOriginal(content);
				break;

			case "numero1":
				numero1 = Integer.parseInt(content);
				to.setNumero1(numero1);
				break;

			case "numero2":
				numero2 = Integer.parseInt(content);
				to.setNumero2(numero2);
				break;

			case "caractere1":
				to.setCaractere1(content);
				break;

			case "caractere2":
				to.setCaractere2(content);
				break;

			case "original":
				break;

			default:
				throw new UnrecognisedMetadata(
						"Tipo de metadado nao reconhecido encontrado."
						);
			}
		}

		return to;
	}

	/**
	 * Retorna um texto regex a partir dos metadados de um no terminal.
	 *
	 * @param nodeData
	 *  Os metadados.
	 *
	 * @return
	 *  Uma String com o texto regex equivalente ao no.
	 *
	 * @throws UnrecognisedRule
	 *  Se existe uma regra nao reconhecida pela aplicacao
	 *  em um dos elementos.
	 */
	private StringBuffer textoTerminal(TraducaoTO nodeData)
			throws UnrecognisedRule {

		StringBuffer buffer  = new StringBuffer();
		RegraRegex   regra   = nodeData.getTipoRegra();

		//Adiciona informacoes no buffer de String de acordo
		//com a regra encontrada no nodeData
		switch (regra) {

		case CHARACTERS:         //Varios caracteres seguidos
		case CHARACTER:          //Um caractere

			buffer.append(

					//Como e uma regra de texto literal,
					//escapa todos os caracteres especiais do texto
					//original para que eles sejam
					//interpretados literalmente.
					especialEscape(nodeData.getTextoOriginal())
					);

			break;

		case LIST_CHARACTER:     //Um caractere de lista
		case LIST_CHARACTERS:    //Caracteres de lista
		case LIST_NO_SPECIAL:    //Um caractere de lista que perdeu seu significado especial ao ficar no inicio da lista
		case LIST_LAST_ELEMENT:  //Um caractere de lista que perdeu seu significado especial ao ficar no final da lista
			buffer.append(nodeData.getTextoOriginal());
			break;

		case START_ANCHOR:
			buffer.append("^");
			break;

		case END_ANCHOR:
			buffer.append("$");
			break;

		case ANY_CHAR:
			buffer.append(".");
			break;

		case RANGE:             //Serie de caracteres
		case LIST_FIRST_RANGE:  //Caso especial de serie de caracteres no inicio da lista
			buffer.append(nodeData.getCaractere1() + "-" + nodeData.getCaractere2());
			break;

		case ALNUM:
			buffer.append("[:alnum:]");
			break;

		case DIGIT_CLASS:
			buffer.append("[:digit:]");
			break;

		case SPACE_CLASS:
			buffer.append("[:space:]");
			break;

		case ALPHA:
			buffer.append("[:alpha:]");
			break;

		case BLANK:
			buffer.append("[:blank:]");
			break;

		case CNTRL:
			buffer.append("[:cntrl:]");
			break;

		case GRAPH:
			buffer.append("[:graph:]");
			break;

		case LOWER:
			buffer.append("[:lower:]");
			break;

		case PRINT:
			buffer.append("[:print:]");
			break;

		case PUNCT:
			buffer.append("[:punct:]");
			break;

		case UPPER:
			buffer.append("[:upper:]");
			break;

		case X_DIGIT:
			buffer.append("[:xdigit:]");
			break;

		default:
			throw new UnrecognisedRule(
					"Regra terminal encontrada nao e reconhecida."
					);
		}

		return buffer;
	}

	/**
	 * Retorna um texto regex a partir de um no nao terminal.
	 *
	 * @param node
	 *  O no nao terminal.
	 *
	 * @param nodeData
	 *  Os metadados deste no.
	 *
	 * @return
	 *  Uma String com o texto regex equivalente ao no e todos os seus filhos.
	 *
	 * @throws MalformedMetadata
	 *  Se os metadados de um elemento nao estao no formato aceito pela
	 *  biblioteca DHTMLX Tree.
	 *
	 * @throws NonExistentMetadata
	 *  Se nao existem metadados em um elemento.
	 *
	 * @throws UnrecognisedMetadata
	 *  Se existe um metadado nao reconhecido pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws UnrecognisedRule
	 *  Se existe uma regra nao reconhecida pela aplicacao
	 *  em um dos elementos.
	 *
	 * @throws ParentWithNoChildren
	 *  Se um dos elementos nao terminais nao possuir filhos.
	 */
	private StringBuffer textoNaoTerminal(JsonObject node, TraducaoTO nodeData)
			throws UnrecognisedMetadata, NonExistentMetadata,
			UnrecognisedRule, MalformedMetadata, ParentWithNoChildren {

		StringBuffer buffer = new StringBuffer();
		RegraRegex   regra  = nodeData.getTipoRegra();
		JsonArray    filhos = node.getJsonArray("item");
		String       texto  = textoRegex(filhos);

		//Adciona o texto regex equivalente no buffer de acordo com a
		//regra do no.
		switch (regra) {

		case ONE_OR_MORE:
			buffer.append(texto);
			buffer.append("+");
			break;

		case ZERO_OR_MORE:
			buffer.append(texto);
			buffer.append("*");
			break;

		case CONDITIONAL:
			buffer.append(texto);
			buffer.append("?");
			break;

		case EXACT:
			buffer.append(texto);
			buffer.append("{");
			buffer.append(nodeData.getNumero1());
			buffer.append("}");
			break;

		case AT_LEAST:
			buffer.append(texto);
			buffer.append("{");
			buffer.append(nodeData.getNumero1());
			buffer.append(",}");
			break;

		case BETWEEN:
			buffer.append(texto);
			buffer.append("{");
			buffer.append(nodeData.getNumero1());
			buffer.append(",");
			buffer.append(nodeData.getNumero2());
			buffer.append("}");
			break;

		case MULTIPLE:

			buffer.append(texto);

			/** Remove o ultimo caractere do buffer,
			 *  que sera um "|", para que as multiplas
			 *  opcoes fiquem com sintaxe correta. */
			buffer.deleteCharAt(buffer.length()-1);

			break;

		case SUB_EXPRESSION:
			buffer.append(texto);
			buffer.append("|");
			break;

		case GROUP:
			buffer.append("(");
			buffer.append(texto);
			buffer.append(")");
			break;

		case POSITIVE_LIST:
			buffer.append("[");
			buffer.append(texto);
			buffer.append("]");
			break;

		case NEGATIVE_LIST:
			buffer.append("[^");
			buffer.append(texto);
			buffer.append("]");
			break;

		default:
			throw new UnrecognisedRule(
					"Regra nao terminal encontrada nao e reconhecida."
					);
		}

		return buffer;
	}

	/**
	 *
	 * Escapa todos os caracteres especiais de Regex dentro de
	 * uma String com barras invertidas.
	 *
	 * @param texto
	 * 	O texto original
	 *
	 * @return
	 * 	O texto original com todos os caracteres especiais
	 * 	escapados com uma barra invertida.
	 */
	private String especialEscape(String texto){

		for (String string : specialChar)
			texto = texto.replace(string,"\\"+string );

		return texto;
	}

}
