package test.visitors;

import generated.regexPCRE.RegularExpressionPCREBaseVisitor;
import generated.regexPCRE.RegularExpressionPCREParser.*;

/** Listener que vai ouvir os callbacks do ParseTreeWalker quando estiver caminhado
 *  por uma arvore. Dependendo do tipo de callback, sera imprimido um texto na tela. */

public class TestRegexVisitorPCRE extends RegularExpressionPCREBaseVisitor<String> {
	
	private String identacao = "";
	private int nivelIdentacaoAtual = 0;
	
	
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
	
	
	/** Visitors */
	//TODO Implementar visitors
	
	@Override
	public String visitExpression(ExpressionContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public String visitCharacters(CharactersContext ctx) {
		return ctx.getText();
	}

}
