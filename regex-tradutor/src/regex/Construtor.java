package regex;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import regex.enumType.RegraRegex;
import regex.transfer.TraducaoTO;

/**
 * Realiza a construcao e validacao de uma expressao regular
 * a partir de uma linguagem natural.
 * 
 * @author tiso
 *
 */
public class Construtor {
	
	/**
	 * Constroi uma expressao regular a partir de um Objeto JSON que contenha
	 * uma expressao em linguagem natural.<br>
	 * <br>
	 * E assumido que o objeto JSON esta no formato aceito
	 * pela biblioteca DHTMLX Tree:<br>
	 *
	 * http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
	 * 
	 * @param jsonString Um objeto JSON em String.
	 * @return Uma String contendo a expressao regular montada.
	 */
	public String construir(String jsonString){
		
		JsonReader	reader;
		JsonObject	json;
		JsonArray	itens;
		String		regex;
		
		//Cria um objeto JSON a partir de uma String
		//http://docs.oracle.com/javaee/7/api/javax/json/JsonObject.html
		reader = Json.createReader(new StringReader(jsonString));
		json = reader.readObject();
		reader.close();
		
		//Recupera o 1o array do objeto JSON,
		//que contem todos os item na raiz
		//TODO Levartar excecao se o JSON nao estiver no padrao correto
		itens = json.getJsonArray("item");
		
		//Constroi o texto regex a partir do itens do array
		regex = textoRegex(itens);
		
		//Retorna a regex pronta
		return regex;
	}
	
	/**
	 * Itera todos os itens de uma array JSON recursivamente,
	 * criando uma string regex.
	 * 
	 * @param array Um array de objetos JSON
	 * @return A expressao regular montada em String
	 */
	//TODO Fazer codigo defensivo
	private String textoRegex(JsonArray array){
		
		StringBuffer	buffer = new StringBuffer();
		JsonArray		userdataArray;
		JsonObject		node;
		TraducaoTO		nodeData;
		
		//Itera todos os valores do array
		for (JsonValue jsonValue : array) {
			
			//Faz cast do valor encontrado para objeto JSON
			node = (JsonObject) jsonValue;
			
			//Checa se existe uma chave "userdata" neste objeto
			if (node.containsKey("userdata")){
				
				//Recupera o valor da chave "userdata" como
				//um array de objetos JSON
				userdataArray = node.getJsonArray("userdata");
				
				/**
				 * Itera todos os itens do array userdata, 
				 * retornando um objeto de transferencia.
				 * 
				 * Este objeto contem os metadados de um
				 * no especifico da arvore.
				 */
				nodeData = nodeData(userdataArray);
				
				//Se o no for terminal
				if (nodeData.isTerminal()) {
					
					//Recupere o texto regex equivalente deste no
					//e adicione-o ao String buffer
					buffer.append(
						textoTerminal(nodeData)
					);
				}
				
				//Se o no for nao terminal
				else {
					
					//Recupera o texto regex equivalente deste no
					//e de todos os seus filhos e adicione-o
					//ao String buffer
					buffer.append(
						textoNaoTerminal(node, nodeData)
					);
				}
				
			}
			//Se nao existe uma chave "userdata"
			else {
				//TODO Levantar excecao se nao existir uma chave userdata
			}
		}
		
		return buffer.toString();
	}
	
	/**
	 * Itera um array de objetos JSON que correspondem as informacoes
	 * "userdata" de um objeto JSON especifico, e retorna um objeto de
	 * transferencia populado com estas informacoes.<br>
	 * <br>
	 * Estas informacoes sao os metadados de um no da arvore.<br>
	 * <br>
	 * Cada objeto deste array deve ser composto por dois pares de chave/valor.
	 * As chaves serao sempre "name" e "content". Este e o padrao definido
	 * pela biblioteca DHTMLX Tree:<br>
	 * 
	 * http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
	 * 
	 * @param userdata Um array de objetos JSON
	 * @return Um objeto de transferencia UserdataTO
	 */
	private TraducaoTO nodeData(JsonArray userdata){
		
		TraducaoTO	to = new TraducaoTO();
		JsonObject	data;
		String		content, dataType;
		RegraRegex	regra;
		boolean		terminal;
		int			nivel, numero1, numero2;
		
		//Itera todos os valores do array
		for (JsonValue jsonValue : userdata) {
			
			//Faz cast do valor encontrado para objeto JSON
			data = (JsonObject) jsonValue;
			
			//Recupera o nome do tipo de dado contido neste objeto JSON
			//TODO Levantar execao se nao existir uma chave "name"
			dataType = data.getString("name");
			
			//Recupera o dado propriamente dito
			//TODO Levantar execao se nao existir uma chave "content"
			content = data.getString("content");
			
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
					to.setTexto(content);
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
					
				default:
					//TODO levantar execao se o tipo de metadado nao for reconhecido
					break;
			}
		}
		
		return to;
	}
	
	/**
	 * Retorna um texto regex a partir dos metadados de um no terminal.
	 * 
	 * @param nodeData Os metadados.
	 * @return Uma String com o texto regex equivalente ao no.
	 */
	private StringBuffer textoTerminal(TraducaoTO nodeData){
		
		StringBuffer buffer	= new StringBuffer();
		RegraRegex	regra = nodeData.getTipoRegra();
		
		//Altera o valor da variavel "texto" de acordo com a
		//regra encontrada
		
		switch (regra) {
			
			//Caso a regra seja de um tipo de caractere, recupera o texto dele
			case CHARACTERS:			//Varios caracteres seguidos
			case CHARACTER:			//Um caractere
			case LIST_CHARACTER:		//Um caractere de lista
			case LIST_NO_SPECIAL:		//Um caractere de lista que perdeu seu significado especial ao ficar no inicio da lista   
			case LIST_LAST_ELEMENT:	//Um caractere de lista que perdeu seu significado especial ao ficar no final da lista
				buffer.append(nodeData.getTexto());
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
				
			case RANGE:				//Serie de caracteres
			case LIST_FIRST_RANGE:	//Caso especial de serie de caracteres no inicio da lista
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
			
			default:
				//TODO Levantar execao se nao existir a regra terminal recebida
				break;
		}
		
		return buffer;
	}
	
	/**
	 * Retorna um texto regex a partir de um no nao terminal.
	 * 
	 * @param node O no nao terminal
	 * @param nodeData Os metadados deste no
	 * @return Uma String com o texto regex equivalente ao no e todos os seus filhos.
	 */
	private StringBuffer textoNaoTerminal(JsonObject node, TraducaoTO nodeData){
		
		StringBuffer buffer	= new StringBuffer();
		RegraRegex	 regra	= nodeData.getTipoRegra();
		JsonArray	 filhos	= node.getJsonArray("item");
		String		 texto	= textoRegex(filhos);
		
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
				//TODO Levantar execao se nao existir a regra nao terminal recebida
				break;
		}
		
		return buffer;
	}
	
	/**
	 * Para testes apenas.
	 * @param args
	 
	public static void main(String[] args) {
		
		String teste = "{\"id\":\"0\", \"item\":[{ \"id\":\"1\", \"text\":\"Caracteres: a\", \"userdata\":[{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"original\" , \"content\":\"a\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"texto\" , \"content\":\"a\" }]}\n,{ \"id\":\"12\", \"open\":\"1\", \"select\":\"1\", \"text\":\"Um ou mais:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"ONE_OR_MORE\" }], \"item\":[{ \"id\":\"13\", \"text\":\"Caracteres: bla\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"bla\" }]}\n]\n}\n,{ \"id\":\"10\", \"open\":\"1\", \"text\":\"Zero ou mais:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"ZERO_OR_MORE\" }], \"item\":[{ \"id\":\"11\", \"text\":\"Caracteres: nothing\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"nothing\" }]}\n]\n}\n,{ \"id\":\"8\", \"open\":\"1\", \"text\":\"Pelo menos 9 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"AT_LEAST\" },{ \"name\":\"numero1\" , \"content\":\"9\" }], \"item\":[{ \"id\":\"9\", \"text\":\"Caracteres: sdhaksfdh\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"sdhaksfdh\" }]}\n]\n}\n,{ \"id\":\"6\", \"open\":\"1\", \"text\":\"Entre 5 e 9 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"BETWEEN\" },{ \"name\":\"numero1\" , \"content\":\"5\" },{ \"name\":\"numero2\" , \"content\":\"9\" }], \"item\":[{ \"id\":\"7\", \"text\":\"Caracteres: teste\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"teste\" }]}\n]\n}\n,{ \"id\":\"2\", \"open\":\"1\", \"text\":\"Pode ou nao ter:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"CONDITIONAL\" }], \"item\":[{ \"id\":\"3\", \"text\":\"Caracteres: b\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"b\" }]}\n,{ \"id\":\"4\", \"open\":\"1\", \"text\":\"Exatamente 5 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"EXACT\" },{ \"name\":\"numero1\" , \"content\":\"5\" }], \"item\":[{ \"id\":\"5\", \"text\":\"Caracteres: c\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"2\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"c\" }]}\n]\n}\n]\n}\n]}";
		System.out.println(construir(teste));
	}*/
}
