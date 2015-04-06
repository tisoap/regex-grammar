package test.listeners;

import generated.regexPCRE.RegularExpressionPCREBaseListener;
import generated.regexPCRE.RegularExpressionPCREParser.*;

/** Listener que vai ouvir os callbacks do ParseTreeWalker quando estiver caminhado
 *  por uma arvore. Dependendo do tipo de callback, sera imprimido um texto na tela. */

public class TestRegexListenerPCRE extends RegularExpressionPCREBaseListener {
	
	private String identacao = "";
	private String caracteres = "";
	private int nivelIdentacaoAtual = 0;
	private int contadorGruposNumerados = 0;
	
	
	/**  ------- Metodos auxiliares  ------- */
	
	/** 
	 * Cria uma identacao de espacos de acordo com o nivel desejado.
	 * 
	 * @param x O nivel de identacao desejado.
	 * @return Uma String com 3 espacos vezes o numero da identacao.*/
	public String calcularIdentacao (int x) {
		
		String ident = "";
		
		for (int i = 0; i < x; i++){
			ident += "   ";
		}
		
		return ident;
	}
	
	/** Imprime um texto na tela usando a identacao atual. */
	public void imprime (String texto){
		identacao = calcularIdentacao(nivelIdentacaoAtual);
		System.out.println(identacao + texto);
	}
	
	/** Imprime um texto na tela usando um nivel a menos da identacao atual. */
	public void imprimeMenosIdentacao (String texto){
		int nivel = nivelIdentacaoAtual - 1;
		identacao = calcularIdentacao(nivel);
		System.out.println(identacao + texto);
	}
	
	
	
	/** ------- Listeners ------- */
	
	/** Quando entra em um conjunto de caracteres, imprime
	 * 'Caracteres: ' + os caracteres do conjunto. */
	@Override
	public void enterCharacters(CharactersContext ctx) {
		caracteres = ctx.getText();
		imprime("Caracteres: " + caracteres);
	}
	
	/** Quando entra em um grupo, aumenta o nivel de identacao. */
	@Override
	public void enterGroup(GroupContext ctx) {
		nivelIdentacaoAtual++;
	}
	
	/** Quando sai de um grupo, diminui o nivel de identacao. */
	@Override
	public void exitGroup(GroupContext ctx) {
		nivelIdentacaoAtual--;
	}
	
	/** Quando entra em um conjunto de multiplas opcoes, imprime 'Uma das seguintes opcoes:'*/
	@Override
	public void enterMultiple(MultipleContext ctx) {
		imprime("Uma das seguintes opcoes:");
	}
	
	/** Quando entra em uma subexpressao, aumenta o nivel de identacao. */
	@Override
	public void enterSubExpression(SubExpressionContext ctx) {
		nivelIdentacaoAtual++;
	}
	
	/** Quando sai de uma subexpressao, diminui o nivel de identacao. */
	@Override
	public void exitSubExpression(SubExpressionContext ctx) {
		nivelIdentacaoAtual--;
	}
	
	/** Quando entra em um grupo numerico, aumenta o contador de grupos numericos, 
	 *  e imprime 'Grupo Numerado ' + o numero do contador. */
	@Override
	public void enterNumericalGroup(NumericalGroupContext ctx) {
		contadorGruposNumerados++;
		imprimeMenosIdentacao("Grupo Numerado " + contadorGruposNumerados);
	}
	
	/** Quando entra em um grupo nomeado, imprime 'Grupo Nomeado ' + o nome do grupo
	 *  entre parenteses. */
	@Override
	public void enterNamedGroup(NamedGroupContext ctx) {

		//Recupera o nome do grupo
		String groupName = ctx.groupName().getText();
		
		imprimeMenosIdentacao("Grupo Nomeado \"" + groupName + "\"");
	}
	
	/** Quando entra em um grupo de nao captura, imprime 'Grupo de Nao Captura'. */
	@Override
	public void enterNoCaptureGroup(NoCaptureGroupContext ctx) {
		imprimeMenosIdentacao("Grupo de Nao Captura");
	}
	
	/** Quando entra em um comentario, imprime 'Comentario' + o texto do comentario
	 *  entre aspas. */
	@Override
	public void enterComment(CommentContext ctx) {
		
		//Recupera o texto do comentario
		String commentText = ctx.commentText().getText();
		
		imprime("Comentario: \"" + commentText + "\"");
	}
	
	@Override
	public void enterOneOrMore(OneOrMoreContext ctx) {
		imprime("Um ou mais");
	}

}
