package test.visitors;

import generated.regexERE.RegularExpressionEREBaseVisitor;
import generated.regexERE.RegularExpressionEREParser.*;


public class TestRegexVisitorERE extends RegularExpressionEREBaseVisitor<Void> {
	
	private String identacao = "";
	private int nivelIdentacaoAtual = 0;
	private int contadorGruposNumericos = 0;
	
	
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
	public void identacao (String texto){
		
		identacao = calcularIdentacao(nivelIdentacaoAtual);
		
		System.out.println(identacao + texto);
	}
	
	/** Imprime um texto na tela usando um nivel a menos da identacao atual. */
	public void menosIdentacao (String texto){
		
		int nivel = nivelIdentacaoAtual - 1;
		
		identacao = calcularIdentacao(nivel);
		
		System.out.println(identacao + texto);
	}
	
	/** Visitors */
	
	/** Quando visita uma expressao, visita todos os filhos dela. */
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma subexpressao, aumenta o nivel de identacao
	 *  e visita todos os filhos dela. */
	@Override
	public Void visitSubExpression(SubExpressionContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita multiplas opcoes, aumenta o nivel de identacao,
	 *  imprime 'Uma das alternativas: ' e visita todos os filhos. */
	@Override
	public Void visitMultiple(MultipleContext ctx) {
		
		nivelIdentacaoAtual++;
		
		menosIdentacao("Uma das alternativas: ");
		
		visitChildren(ctx);
		
		nivelIdentacaoAtual--;
		
		return null;
	}
	
	
	/** Quando visita um grupo, aumenta o nivel de identacao
	 *  e visita todos os filhos. */
	@Override
	public Void visitGroup(GroupContext ctx) {
		
		nivelIdentacaoAtual++;
		
		visitChildren(ctx);
		
		nivelIdentacaoAtual--;
		
		return null;
	}
	
	/** Quando visita um grupo numerico, aumenta o contador de 
	 *  grupos numericos, imprime 'Grupo' + o contador 
	 *  e visita todos os filhos. */
	@Override
	public Void visitNumericalGroup(NumericalGroupContext ctx) {
		
		contadorGruposNumericos++;
		
		menosIdentacao("Grupo " + contadorGruposNumericos + ":");
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma repeticao, aumenta o nivel de identacao,
	 *  visita o simbolo quantificador seguido da expressao quantificada. */
	@Override
	public Void visitRepetition(RepetitionContext ctx) {
		
		nivelIdentacaoAtual++;
		
		//Visita o simbolo quantificador
		visit(ctx.quantifier());
		
		//Visita a expressao quantificada
		visit(ctx.quantified());
		
		nivelIdentacaoAtual--;
		
		return null;
	}
	
	/** Quando visita um quantificador, visita todos os filhos dele. */
	@Override
	public Void visitQuantifier(QuantifierContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita o quantificador '+', imprime 'Um ou mais:'. */
	@Override
	public Void visitOneOrMore(OneOrMoreContext ctx) {
		
		menosIdentacao("Um ou mais:");
		
		return null;
	}
	
	/** Quando visita o quantificador '*', imprime 'Zero ou mais:'. */
	@Override
	public Void visitZeroOrMore(ZeroOrMoreContext ctx) {
		
		menosIdentacao("Zero ou mais:");
		
		return null;
	}
	
	/** Quando visita o quantificador '?', imprime 'Pode ou nao conter:'. */
	@Override
	public Void visitConditional(ConditionalContext ctx) {
		
		menosIdentacao("Pode ou nao conter:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n}, recupera o valor de n
	 *  e imprime 'Exatamente ' + valor + 'ocorrencias de:'. */
	@Override
	public Void visitExact(ExactContext ctx) {
		
		menosIdentacao("Exatamente " + ctx.value().getText() + " ocorrencias de:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n,}, recupera o valor de n
	 *  e imprime 'Pelo menos ' + n + 'ocorrencias de:'. */
	@Override
	public Void visitAtLeast(AtLeastContext ctx) {
		
		menosIdentacao("Pelo menos " + ctx.value().getText() + " ocorrencias de:");
		
		return null;
	}
	
	/** Quando visita o quantificador {n,m}, recupera os valores de n e m
	 *  e imprime 'Entre ' + n + ' e ' + m + 'ocorrencias de:'. */
	@Override
	public Void visitBetween(BetweenContext ctx) {
		
		menosIdentacao(
				"Entre " + 
				ctx.firstValue().getText() + 
				" e " + 
				ctx.lastValue().getText() + 
				" ocorrencias de:");
		
		return null;
	}
	
	/** Quando visita uma expressao quantificada, visita todos os filhos dela. */
	@Override
	public Void visitQuantified(QuantifiedContext ctx) {
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma lista, aumenta o nivel de identacao
	 *  e visita todos os filhos dela. */
	@Override
	public Void visitList(ListContext ctx) {
		
		nivelIdentacaoAtual++;
		
		visitChildren(ctx);
		
		nivelIdentacaoAtual--;
		
		return null;
	}
	
	/** Quando visita uma lista negativa, imprime 'Qualquer caractere que nao seja:'
	 *  e visita todos os filhos dela. */
	@Override
	public Void visitNegativeList(NegativeListContext ctx) {
		
		menosIdentacao("Qualquer caractere que nao seja:");
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma lista positiva, imprime 'Qualquer um dos caracteres:'
	 *  e visita todos os filhos dela. */
	@Override
	public Void visitPositiveList(PositiveListContext ctx) {
		
		menosIdentacao("Qualquer um dos caracteres:");
		
		visitChildren(ctx);
		
		return null;
	}
	
	/** Quando visita uma serie de caracteres, recupera o caractere da esquerda
	 *  e o caractere da direita, e imprime 'Todos os caracteres entre ESQUERDA e DIREITA'. */
	@Override
	public Void visitRange(RangeContext ctx) {
		
		/**
		 * Uma serie tem o formato A-B, onde A e B sao caracteres.
		 * Os filhos serao:
		 * 0: A
		 * 1: -
		 * 2: B
		 */
		identacao(
			"Todos os caracteres entre '" + 
			ctx.getChild(0).getText() + 
			"' e '" + 
			ctx.getChild(2).getText() + 
			"'");
		
		return null;
	}
	
	/** Quando visita uma colecao de caracteres, imprime 
	 *  'Caracteres: ' + a String da colecao. */
	@Override
	public Void visitCharacters(CharactersContext ctx) {
		
		identacao("Caracteres: " + ctx.getText());
		
		return null;
	}
	
	/** Quando visita um caractere, imprime 'Caractere: '
	 *  + o caractere .*/
	@Override
	public Void visitCharacter(CharacterContext ctx) {
		
		identacao(ctx.getText());
		
		return null;
	}

}
