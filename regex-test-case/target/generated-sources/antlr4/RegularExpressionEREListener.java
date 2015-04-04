// Generated from RegularExpressionERE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegularExpressionEREParser}.
 */
public interface RegularExpressionEREListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RegularExpressionEREParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RegularExpressionEREParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(RegularExpressionEREParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(RegularExpressionEREParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(RegularExpressionEREParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(RegularExpressionEREParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(RegularExpressionEREParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(RegularExpressionEREParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalGroup(RegularExpressionEREParser.NumericalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalGroup(RegularExpressionEREParser.NumericalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(RegularExpressionEREParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(RegularExpressionEREParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#quantified}.
	 * @param ctx the parse tree
	 */
	void enterQuantified(RegularExpressionEREParser.QuantifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#quantified}.
	 * @param ctx the parse tree
	 */
	void exitQuantified(RegularExpressionEREParser.QuantifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(RegularExpressionEREParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(RegularExpressionEREParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterOneOrMore(RegularExpressionEREParser.OneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitOneOrMore(RegularExpressionEREParser.OneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMore(RegularExpressionEREParser.ZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMore(RegularExpressionEREParser.ZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(RegularExpressionEREParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(RegularExpressionEREParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#exact}.
	 * @param ctx the parse tree
	 */
	void enterExact(RegularExpressionEREParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#exact}.
	 * @param ctx the parse tree
	 */
	void exitExact(RegularExpressionEREParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void enterAtLeast(RegularExpressionEREParser.AtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void exitAtLeast(RegularExpressionEREParser.AtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(RegularExpressionEREParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(RegularExpressionEREParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegularExpressionEREParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegularExpressionEREParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void enterFirstValue(RegularExpressionEREParser.FirstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void exitFirstValue(RegularExpressionEREParser.FirstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void enterLastValue(RegularExpressionEREParser.LastValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void exitLastValue(RegularExpressionEREParser.LastValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RegularExpressionEREParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RegularExpressionEREParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void enterNegativeList(RegularExpressionEREParser.NegativeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void exitNegativeList(RegularExpressionEREParser.NegativeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void enterPositiveList(RegularExpressionEREParser.PositiveListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void exitPositiveList(RegularExpressionEREParser.PositiveListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(RegularExpressionEREParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(RegularExpressionEREParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(RegularExpressionEREParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(RegularExpressionEREParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(RegularExpressionEREParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(RegularExpressionEREParser.CharacterContext ctx);
}