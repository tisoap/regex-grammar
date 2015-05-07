package teste;

import java.util.ArrayList;
import java.util.List;

import teste.to.TraducaoTO;

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
	 * Monta um texto HTML com listas nao ordenadas 'ul', que contem
	 * as traducoes em itens de lista.
	 * 
	 * @return String contendo uma lista nao ordenada HMTL
	 * com todas as traducoes.
	 */
	//TODO corrigir construcao em listas
	public String getTextHTML(){
		
		int nivel		= 0;
		int novoNivel	= 0;
		int lista		= traducoes.size();
		buffer 			= new StringBuffer();
		
		//Abre a primeira lista
		buffer.append("<ul>");
		buffer.append("\n");
		
		//Para cada item na lista de traducoes
		for (int i=0; i<lista; i++) {
			
			//Recupera a traducao atual
			TraducaoTO traducaoAtual = traducoes.get(i);
			
			//Recupera o nivel de profundidade da traducao
			novoNivel = traducaoAtual.getNivel();
			
			//Se o nivel da traducao for maior ou igual que o anterior,
			//e ela for terminal, insere a traducao em uma tag li
			if (novoNivel >= nivel && traducaoAtual.isTerminal()) {
				
				buffer.append("<li>");
				buffer.append(traducaoAtual.getTraducao());
				buffer.append("</li>");
				buffer.append("\n");
				
				nivel = novoNivel;
			}
			
			//Se o nivel da traducao for maior ou igual que o anterior,
			//e ela nao for terminal, insere a traducao em uma tag li,
			//e dentro dela abre uma nova tag ul
			else if (novoNivel >= nivel && !traducaoAtual.isTerminal()) {
				
				buffer.append("<li>");
				buffer.append(traducaoAtual.getTraducao());
				buffer.append("\n");
				buffer.append("<ul>");
				buffer.append("\n");
				
				nivel = novoNivel;
			}
			
			//Se o nivel da traducao for menor que o anterior,
			//e ela for terminal, fecha a tag ul anterior
			//e insere a traducao em uma nova tag li
			else if (novoNivel < nivel && traducaoAtual.isTerminal()){
				
				while (novoNivel < nivel){
					buffer.append("</ul>");
					buffer.append("\n");
					nivel--;
				}
				
				buffer.append("<li>");
				buffer.append(traducaoAtual.getTraducao());
				buffer.append("</li>");
				buffer.append("\n");
				
				nivel = novoNivel;
			}
			
			//Se o nivel da traducao for menor que o anterior,
			//e ela nao for terminal, fecha a tag ul anterior,
			//insere a traducao em uma nova tag li, e dentro dela
			//abre uma nova tag ul
			else if (novoNivel < nivel && !traducaoAtual.isTerminal()){
				
				while (novoNivel < nivel){
					buffer.append("</ul>");
					buffer.append("\n");
					nivel--;
				}
				
				buffer.append("<li>");
				buffer.append(traducaoAtual.getTraducao());
				buffer.append("\n");
				buffer.append("<ul>");
				buffer.append("\n");
				
				nivel = novoNivel;
			}
		}
		
		//Fecha todas as tags ul e li restantes
		while (nivel != 0){
			nivel--;
			
			buffer.append("</ul>");
			buffer.append("\n");
			buffer.append("</li>");
			buffer.append("\n");
		}
		
		//Fecha a primeira lista
		buffer.append("</ul>");
		buffer.append("\n");
		
		
		return buffer.toString();
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
