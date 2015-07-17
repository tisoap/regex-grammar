package regex.transfer;

import regex.enumType.RegraRegex;

public class UserdataTO {
	
	// ----- VARIAVEIS -----
	
	/** O nivel de profundidade da arvore em que o elemento foi encontrado. */
	private int nivel;
	
	/** A regra na qual o elemento pertence */
	private RegraRegex tipoRegra;
	
	/** Indica se o elemento é terminal ou não */
	private boolean terminal;
	
	/** O texto do elemento (se aplicavel) */
	private String texto = null;
	
	// ----- GETTERS -----
	
	public String getTexto() {
		return texto;
	}
	public int getNivel() {
		return nivel;
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
	public void setTipoRegra(RegraRegex tipoRegra) {
		this.tipoRegra = tipoRegra;
	}
	public void setTerminal(boolean terminal) {
		this.terminal = terminal;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
