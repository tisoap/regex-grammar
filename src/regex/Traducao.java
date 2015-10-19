package regex;

import static helper.EscapeHelper.*;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import regex.enumType.RegraRegex;
import regex.transfer.TraducaoTO;

/**
 * Armazena traducoes individuais em uma lista de traducoes, e
 * contem metodos para extrair essas traducoes em varios formatos.
 */
public class Traducao {

	// ----- VARIAVEIS -----

	/** Lista de objetos TraducaoTO. */
	private List<TraducaoTO> traducoes = new ArrayList<TraducaoTO>();

	/** Fabrica de construtores de objetos JSON. */
	private JsonBuilderFactory factory;

	/** Indica se ocorreu um erro na producao deste objeto. 
	 *  Falso por padrao.*/
	private boolean ocorreuErro = false;

	/** Mensagem indentificando o tipo de erro ocorrido
	 *  durante a producao deste objeto. Vazio por padrao.*/
	private String mensagemErro = "";
	
	/** Texto Identificando a posicao do erro em relacao
	 *  ao texto original, usando caracteres '^'. So sera util
	 *  se exibido em fonte monoespacada. Vazio por padrao.*/
	private String posicaoErro = "";

	private int posicao, nivel, tamanho, contadorId;


	// ----- GETTERS -----

	public boolean ocorreuErro() {
		return ocorreuErro;
	}
	public String getMensagemErro() {
		return mensagemErro;
	}
	public String getPosicaoErro() {
		return posicaoErro;
	}
	
	/**
	 * @return A lista contendo todos os objetos de traducao.
	 */
	public List<TraducaoTO> getTraducoes() {
		return traducoes;
	}


	// ----- SETTERS -----

	public void setOcorreuErro(boolean ocorreuErro) {
		this.ocorreuErro = ocorreuErro;
	}
	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
	public void setPosicaoErro(String posicaoErro) {
		this.posicaoErro = posicaoErro;
	}


	// ----- METODOS -----

	/**
	 * Adiciona um novo objeto de traducao na lista de traducoes.
	 * 
	 * @param to
	 *  Um objeto de transferencia TraducaoTO
	 */
	public void addTraducao(TraducaoTO to){
		traducoes.add(to);
	}

	/**
	 * Retorna uma identacao de tamanho relativo
	 * ao valor inteiro passado.
	 *
	 * @param n
	 *  O nivel de identacao desejado.
	 *  
	 * @return
	 *  Uma String contendo a identacao em espaços.
	 */
	private String identacao (int n){

		String ident = "";

		for (int i = 0; i < n; i++) {
			ident += "   ";
		}
		
		return ident;
	}

	/**
	 * @return
	 *  Uma String com as traducoes em formato de arvore, utilizando
	 *  listas nao ordenadas HTML.
	 */
	public String getHtmlUnorderedList(){

		posicao	= 0;
		nivel	= 0;
		tamanho = traducoes.size();
		StringBuffer buffer	= new StringBuffer();

		//Abre a primeira lista
		buffer.append("<ul>");
		buffer.append("\n");

		//Constroi as listas e listas dentro de listas, recursivamente
		buffer.append(listaRecursiva());

		//Fecha a primeira lista
		buffer.append("</ul>");
		buffer.append("\n");

		return buffer.toString();

	}

	/**
	 * @return
	 *  Uma String contendo itens de lista (tags li) com as traducoes,
	 *  construida recursivamente.
	 */
	private String listaRecursiva(){

		int 			novoNivel;
		TraducaoTO		traducaoAtual;
		StringBuffer 	bufferLocal;

		bufferLocal = new StringBuffer();

		//Para cada item na lista de traducoes
		for (int i=posicao; i<tamanho; i++) {

			//Recupera a traducao atual
			traducaoAtual = traducoes.get(i);

			//Recupera o nivel de profundidade da traducao
			novoNivel = traducaoAtual.getNivel();

			//Se o nivel se manteve e a traducao atual e terminal,
			//insere a traducao em uma tag 'li'
			if (novoNivel == nivel && traducaoAtual.isTerminal()) {

				bufferLocal.append("<li>");
				bufferLocal.append( encodeHtmlString(traducaoAtual.getTraducao()) );
				bufferLocal.append("</li>");
				bufferLocal.append("\n");
				
				//incrementa a variavel de posicao
				posicao++;
			}

			//Se o nivel se manteve e a traducao atual nao e terminal
			//insere a traducao dentro de uma tag 'li', e dentro dela
			//abre uma nova tag 'ul' e chama o metodo recursivamente
			//antes de fecha-la
			else if (novoNivel == nivel && !traducaoAtual.isTerminal()){

				//Abre um item de lista e insere a traducao nele
				bufferLocal.append("<li>");
				bufferLocal.append( encodeHtmlString(traducaoAtual.getTraducao()) );
				bufferLocal.append("\n");

				//Dentro do item de lista, abre uma lista nao ordenada
				bufferLocal.append("<ul>");
				bufferLocal.append("\n");

				//Antes de chamar o metodo recursivamente, aumenta o nivel atual
				//pois como a regra atual nao e terminal, as proximas regras serao
				//descendentes desta, sendo um nivel mais profundas
				nivel++;

				//Antes de chamar o metodo recursivamente, atualiza a variavel de
				//posicao, para que a busca continue no proximo item.
				posicao = i+1;

				//Adiciona no buffer o resutado da chamada recursiva
				bufferLocal.append(listaRecursiva());

				//Fecha a lista nao ordenada
				bufferLocal.append("</ul>");
				bufferLocal.append("\n");

				//Fecha o item de lista
				bufferLocal.append("</li>");
				bufferLocal.append("\n");

				//Atualiza a variavel de busca, para que o metodo nao passe
				//pelos mesmos itens que o metodo recursivo ja passou
				i = posicao;
			}

			//Se o nivel diminuiu, significa que saimos de uma regra nao terminal
			//e consequentemente que a execucao atual e uma recursao.
			//Portanto, deve ser retornada a construcao atual da lista.
			else if (novoNivel < nivel){

				//Se estamos saindo da recursao, significa que estamos
				//voltando um nivel de profundidade, entao a variavel de
				//nivel precisa ser atualizada de acordo
				nivel--;

				//Atualiza a possicao atual, para que o metodo superior
				//continue onde a recursao parou. E subitraido 1 para
				//conpensar o i++ do loop for.
				posicao = i-1;

				return bufferLocal.toString();

			}

		}

		return bufferLocal.toString();
	}

	/**
	 * @return
	 *  As traducoes em texto puro, separadas por 
	 *  quebras de linha e identadas com espacos.
	 */
	public String getText(){

		StringBuffer buffer = new StringBuffer();
		int nivel;

		for (TraducaoTO to : traducoes) {

			nivel = to.getNivel();

			buffer.append(identacao(nivel));
			buffer.append(to.getTraducao());
			buffer.append('\n');
		}
		
		//Remove a ultima quebra de linha 
		//se o buffer nao estiver vazio
		if ( !(buffer.length() < 1) ){
			buffer.setLength(buffer.length()-1);
		}
		
		return buffer.toString();
	}

	/**
	 * @return
	 *  As traducoes em texto puro, separadas por 
	 *  quebras de linha no padrao Windows
	 *  (Carriage Return + New Line) e identadas 
	 *  com espacos.
	 */
	public String getTextWindows(){

		StringBuffer buffer = new StringBuffer();
		int nivel;

		for (TraducaoTO to : traducoes) {

			nivel = to.getNivel();

			buffer.append(identacao(nivel));
			buffer.append(to.getTraducao());
			buffer.append("\r\n");
		}
		
		//Remove a ultima quebra de linha e carrige return,
		//se o buffer nao estiver vazio
		if ( !(buffer.length() < 2) ){
			buffer.setLength(buffer.length()-2);
		}
		
		return buffer.toString();
	}
	
	/**
	 * @return
	 *  As traducoes em texto puro, separadas por 
	 *  quebras de linha e identadas com espacos,
	 *  com os caracteres especiais convertidos
	 *  para entidades HTML.
	 */
	public String getTextHtml(){
		
		return encodeHtmlString(getText());
		
	}

	/**
	 * @return
	 *  Uma string contendo um objeto JSON com as traducoes,
	 *  no formato aceito pela biblioteca dhtmlxTree.<br>
	 *  <br>
	 *  
	 *  http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
	 */
	public String getJSONString(){

		return getJSON().toString();
	}

	/**
	 * @return
	 *  Uma string contendo um objeto JSON com as traducoes,
	 *  no formato aceito pela biblioteca dhtmlxTree, com as aspas
	 *  escapadas por barras insveridas.<br>
	 *  <br>
	 *  
	 *  http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
	 */
	public String getEscapedJSONString(){

		//Recupera um objeto JSON em formato String
		String jsonString = getJSON().toString();
		
		//Escapa todas as barras invertidas
		jsonString = escapeReverseSolidus(jsonString);
		
		//Escapa todas as aspas duplas
		jsonString = escapeDoubleQuote(jsonString);
		
		return jsonString;
	}

	/**
	 * @return
	 *  Um objeto JSON (javax.json) com as traducoes,
	 *  no formato aceito pela biblioteca dhtmlxTree.<br>
	 *  
	 *  <br>
	 *  http://docs.dhtmlx.com/tree__syntax_templates.html#jsonformattemplate
	 */
	public JsonObject getJSON(){

		posicao		= 0;
		nivel		= 0;
		contadorId 	= 0;
		tamanho 	= traducoes.size();
		factory 	= Json.createBuilderFactory(null);

		//Cria o elemento raiz de id=0
		JsonObjectBuilder inicio = factory.createObjectBuilder();
		inicio.add("id", contadorId++);

		//Adciona os outros elementos de forma recursiva
		inicio.add("item",jsonRecursivo());

		//Constroi o objeto JSON
		JsonObject json = inicio.build();

		return json;
	}

	/**
	 * @return
	 *  Um JsonArrayBuilder com as traducoes,
	 *  construido recursivamente.
	 */
	private JsonArrayBuilder jsonRecursivo() {

		int 				novoNivel;
		TraducaoTO			traducaoAtual;
		JsonArrayBuilder 	arrayBuilder = factory.createArrayBuilder();

		//Para cada item na lista de traducoes
		for (int i=posicao; i<tamanho; i++) {

			//Recupera a traducao atual
			traducaoAtual = traducoes.get(i);

			//Recupera o nivel de profundidade da traducao
			novoNivel = traducaoAtual.getNivel();

			//Se o nivel se manteve e a traducao atual e terminal,
			//insere a traducao em um objeto
			if (novoNivel == nivel && traducaoAtual.isTerminal()) {

				arrayBuilder.add(
					factory.createObjectBuilder()
					.add("id", contadorId++)
					.add("text", traducaoAtual.getTraducao())
					.add("child", 0)
					.add("userdata",criarUserdata(traducaoAtual))
				);
				
				//incrementa a variavel de posicao
				posicao++;

			}

			//Se o nivel se manteve e a traducao atual nao e terminal,
			//insere a traducao em um objeto e chama recursivamente o metodo
			else if (novoNivel == nivel && !traducaoAtual.isTerminal()){

				//Antes de chamar o metodo recursivamente, aumenta o nivel atual
				//pois como a regra atual nao e terminal, as proximas regras serao
				//descendentes desta, sendo um nivel mais profundas
				nivel++;

				//Antes de chamar o metodo recursivamente, atualiza a variavel de
				//posicao, para que a busca continue no proximo item.
				posicao = i+1;

				arrayBuilder.add(
					factory.createObjectBuilder()
					.add("id", contadorId++)
					.add("text", traducaoAtual.getTraducao())
					.add("child", 1)
					.add("userdata",criarUserdata(traducaoAtual))
					.add("item", jsonRecursivo())
				);

				//Atualiza a variavel de busca, para que o metodo nao passe
				//pelos mesmos itens que o metodo recursivo ja passou
				i = posicao;
			}

			//Se o nivel diminuiu, significa que saimos de uma regra nao terminal
			//e consequentemente que a execucao atual e uma recursao.
			//Portanto, deve ser retornado o arrayBuilder local.
			else if (novoNivel < nivel){

				//Se estamos saindo da recursao, significa que estamos
				//voltando um nivel de profundidade, entao a variavel de
				//nivel precisa ser atualizada de acordo
				nivel--;

				//Atualiza a possicao atual, para que o metodo superior
				//continue onde a recursao parou. E subitraido 1 para
				//conpensar o i++ do loop for.
				posicao = i-1;

				return arrayBuilder;

			}

		}

		return arrayBuilder;
	}

	/**
	 * Retorna um array builder de objetos JSON, onde cada objeto
	 * contem pares "name" e "value", com informacoes
	 * adicionais sobre uma traducao.
	 *
	 * @param to
	 *  Um objeto TraducaoTO de onde serao extraidas as informacoes.
	 *  
	 * @return
	 *  Um array builder de objetos JSON, populado com as informacoes
	 *  do objeto TraducaoTO recebido.
	 */
	private JsonArrayBuilder criarUserdata(TraducaoTO to){

		//Cria o array de objetos
		JsonArrayBuilder arrayBuilder = factory.createArrayBuilder();

		//Adiciona os objetos com as informacoes adicionais
		arrayBuilder

			//Nivel de profundidade da arvore em que o elemento foi encontrado
			.add(factory.createObjectBuilder()
				.add("name", "nivel")
				.add("content",to.getNivel())
			)

			//Texto original antes de ser traduzido
			.add(factory.createObjectBuilder()
				.add("name", "original")
				
				//A funcao "add" neste contexto faz escape,
				//entao qualquer escape anterior precisa ser retirado
				//para nao criar problemas
				.add("content", unescapeDoubleQuote(to.getTextoOriginal()) )
			)

			//Regra que disparou a traducao
			.add(factory.createObjectBuilder()
				.add("name", "regra")
				.add("content",to.getTipoRegra().toString())
			)

			//Se a regra e terminal ou nao
			.add(factory.createObjectBuilder()
				.add("name", "terminal")
				.add("content",to.isTerminal())
			)
		;

		//Se a traducao for do tipo "CHARACTERS"
		if (
			to.getTipoRegra() == RegraRegex.CHARACTERS ||
			to.getTipoRegra() == RegraRegex.CHARACTER
			)
		{

			//Adiciona o texto que compoe a regra CHARACTERS
			arrayBuilder.add(factory.createObjectBuilder()
				.add("name", "texto")
				
				//A funcao "add" neste contexto faz escape,
				//entao qualquer escape anterior precisa ser retirado
				//para nao criar problemas
				.add("content", unescapeDoubleQuote(to.getTextoOriginal()) )
			);
		}

		//Se a traducao for do tipo "ONE_OR_MORE" ou "AT_LEAST"
		else if (
				to.getTipoRegra() == RegraRegex.EXACT     ||
				to.getTipoRegra() == RegraRegex.AT_LEAST
				)
		{

			//Adiciona o valor numerico da repeticao
			arrayBuilder.add(factory.createObjectBuilder()
				.add("name", "numero1")
				.add("content",to.getNumero1())
			);

		}

		//Se a traducao for do tipo "BETWEEN"
		else if (to.getTipoRegra() == RegraRegex.BETWEEN){

			//Adiciona os valores numericos da repeticao
			arrayBuilder.add(factory.createObjectBuilder()
				.add("name", "numero1")
				.add("content",to.getNumero1())
			)

			.add(factory.createObjectBuilder()
				.add("name", "numero2")
				.add("content",to.getNumero2())
			);

		}

		//Se a traducao for do tipo "RANGE" ou "LIST_FIRST_RANGE"
		else if (
				to.getTipoRegra() == RegraRegex.RANGE ||
				to.getTipoRegra() == RegraRegex.LIST_FIRST_RANGE
				)
		{
			//Adiciona os caracteres da serie
			arrayBuilder.add(factory.createObjectBuilder()
				.add("name", "caractere1")
				.add("content",to.getCaractere1())
			)

			.add(factory.createObjectBuilder()
				.add("name", "caractere2")
				.add("content",to.getCaractere2())
			);
		}

		return arrayBuilder;
	}
}
