package test.visitors;

import generated.regexERE.RegularExpressionEREBaseVisitor;
import generated.regexERE.RegularExpressionEREParser.*;


public class TestRegexVisitorERE extends RegularExpressionEREBaseVisitor<String> {
	
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
	
	/** Quando visita uma expressao, visita todos os filhos dela e
	 * retorna o resultado. */
	@Override
	public String visitExpression(ExpressionContext ctx) {
		return visitChildren(ctx);
	}
	
	/** Quando visita uma colecao de caracteres, retorna um texto contendo 
	 *  'Caracteres: ' + a String da colecao. */
	@Override
	public String visitCharacters(CharactersContext ctx) {
		
		String caracteres = "Caracteres: " + ctx.getText();
		
		return caracteres;
	}

}
