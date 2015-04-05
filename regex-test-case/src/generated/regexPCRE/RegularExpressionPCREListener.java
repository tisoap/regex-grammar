package generated.regexPCRE;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegularExpressionPCREParser}.
 */
public interface RegularExpressionPCREListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RegularExpressionPCREParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RegularExpressionPCREParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(RegularExpressionPCREParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(RegularExpressionPCREParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(RegularExpressionPCREParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(RegularExpressionPCREParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void enterNamedGroup(RegularExpressionPCREParser.NamedGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void exitNamedGroup(RegularExpressionPCREParser.NamedGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(RegularExpressionPCREParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(RegularExpressionPCREParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void enterNoCaptureGroup(RegularExpressionPCREParser.NoCaptureGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void exitNoCaptureGroup(RegularExpressionPCREParser.NoCaptureGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(RegularExpressionPCREParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(RegularExpressionPCREParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazy}.
	 * @param ctx the parse tree
	 */
	void enterLazy(RegularExpressionPCREParser.LazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazy}.
	 * @param ctx the parse tree
	 */
	void exitLazy(RegularExpressionPCREParser.LazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedy}.
	 * @param ctx the parse tree
	 */
	void enterGreedy(RegularExpressionPCREParser.GreedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedy}.
	 * @param ctx the parse tree
	 */
	void exitGreedy(RegularExpressionPCREParser.GreedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyOneOrMore(RegularExpressionPCREParser.GreedyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyOneOrMore(RegularExpressionPCREParser.GreedyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyZeroOrMore(RegularExpressionPCREParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyZeroOrMore(RegularExpressionPCREParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void enterGreedyConditional(RegularExpressionPCREParser.GreedyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void exitGreedyConditional(RegularExpressionPCREParser.GreedyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterGreedyAtLeast(RegularExpressionPCREParser.GreedyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitGreedyAtLeast(RegularExpressionPCREParser.GreedyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void enterGreedyBetween(RegularExpressionPCREParser.GreedyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void exitGreedyBetween(RegularExpressionPCREParser.GreedyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyOneOrMore(RegularExpressionPCREParser.LazyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyOneOrMore(RegularExpressionPCREParser.LazyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyZeroOrMore(RegularExpressionPCREParser.LazyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyZeroOrMore(RegularExpressionPCREParser.LazyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void enterLazyConditional(RegularExpressionPCREParser.LazyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void exitLazyConditional(RegularExpressionPCREParser.LazyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterLazyAtLeast(RegularExpressionPCREParser.LazyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitLazyAtLeast(RegularExpressionPCREParser.LazyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void enterLazyBetween(RegularExpressionPCREParser.LazyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void exitLazyBetween(RegularExpressionPCREParser.LazyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(RegularExpressionPCREParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(RegularExpressionPCREParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(RegularExpressionPCREParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(RegularExpressionPCREParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(RegularExpressionPCREParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(RegularExpressionPCREParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalGroup(RegularExpressionPCREParser.NumericalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalGroup(RegularExpressionPCREParser.NumericalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(RegularExpressionPCREParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(RegularExpressionPCREParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#quantified}.
	 * @param ctx the parse tree
	 */
	void enterQuantified(RegularExpressionPCREParser.QuantifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#quantified}.
	 * @param ctx the parse tree
	 */
	void exitQuantified(RegularExpressionPCREParser.QuantifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterOneOrMore(RegularExpressionPCREParser.OneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#oneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitOneOrMore(RegularExpressionPCREParser.OneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterZeroOrMore(RegularExpressionPCREParser.ZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitZeroOrMore(RegularExpressionPCREParser.ZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(RegularExpressionPCREParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(RegularExpressionPCREParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#exact}.
	 * @param ctx the parse tree
	 */
	void enterExact(RegularExpressionPCREParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#exact}.
	 * @param ctx the parse tree
	 */
	void exitExact(RegularExpressionPCREParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void enterAtLeast(RegularExpressionPCREParser.AtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#atLeast}.
	 * @param ctx the parse tree
	 */
	void exitAtLeast(RegularExpressionPCREParser.AtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(RegularExpressionPCREParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(RegularExpressionPCREParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegularExpressionPCREParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegularExpressionPCREParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void enterFirstValue(RegularExpressionPCREParser.FirstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void exitFirstValue(RegularExpressionPCREParser.FirstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void enterLastValue(RegularExpressionPCREParser.LastValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void exitLastValue(RegularExpressionPCREParser.LastValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RegularExpressionPCREParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RegularExpressionPCREParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void enterNegativeList(RegularExpressionPCREParser.NegativeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#negativeList}.
	 * @param ctx the parse tree
	 */
	void exitNegativeList(RegularExpressionPCREParser.NegativeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void enterPositiveList(RegularExpressionPCREParser.PositiveListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#positiveList}.
	 * @param ctx the parse tree
	 */
	void exitPositiveList(RegularExpressionPCREParser.PositiveListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(RegularExpressionPCREParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(RegularExpressionPCREParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(RegularExpressionPCREParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(RegularExpressionPCREParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionPCREParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(RegularExpressionPCREParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionPCREParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(RegularExpressionPCREParser.CharacterContext ctx);
}