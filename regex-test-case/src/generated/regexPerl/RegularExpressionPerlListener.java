package generated.regexPerl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegularExpressionPerlParser}.
 */
public interface RegularExpressionPerlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RegularExpressionPerlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RegularExpressionPerlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(RegularExpressionPerlParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(RegularExpressionPerlParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(RegularExpressionPerlParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(RegularExpressionPerlParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void enterNamedGroup(RegularExpressionPerlParser.NamedGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void exitNamedGroup(RegularExpressionPerlParser.NamedGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(RegularExpressionPerlParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(RegularExpressionPerlParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void enterNoCaptureGroup(RegularExpressionPerlParser.NoCaptureGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void exitNoCaptureGroup(RegularExpressionPerlParser.NoCaptureGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(RegularExpressionPerlParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(RegularExpressionPerlParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazy}.
	 * @param ctx the parse tree
	 */
	void enterLazy(RegularExpressionPerlParser.LazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazy}.
	 * @param ctx the parse tree
	 */
	void exitLazy(RegularExpressionPerlParser.LazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedy}.
	 * @param ctx the parse tree
	 */
	void enterGreedy(RegularExpressionPerlParser.GreedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedy}.
	 * @param ctx the parse tree
	 */
	void exitGreedy(RegularExpressionPerlParser.GreedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyOneOrMore(RegularExpressionPerlParser.GreedyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyOneOrMore(RegularExpressionPerlParser.GreedyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyZeroOrMore(RegularExpressionPerlParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyZeroOrMore(RegularExpressionPerlParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void enterGreedyConditional(RegularExpressionPerlParser.GreedyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void exitGreedyConditional(RegularExpressionPerlParser.GreedyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterGreedyAtLeast(RegularExpressionPerlParser.GreedyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitGreedyAtLeast(RegularExpressionPerlParser.GreedyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void enterGreedyBetween(RegularExpressionPerlParser.GreedyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void exitGreedyBetween(RegularExpressionPerlParser.GreedyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyOneOrMore(RegularExpressionPerlParser.LazyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyOneOrMore(RegularExpressionPerlParser.LazyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyZeroOrMore(RegularExpressionPerlParser.LazyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyZeroOrMore(RegularExpressionPerlParser.LazyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void enterLazyConditional(RegularExpressionPerlParser.LazyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void exitLazyConditional(RegularExpressionPerlParser.LazyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterLazyAtLeast(RegularExpressionPerlParser.LazyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitLazyAtLeast(RegularExpressionPerlParser.LazyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void enterLazyBetween(RegularExpressionPerlParser.LazyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void exitLazyBetween(RegularExpressionPerlParser.LazyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(RegularExpressionPerlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(RegularExpressionPerlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(RegularExpressionPerlParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(RegularExpressionPerlParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(RegularExpressionPerlParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(RegularExpressionPerlParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalGroup(RegularExpressionPerlParser.NumericalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalGroup(RegularExpressionPerlParser.NumericalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(RegularExpressionPerlParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(RegularExpressionPerlParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#quantified}.
	 * @param ctx the parse tree
	 */
	void enterQuantified(RegularExpressionPerlParser.QuantifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#quantified}.
	 * @param ctx the parse tree
	 */
	void exitQuantified(RegularExpressionPerlParser.QuantifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterOneOrMore(RegularExpressionPerlParser.OneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitOneOrMore(RegularExpressionPerlParser.OneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMore(RegularExpressionPerlParser.ZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMore(RegularExpressionPerlParser.ZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(RegularExpressionPerlParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(RegularExpressionPerlParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#exact}.
	 * @param ctx the parse tree
	 */
	void enterExact(RegularExpressionPerlParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#exact}.
	 * @param ctx the parse tree
	 */
	void exitExact(RegularExpressionPerlParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void enterAtLeast(RegularExpressionPerlParser.AtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void exitAtLeast(RegularExpressionPerlParser.AtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(RegularExpressionPerlParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(RegularExpressionPerlParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegularExpressionPerlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegularExpressionPerlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void enterFirstValue(RegularExpressionPerlParser.FirstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void exitFirstValue(RegularExpressionPerlParser.FirstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void enterLastValue(RegularExpressionPerlParser.LastValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void exitLastValue(RegularExpressionPerlParser.LastValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RegularExpressionPerlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RegularExpressionPerlParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void enterNegativeList(RegularExpressionPerlParser.NegativeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void exitNegativeList(RegularExpressionPerlParser.NegativeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void enterPositiveList(RegularExpressionPerlParser.PositiveListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void exitPositiveList(RegularExpressionPerlParser.PositiveListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(RegularExpressionPerlParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(RegularExpressionPerlParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(RegularExpressionPerlParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(RegularExpressionPerlParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPerlParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(RegularExpressionPerlParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPerlParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(RegularExpressionPerlParser.CharacterContext ctx);
}