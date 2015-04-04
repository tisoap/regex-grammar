// Generated from RegularExpression.g4 by ANTLR 4.4
package regexGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegularExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegularExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyAtLeast(@NotNull RegularExpressionParser.GreedyAtLeastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lastValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastValue(@NotNull RegularExpressionParser.LastValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#firstValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstValue(@NotNull RegularExpressionParser.FirstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazy(@NotNull RegularExpressionParser.LazyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(@NotNull RegularExpressionParser.RepetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#commentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentText(@NotNull RegularExpressionParser.CommentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyOneOrMore(@NotNull RegularExpressionParser.GreedyOneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(@NotNull RegularExpressionParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(@NotNull RegularExpressionParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedy(@NotNull RegularExpressionParser.GreedyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyZeroOrMore(@NotNull RegularExpressionParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazyConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyConditional(@NotNull RegularExpressionParser.LazyConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazyBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyBetween(@NotNull RegularExpressionParser.LazyBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull RegularExpressionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull RegularExpressionParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(@NotNull RegularExpressionParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull RegularExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(@NotNull RegularExpressionParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyZeroOrMore(@NotNull RegularExpressionParser.LazyZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#numericalGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalGroup(@NotNull RegularExpressionParser.NumericalGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(@NotNull RegularExpressionParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#namedGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedGroup(@NotNull RegularExpressionParser.NamedGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(@NotNull RegularExpressionParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#quantified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified(@NotNull RegularExpressionParser.QuantifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyOneOrMore(@NotNull RegularExpressionParser.LazyOneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedyConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyConditional(@NotNull RegularExpressionParser.GreedyConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoCaptureGroup(@NotNull RegularExpressionParser.NoCaptureGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#greedyBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyBetween(@NotNull RegularExpressionParser.GreedyBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#exact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact(@NotNull RegularExpressionParser.ExactContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(@NotNull RegularExpressionParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyAtLeast(@NotNull RegularExpressionParser.LazyAtLeastContext ctx);
}