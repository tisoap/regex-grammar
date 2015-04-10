// Generated from RegularExpressionPCRE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegularExpressionPCREParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegularExpressionPCREVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RegularExpressionPCREParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(RegularExpressionPCREParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(RegularExpressionPCREParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#numericalGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalGroup(RegularExpressionPCREParser.NumericalGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#namedGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedGroup(RegularExpressionPCREParser.NamedGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(RegularExpressionPCREParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#noCaptureGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoCaptureGroup(RegularExpressionPCREParser.NoCaptureGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(RegularExpressionPCREParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazy(RegularExpressionPCREParser.LazyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedy(RegularExpressionPCREParser.GreedyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedyOneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyOneOrMore(RegularExpressionPCREParser.GreedyOneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedyZeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyZeroOrMore(RegularExpressionPCREParser.GreedyZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedyConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyConditional(RegularExpressionPCREParser.GreedyConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedyAtLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyAtLeast(RegularExpressionPCREParser.GreedyAtLeastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#greedyBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreedyBetween(RegularExpressionPCREParser.GreedyBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazyOneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyOneOrMore(RegularExpressionPCREParser.LazyOneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazyZeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyZeroOrMore(RegularExpressionPCREParser.LazyZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazyConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyConditional(RegularExpressionPCREParser.LazyConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazyAtLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyAtLeast(RegularExpressionPCREParser.LazyAtLeastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lazyBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyBetween(RegularExpressionPCREParser.LazyBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(RegularExpressionPCREParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#commentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentText(RegularExpressionPCREParser.CommentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(RegularExpressionPCREParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(RegularExpressionPCREParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#startAnchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartAnchor(RegularExpressionPCREParser.StartAnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#endAnchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndAnchor(RegularExpressionPCREParser.EndAnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(RegularExpressionPCREParser.RepetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#quantified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified(RegularExpressionPCREParser.QuantifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#oneOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOrMore(RegularExpressionPCREParser.OneOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#zeroOrMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroOrMore(RegularExpressionPCREParser.ZeroOrMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(RegularExpressionPCREParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#exact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact(RegularExpressionPCREParser.ExactContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#atLeast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtLeast(RegularExpressionPCREParser.AtLeastContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(RegularExpressionPCREParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RegularExpressionPCREParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#firstValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstValue(RegularExpressionPCREParser.FirstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lastValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastValue(RegularExpressionPCREParser.LastValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(RegularExpressionPCREParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#negativeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeList(RegularExpressionPCREParser.NegativeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#positiveList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveList(RegularExpressionPCREParser.PositiveListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#listElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElement(RegularExpressionPCREParser.ListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(RegularExpressionPCREParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#charclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharclass(RegularExpressionPCREParser.CharclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(RegularExpressionPCREParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#alnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlnum(RegularExpressionPCREParser.AlnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(RegularExpressionPCREParser.AlphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#blank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(RegularExpressionPCREParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#cntrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntrl(RegularExpressionPCREParser.CntrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#digitclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitclass(RegularExpressionPCREParser.DigitclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(RegularExpressionPCREParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower(RegularExpressionPCREParser.LowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(RegularExpressionPCREParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#punct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunct(RegularExpressionPCREParser.PunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#spaceclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceclass(RegularExpressionPCREParser.SpaceclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#upper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper(RegularExpressionPCREParser.UpperContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#xdigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdigit(RegularExpressionPCREParser.XdigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#anychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnychar(RegularExpressionPCREParser.AnycharContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#escaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped(RegularExpressionPCREParser.EscapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(RegularExpressionPCREParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#listEscaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEscaped(RegularExpressionPCREParser.ListEscapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#listEspecial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEspecial(RegularExpressionPCREParser.ListEspecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(RegularExpressionPCREParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionPCREParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(RegularExpressionPCREParser.CharacterContext ctx);
}