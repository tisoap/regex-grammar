// Generated from RegularExpression.g4 by ANTLR 4.4
package regexGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegularExpressionParser}.
 */
public interface RegularExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterGreedyAtLeast(@NotNull RegularExpressionParser.GreedyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitGreedyAtLeast(@NotNull RegularExpressionParser.GreedyAtLeastContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void enterLastValue(@NotNull RegularExpressionParser.LastValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lastValue}.
	 * @param ctx the parse tree
	 */
	void exitLastValue(@NotNull RegularExpressionParser.LastValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void enterFirstValue(@NotNull RegularExpressionParser.FirstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#firstValue}.
	 * @param ctx the parse tree
	 */
	void exitFirstValue(@NotNull RegularExpressionParser.FirstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazy}.
	 * @param ctx the parse tree
	 */
	void enterLazy(@NotNull RegularExpressionParser.LazyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazy}.
	 * @param ctx the parse tree
	 */
	void exitLazy(@NotNull RegularExpressionParser.LazyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(@NotNull RegularExpressionParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(@NotNull RegularExpressionParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(@NotNull RegularExpressionParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(@NotNull RegularExpressionParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyOneOrMore(@NotNull RegularExpressionParser.GreedyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyOneOrMore(@NotNull RegularExpressionParser.GreedyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(@NotNull RegularExpressionParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(@NotNull RegularExpressionParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull RegularExpressionParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull RegularExpressionParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedy}.
	 * @param ctx the parse tree
	 */
	void enterGreedy(@NotNull RegularExpressionParser.GreedyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedy}.
	 * @param ctx the parse tree
	 */
	void exitGreedy(@NotNull RegularExpressionParser.GreedyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterGreedyZeroOrMore(@NotNull RegularExpressionParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitGreedyZeroOrMore(@NotNull RegularExpressionParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void enterLazyConditional(@NotNull RegularExpressionParser.LazyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyConditional}.
	 * @param ctx the parse tree
	 */
	void exitLazyConditional(@NotNull RegularExpressionParser.LazyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void enterLazyBetween(@NotNull RegularExpressionParser.LazyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyBetween}.
	 * @param ctx the parse tree
	 */
	void exitLazyBetween(@NotNull RegularExpressionParser.LazyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull RegularExpressionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull RegularExpressionParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull RegularExpressionParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull RegularExpressionParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(@NotNull RegularExpressionParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(@NotNull RegularExpressionParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull RegularExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull RegularExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(@NotNull RegularExpressionParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(@NotNull RegularExpressionParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyZeroOrMore(@NotNull RegularExpressionParser.LazyZeroOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyZeroOrMore(@NotNull RegularExpressionParser.LazyZeroOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalGroup(@NotNull RegularExpressionParser.NumericalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#numericalGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalGroup(@NotNull RegularExpressionParser.NumericalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(@NotNull RegularExpressionParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(@NotNull RegularExpressionParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void enterNamedGroup(@NotNull RegularExpressionParser.NamedGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#namedGroup}.
	 * @param ctx the parse tree
	 */
	void exitNamedGroup(@NotNull RegularExpressionParser.NamedGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(@NotNull RegularExpressionParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(@NotNull RegularExpressionParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#quantified}.
	 * @param ctx the parse tree
	 */
	void enterQuantified(@NotNull RegularExpressionParser.QuantifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#quantified}.
	 * @param ctx the parse tree
	 */
	void exitQuantified(@NotNull RegularExpressionParser.QuantifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void enterLazyOneOrMore(@NotNull RegularExpressionParser.LazyOneOrMoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 */
	void exitLazyOneOrMore(@NotNull RegularExpressionParser.LazyOneOrMoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void enterGreedyConditional(@NotNull RegularExpressionParser.GreedyConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyConditional}.
	 * @param ctx the parse tree
	 */
	void exitGreedyConditional(@NotNull RegularExpressionParser.GreedyConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void enterNoCaptureGroup(@NotNull RegularExpressionParser.NoCaptureGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 */
	void exitNoCaptureGroup(@NotNull RegularExpressionParser.NoCaptureGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void enterGreedyBetween(@NotNull RegularExpressionParser.GreedyBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#greedyBetween}.
	 * @param ctx the parse tree
	 */
	void exitGreedyBetween(@NotNull RegularExpressionParser.GreedyBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#exact}.
	 * @param ctx the parse tree
	 */
	void enterExact(@NotNull RegularExpressionParser.ExactContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#exact}.
	 * @param ctx the parse tree
	 */
	void exitExact(@NotNull RegularExpressionParser.ExactContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull RegularExpressionParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull RegularExpressionParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void enterLazyAtLeast(@NotNull RegularExpressionParser.LazyAtLeastContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 */
	void exitLazyAtLeast(@NotNull RegularExpressionParser.LazyAtLeastContext ctx);
}