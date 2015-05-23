package regex.transfer;

import regex.enumType.RegraRegex;

/**
 * Transfer Object que armazena as informações de uma traducao.
 * 
 * @author Tiso
 *
 */
public class TraducaoTO {
	
	
	// ----- VARIAVEIS -----
	
	/** O nivel de profundidade da arvore em que o elemento foi encontrado. */
	private int nivel;
	
	/** A traducao recebida. */
	private String traducao;
	
	/** O texto original do elemento, incluindo todos os textos abaixo dele. */
	private String original;
	
	/** A regra que disparou a traducao. */
	private RegraRegex tipoRegra;
	
	/** Indica se a regra é terminal ou não (se é um nó de árvore ou folha). */
	private boolean terminal;
	
	
	// ----- GETTERS -----
	
	public int getNivel() {
		return nivel;
	}
	public String getTraducao() {
		return traducao;
	}
	public String getOriginal() {
		return original;
	}
	public RegraRegex getTipoRegra() {
		return tipoRegra;
	}
	public boolean isTerminal() {
		return terminal;
	}
	
	
	// ----- SETTERS -----
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public void setTipoRegra(RegraRegex tipoRegra) {
		this.tipoRegra = tipoRegra;
	}
	public void setTerminal(boolean terminal) {
		this.terminal = terminal;
	}
	
}
