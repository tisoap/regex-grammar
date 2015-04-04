package regexGrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegularExpressionParser}.
 */
public interface RegularExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RegularExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RegularExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(RegularExpressionParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(RegularExpressionParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(RegularExpressionParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(RegularExpressionParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(RegularExpressionParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(RegularExpressionParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalGroup(RegularExpressionParser.NumericalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalGroup(RegularExpressionParser.NumericalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void enterNamedGroup(RegularExpressionParser.NamedGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void exitNamedGroup(RegularExpressionParser.NamedGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(RegularExpressionParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(RegularExpressionParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void enterNoCaptureGroup(RegularExpressionParser.NoCaptureGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void exitNoCaptureGroup(RegularExpressionParser.NoCaptureGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(RegularExpressionParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(RegularExpressionParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#quantified}.
	 * @param ctx the parse tree
	 */
	void enterQuantified(RegularExpressionParser.QuantifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#quantified}.
	 * @param ctx the parse tree
	 */
	void exitQuantified(RegularExpressionParser.QuantifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(RegularExpressionParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(RegularExpressionParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazy}.
	 * @param ctx the parse tree
	 */
	void enterLazy(RegularExpressionParser.LazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazy}.
	 * @param ctx the parse tree
	 */
	void exitLazy(RegularExpressionParser.LazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedy}.
	 * @param ctx the parse tree
	 */
	void enterGreedy(RegularExpressionParser.GreedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedy}.
	 * @param ctx the parse tree
	 */
	void exitGreedy(RegularExpressionParser.GreedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#exact}.
	 * @param ctx the parse tree
	 */
	void enterExact(RegularExpressionParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#exact}.
	 * @param ctx the parse tree
	 */
	void exitExact(RegularExpressionParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyOneOrMore(RegularExpressionParser.GreedyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyOneOrMore(RegularExpressionParser.GreedyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyZeroOrMore(RegularExpressionParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyZeroOrMore(RegularExpressionParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void enterGreedyConditional(RegularExpressionParser.GreedyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void exitGreedyConditional(RegularExpressionParser.GreedyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterGreedyAtLeast(RegularExpressionParser.GreedyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitGreedyAtLeast(RegularExpressionParser.GreedyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void enterGreedyBetween(RegularExpressionParser.GreedyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void exitGreedyBetween(RegularExpressionParser.GreedyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyOneOrMore(RegularExpressionParser.LazyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyOneOrMore(RegularExpressionParser.LazyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyZeroOrMore(RegularExpressionParser.LazyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyZeroOrMore(RegularExpressionParser.LazyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void enterLazyConditional(RegularExpressionParser.LazyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void exitLazyConditional(RegularExpressionParser.LazyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterLazyAtLeast(RegularExpressionParser.LazyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitLazyAtLeast(RegularExpressionParser.LazyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void enterLazyBetween(RegularExpressionParser.LazyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void exitLazyBetween(RegularExpressionParser.LazyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegularExpressionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegularExpressionParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void enterFirstValue(RegularExpressionParser.FirstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void exitFirstValue(RegularExpressionParser.FirstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void enterLastValue(RegularExpressionParser.LastValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void exitLastValue(RegularExpressionParser.LastValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(RegularExpressionParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(RegularExpressionParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(RegularExpressionParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(RegularExpressionParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(RegularExpressionParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(RegularExpressionParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(RegularExpressionParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(RegularExpressionParser.CharacterContext ctx);
}