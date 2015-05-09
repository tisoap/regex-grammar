package regex;

import java.util.ArrayList;
import java.util.List;

import regex.transfer.TraducaoTO;

/**
 * Armazena traducoes individuais em uma lista de traducoes, e
 * contem metodos para extrair essas traducoes em varios formatos.
 * 
 * @author Tiso
 *
 */
public class Traducao {
	
	// ----- VARIAVEIS -----
	
	/** Lista de objetos TraducaoTO. */
	private List<TraducaoTO> traducoes = new ArrayList<TraducaoTO>();
	
	private boolean ocorreuErro = false;
	
	private String mensagemErro = "";
	
	private String posicaoErro = "";
	
	private StringBuffer buffer;
	
	private int posicao, nivel, tamanho;

	
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
	 * 
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
	 * @param to Um objeto de transferencia TraducaoTO
	 */
	public void addTraducao(TraducaoTO to){
		traducoes.add(to);
	}
	
	/**
	 * Retorna uma identacao de tamanho relativo
	 * ao valor inteiro passado.
	 * 
	 * @param n O nivel de identacao desejado
	 * @return Uma String contendo a identacao
	 */
	private String identacao (int n){
		
		String ident = "";
		
		for (int i = 0; i < n; i++) {
			ident += "   ";
		}
		
		return ident;
	}
	
	/**
	 * 
	 * @return Uma String com as traducoes em formato de arvore, utilizando
	 * listas nao ordenadas HTML.
	 */
	public String getTextHTML(){
		
		posicao	= 0;
		nivel	= 0;
		tamanho = traducoes.size();
		buffer	= new StringBuffer();
		
		//Abre a primeira lista
		buffer.append("<ul>");
		buffer.append("\n");
		
		buffer.append(listaRecursiva());
		
		//Fecha a primeira lista
		buffer.append("</ul>");
		buffer.append("\n");
		
		return buffer.toString();
		
	}
	
	/**
	 * @return Uma String contendo itens de lista (tags li) com as traducoes,
	 * construida recursivamente.
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
				bufferLocal.append(traducaoAtual.getTraducao());
				bufferLocal.append("</li>");
				bufferLocal.append("\n");
			}
			
			//Se o nivel se manteve e a traducao atual nao e terminal
			//insere a traducao dentro de uma tag 'li', e dentro dela
			//abre uma nova tag 'ul' e chama o metodo recursivamente
			//antes de fecha-la
			else if (novoNivel == nivel && !traducaoAtual.isTerminal()){
				
				//Abre um item de lista e insere a traducao nele
				bufferLocal.append("<li>");
				bufferLocal.append(traducaoAtual.getTraducao());
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
	 * @return As traducoes com quebras de linha e identacoes.
	 */
	public String getText(){
		
		buffer = new StringBuffer();
		int nivel;
		
		for (TraducaoTO to : traducoes) {
			
			nivel = to.getNivel();
			
			buffer.append(identacao(nivel));
			buffer.append(to.getTraducao());
			buffer.append("\n");
		}
		
		return buffer.toString();
	}
	
	/**
	 * 
	 * @return As traducoes com quebras de linha padrao Windows
	 * (Carriage Return + New line) e identacoes.
	 */
	public String getTextWindows(){
		
		buffer = new StringBuffer();
		int nivel;
		
		for (TraducaoTO to : traducoes) {
			
			nivel = to.getNivel();
			
			buffer.append(identacao(nivel));
			buffer.append(to.getTraducao());
			buffer.append("\r\n");
		}
		
		return buffer.toString();
	}
}
