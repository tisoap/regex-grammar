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
	
	/** Lista de objetos TraducaoTO. */
	private List<TraducaoTO> traducoes = new ArrayList<TraducaoTO>();
	
	/**
	 * 
	 * @return A lista contendo todos os objetos de traducao.
	 */
	public List<TraducaoTO> getTraducoes() {
		return traducoes;
	}
	
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
	 * Monta um texto HTML com listas ordenadas, que contem
	 * as traducoes em itens de lista.
	 * 
	 * @return String contendo uma lista ordenada HMTL
	 * com todas as traducoes.
	 */
	public String getTextHTML(){
		
		StringBuffer buffer = new StringBuffer();
		
		//Os niveis iniciais comecam zerados
		int nivel		= 0;
		int novoNivel	= 0;
		
		//Abre a primeira lista ordenada
		buffer.append("<ol>");
		buffer.append("\n");
		
		//Para cada traducao individual na lista de traducoes
		for (TraducaoTO to : traducoes) {
			
			//Recupera o nivel de profundidade da traducao
			novoNivel = to.getNivel();
			
			//Se o nivel for igual ao atual
			if (novoNivel == nivel) {
				
				//Insere a traducao em uma nova tag <li>
				buffer.append(identacao(nivel));
				buffer.append("<li>");
				buffer.append(to.getTraducao());
				buffer.append("</li>");
				buffer.append("\n");
				
			}
			
			//Se o nivel for maior que o atual
			else if (novoNivel > nivel) {
				
				//Insere uma tag <li>, e dentro dela uma tag <ol>,
				//e dentro dela uma tag <li> com a traducao
				
				buffer.append(identacao(nivel));
				buffer.append("<li>");
				buffer.append("\n");
				buffer.append(identacao(nivel));
				buffer.append("<ol>");
				buffer.append("\n");
				buffer.append(identacao(novoNivel));
				buffer.append("<li>");
				buffer.append(to.getTraducao());
				buffer.append("</li>");
				buffer.append("\n");
				
				//Atualiza o nivel atual
				nivel = novoNivel;
			}
			
			//Se o nivel for menor que o atual
			else if (novoNivel < nivel){
				
				//Fecha a tag <ol>, fecha a tag <li>
				//e cria uma nava tag <li> com a traducao
				
				buffer.append(identacao(novoNivel));
				buffer.append("</ol>");
				buffer.append("\n");
				buffer.append(identacao(novoNivel));
				buffer.append("<li>");
				buffer.append(to.getTraducao());
				buffer.append("</li>");
				buffer.append("\n");
				
				//Atualiza o nivel atual
				nivel = novoNivel;
			}
		}
		
		//Fecha as tags <ol> e <li> restantes
		while (nivel != 0){
			nivel--;
			
			buffer.append(identacao(nivel));
			buffer.append("</ol>");
			buffer.append("\n");
			buffer.append(identacao(nivel));
			buffer.append("</li>");
			buffer.append("\n");
		}
		
		//Fecha a primeira lista ordenada
		buffer.append("</ol>");
		buffer.append("\n");
		
		
		return buffer.toString();
	}
	
	/**
	 * @return As traducoes com quebras de linha e identacoes.
	 */
	public String getText(){
		
		StringBuffer buffer = new StringBuffer();
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
	 * e identacoes.
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
		
		return buffer.toString();
	}
}
