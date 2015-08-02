package regex;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import regex.enumType.RegraRegex;
import regex.transfer.UserdataTO;

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
	public static String construir(String jsonString){
		
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
	private static String textoRegex(JsonArray array){
		
		StringBuffer	buffer = new StringBuffer();
		JsonArray		userdataArray;
		JsonObject		node;
		UserdataTO		nodeData;
		
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
				//TODO Levantar exeption aqui
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
	private static UserdataTO nodeData(JsonArray userdata){
		
		UserdataTO	to = new UserdataTO();
		JsonObject	data;
		String		content;
		RegraRegex	regra;
		boolean		terminal;
		int			nivel, numero1, numero2;
		
		//Itera todos os valores do array
		for (JsonValue jsonValue : userdata) {
			
			//Faz cast do valor encontrado para objeto JSON
			data = (JsonObject) jsonValue;
			
			//Checa se o objeto tem uma chave "name" com valor "regra"
			if( data.getString("name").equals("regra") ){
				
				content = data.getString("content");
				regra = RegraRegex.valueOf(content);
				to.setTipoRegra(regra);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "terminal"
			else if( data.getString("name").equals("terminal") ){
				
				content = data.getString("content");
				terminal = Boolean.parseBoolean(content);
				to.setTerminal(terminal);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "nivel"
			else if( data.getString("name").equals("nivel") ){
				
				content = data.getString("content");
				nivel = Integer.parseInt(content);
				to.setNivel(nivel);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "texto"
			//OBS: Este par so vai existir em um no do tipo CHARACTERS
			else if( data.getString("name").equals("texto") ){
				
				content = data.getString("content");
				to.setTexto(content);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "numero1"
			//OBS: Este par so vai existir em um no do tipo EXACT, AT_LEAST ou BETWEEN
			else if( data.getString("name").equals("numero1") ){
				
				content = data.getString("content");
				numero1 = Integer.parseInt(content);
				to.setNumero1(numero1);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "numero1"
			//OBS: Este par so vai existir em um no do tipo BETWEEN
			else if( data.getString("name").equals("numero2") ){
				
				content = data.getString("content");
				numero2 = Integer.parseInt(content);
				to.setNumero2(numero2);
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
	private static String textoTerminal(UserdataTO nodeData){
		
		String		texto = null;
		RegraRegex	regra = nodeData.getTipoRegra();
		
		//Altera o valor da variavel "texto" de acordo com a
		//regra encontrada
		switch (regra) {
			
			//Caso a regra seja "CHARACTERS", o texto
			case CHARACTERS:
				texto = nodeData.getTexto();
				break;
			
			//TODO Criar casos terminais restantes
			
			default:
				//TODO Levantar exeption aqui
				break;
		}
		
		return texto;
	}
	
	/**
	 * Retorna um texto regex a partir de um no nao terminal.
	 * 
	 * @param node O no nao terminal
	 * @param nodeData Os metadados deste no
	 * @return Uma String com o texto regex equivalente ao no e todos os seus filhos.
	 */
	private static String textoNaoTerminal(JsonObject node, UserdataTO nodeData){
		
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
			
			//TODO Criar casos nao terminais restantes
			
			default:
				//TODO Levantar exeption aqui
				break;
		}
		
		return buffer.toString();
	}

	//TODO Remover classe main e acessos estaticos da classe
	/**
	 * Para testes apenas.
	 * @param args
	 */
	public static void main(String[] args) {
		
		String teste = "{\"id\":\"0\", \"item\":[{ \"id\":\"1\", \"text\":\"Caracteres: a\", \"userdata\":[{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"original\" , \"content\":\"a\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"texto\" , \"content\":\"a\" }]}\n,{ \"id\":\"12\", \"open\":\"1\", \"select\":\"1\", \"text\":\"Um ou mais:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"ONE_OR_MORE\" }], \"item\":[{ \"id\":\"13\", \"text\":\"Caracteres: bla\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"bla\" }]}\n]\n}\n,{ \"id\":\"10\", \"open\":\"1\", \"text\":\"Zero ou mais:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"ZERO_OR_MORE\" }], \"item\":[{ \"id\":\"11\", \"text\":\"Caracteres: nothing\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"nothing\" }]}\n]\n}\n,{ \"id\":\"8\", \"open\":\"1\", \"text\":\"Pelo menos 9 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"AT_LEAST\" },{ \"name\":\"numero1\" , \"content\":\"9\" }], \"item\":[{ \"id\":\"9\", \"text\":\"Caracteres: sdhaksfdh\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"sdhaksfdh\" }]}\n]\n}\n,{ \"id\":\"6\", \"open\":\"1\", \"text\":\"Entre 5 e 9 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"BETWEEN\" },{ \"name\":\"numero1\" , \"content\":\"5\" },{ \"name\":\"numero2\" , \"content\":\"9\" }], \"item\":[{ \"id\":\"7\", \"text\":\"Caracteres: teste\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"teste\" }]}\n]\n}\n,{ \"id\":\"2\", \"open\":\"1\", \"text\":\"Pode ou nao ter:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"CONDITIONAL\" }], \"item\":[{ \"id\":\"3\", \"text\":\"Caracteres: b\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"b\" }]}\n,{ \"id\":\"4\", \"open\":\"1\", \"text\":\"Exatamente 5 repeticoes de:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"EXACT\" },{ \"name\":\"numero1\" , \"content\":\"5\" }], \"item\":[{ \"id\":\"5\", \"text\":\"Caracteres: c\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"2\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"texto\" , \"content\":\"c\" }]}\n]\n}\n]\n}\n]}";
		System.out.println(construir(teste));
	}
}
