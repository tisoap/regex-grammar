package teste.to;

import teste.enumType.Regra;

/**
 * Transfer Object que armazena os dados de uma traducao, vindos
 * de um elemento de uma expressao regular.
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
	private Regra tipoRegra;
	
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
	public Regra getTipoRegra() {
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
	public void setTipoRegra(Regra tipoRegra) {
		this.tipoRegra = tipoRegra;
	}
	public void setTerminal(boolean terminal) {
		this.terminal = terminal;
	}
	
}
