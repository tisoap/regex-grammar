// Generated from RegularExpressionERE.g4 by ANTLR 4.5

	package gerado;

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
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(RegularExpressionEREParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#startAnchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartAnchor(RegularExpressionEREParser.StartAnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#endAnchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndAnchor(RegularExpressionEREParser.EndAnchorContext ctx);
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
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElement(RegularExpressionEREParser.ListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(RegularExpressionEREParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listFirstElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFirstElement(RegularExpressionEREParser.ListFirstElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listNoSpecial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListNoSpecial(RegularExpressionEREParser.ListNoSpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listFirstRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFirstRange(RegularExpressionEREParser.ListFirstRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listLastElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLastElement(RegularExpressionEREParser.ListLastElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#listCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCharacter(RegularExpressionEREParser.ListCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#charclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharclass(RegularExpressionEREParser.CharclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(RegularExpressionEREParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#alnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlnum(RegularExpressionEREParser.AlnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(RegularExpressionEREParser.AlphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#blank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(RegularExpressionEREParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#cntrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntrl(RegularExpressionEREParser.CntrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#digitclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitclass(RegularExpressionEREParser.DigitclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(RegularExpressionEREParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower(RegularExpressionEREParser.LowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(RegularExpressionEREParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#punct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunct(RegularExpressionEREParser.PunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#spaceclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceclass(RegularExpressionEREParser.SpaceclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#upper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper(RegularExpressionEREParser.UpperContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#xdigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdigit(RegularExpressionEREParser.XdigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#anychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnychar(RegularExpressionEREParser.AnycharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escapedSpecial}
	 * labeled alternative in {@link RegularExpressionEREParser#escaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedSpecial(RegularExpressionEREParser.EscapedSpecialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escapedChar}
	 * labeled alternative in {@link RegularExpressionEREParser#escaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedChar(RegularExpressionEREParser.EscapedCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegularExpressionEREParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(RegularExpressionEREParser.SpecialContext ctx);
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