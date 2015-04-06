// Generated from RegularExpressionERE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegularExpressionEREParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegularExpressionEREVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RegularExpressionEREParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(RegularExpressionEREParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(RegularExpressionEREParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(RegularExpressionEREParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#numericalGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalGroup(RegularExpressionEREParser.NumericalGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(RegularExpressionEREParser.RepetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#quantified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified(RegularExpressionEREParser.QuantifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(RegularExpressionEREParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#oneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrMore(RegularExpressionEREParser.OneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMore(RegularExpressionEREParser.ZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(RegularExpressionEREParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#exact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact(RegularExpressionEREParser.ExactContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#atLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtLeast(RegularExpressionEREParser.AtLeastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(RegularExpressionEREParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RegularExpressionEREParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#firstValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstValue(RegularExpressionEREParser.FirstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#lastValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastValue(RegularExpressionEREParser.LastValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(RegularExpressionEREParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#negativeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeList(RegularExpressionEREParser.NegativeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#positiveList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveList(RegularExpressionEREParser.PositiveListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(RegularExpressionEREParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(RegularExpressionEREParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(RegularExpressionEREParser.CharacterContext ctx);
}