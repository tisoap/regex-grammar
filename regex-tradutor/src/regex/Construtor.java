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
	 * Constroi uma expressao regular a
	 * partir de um Objeto JSON que contenha
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
		
		//Cria um objeto JSON a partir de uma String
		//http://docs.oracle.com/javaee/7/api/javax/json/JsonObject.html
		JsonReader reader = Json.createReader(new StringReader(jsonString));
		JsonObject json = reader.readObject();
		reader.close();
		
		//Recupera o 1o array do objeto JSON,
		//que contem todos os item na raiz
		//TODO Levartar excecao se o JSON nao estiver no padrao correto
		JsonArray itens = json.getJsonArray("item");
		
		//Constroi o texto regex a partir do itens do array
		String regex = iterarJsonArray(itens);
		
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
	private static String iterarJsonArray(JsonArray array){
		
		//Cria um novo buffer de String
		StringBuffer buffer = new StringBuffer();
		
		@SuppressWarnings("unused")
		UserdataTO userdata;
		
		//Itera todos os valores do array
		for (JsonValue jsonValue : array) {
			
			//Faz cast do valor encontrado para objeto JSON
			JsonObject item = (JsonObject) jsonValue;
			
			//Checa se existe uma chave "userdata" neste objeto
			if (item.containsKey("userdata")){
				
				//Recupera o valor da chave "userdata" como
				//um array de objetos JSON
				JsonArray userdataArray = item.getJsonArray("userdata");
				
				//Itera todos os itens do array userdata,
				//retornando um objeto de transferencia
				//populado com os dados encontrados
				userdata = iterarUserdata(userdataArray);
				
				//TODO
			}
			
			if (item.containsKey("item")){
				JsonArray subItem = item.getJsonArray("item");
				buffer.append(iterarJsonArray(subItem));
			}
		}
		
		return buffer.toString();
	}
	
	/**
	 * Itera um array de objetos JSON que correspondem as informacoes
	 * "userdata" de um objeto JSON especifico, e retorna um objeto de
	 * transferencia populado com estas informacoes.<br>
	 * <br>
	 * Cada objeto deste array deve ser composto por dois pares de chave/valor.
	 * As chaves serao sempre "name" e "content".<br>
	 * 
	 * @param userdata Um array de objetos JSON
	 * @return Um objeto de transferencia UserdataTO
	 */
	private static UserdataTO iterarUserdata(JsonArray userdata){
		
		UserdataTO to = new UserdataTO();
		String dado;
		RegraRegex regra;
		boolean terminal;
		int nivel;
		
		//Itera todos os valores do array
		for (JsonValue jsonValue : userdata) {
			
			//Faz cast do valor encontrado para objeto JSON
			JsonObject data = (JsonObject) jsonValue;
			
			//Checa se o objeto tem uma chave "name" com valor "regra"
			
			//TODO Para testes
			System.out.println(data.getString("name"));
			System.out.println(data.getString("content"));
			
			if( data.getString("name").equals("regra") ){
				
				dado = data.getString("content");
				regra = RegraRegex.valueOf(dado);
				to.setTipoRegra(regra);
			}
			
			//Checa se o objeto tem uma chave "name" com valor "terminal"
			else if( data.getString("name").equals("terminal") ){
				
				dado = data.getString("content");
				terminal = Boolean.parseBoolean(dado);
				to.setTerminal(terminal);
			}
			
			//Checa se o objeto tem uma chave "nivel" com valor "terminal"
			else if( data.getString("name").equals("nivel") ){
				
				dado = data.getString("content");
				nivel = Integer.parseInt(dado);
				to.setNivel(nivel);
			}
		}
		
		return to;
	}
	
	/**
	 * Para testes apenas.
	 * @param args
	 */
	//TODO
	public static void main(String[] args) {
		
		String teste = "{\"id\":\"0\", \"item\":[{ \"id\":\"1\",  \"text\":\"Caracteres: a\", \"userdata\":[{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"original\" , \"content\":\"a\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" },{ \"name\":\"terminal\" , \"content\":\"true\" }]},{ \"id\":\"2\",  \"open\":\"1\",  \"text\":\"Um ou mais:\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"false\" },{ \"name\":\"nivel\" , \"content\":\"0\" },{ \"name\":\"regra\" , \"content\":\"ONE_OR_MORE\" }], \"item\":[{ \"id\":\"3\",  \"select\":\"1\", \"text\":\"Caracteres: teste\", \"userdata\":[{ \"name\":\"terminal\" , \"content\":\"true\" },{ \"name\":\"nivel\" , \"content\":\"1\" },{ \"name\":\"regra\" , \"content\":\"CHARACTERS\" }]}]}]}";
		System.out.println(teste);
		System.out.println(construir(teste));
	}
}
