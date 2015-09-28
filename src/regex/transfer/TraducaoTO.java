package regex.transfer;

import regex.enumType.RegraRegex;

/**
 * Transfer Object que armazena as informações de uma traducao.
 */
public class TraducaoTO {

	// ----- VARIAVEIS -----

	/** O nivel de profundidade da arvore em que o elemento foi encontrado. */
	private int nivel;

	/** A traducao recebida. */
	private String traducao;
	
	/** A traducao recebida, onde os caracteres especiais sao
	 *  entidades HTML. */
	private String traducaoHTML;

	/** O texto original do elemento, incluindo todos os textos abaixo dele. */
	private String textoOriginal;

	/** Primeiro caractere de um elemento de regra "RANGE" ou "LIST_FIRST_RANGE" */
	private String caractere1;

	/** Segundo caractere de um elemento de regra "RANGE" ou "LIST_FIRST_RANGE" */
	private String caractere2;

	/** A regra que disparou a traducao. */
	private RegraRegex tipoRegra;

	/** Indica se a regra é terminal ou não (se é um nó de árvore ou folha). */
	private boolean terminal;

	/** Primeiro numero de um elemento de regra "EXACT", "AT_LEAST" ou "BETWEEN" */
	private int numero1;

	/** Segundo numero de um elemento de regra "BETWEEN" */
	private int numero2;

	// ----- GETTERS -----
	public int getNivel() {
		return nivel;
	}
	public String getTraducao() {
		return traducao;
	}
	public String getTextoOriginal() {
		return textoOriginal;
	}
	public String getCaractere1() {
		return caractere1;
	}
	public String getCaractere2() {
		return caractere2;
	}
	public RegraRegex getTipoRegra() {
		return tipoRegra;
	}
	public boolean isTerminal() {
		return terminal;
	}
	public int getNumero1() {
		return numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public String getTraducaoHTML() {
		return traducaoHTML;
	}

	// ----- SETTERS -----
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}
	public void setTextoOriginal(String textoOriginal) {
		this.textoOriginal = textoOriginal;
	}
	public void setCaractere1(String caractere1) {
		this.caractere1 = caractere1;
	}
	public void setCaractere2(String caractere2) {
		this.caractere2 = caractere2;
	}
	public void setTipoRegra(RegraRegex tipoRegra) {
		this.tipoRegra = tipoRegra;
	}
	public void setTerminal(boolean terminal) {
		this.terminal = terminal;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public void setTraducaoHTML(String traducaoHTML) {
		this.traducaoHTML = traducaoHTML;
	}

}
