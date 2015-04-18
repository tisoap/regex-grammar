// Generated from RegularExpressionERE.g4 by ANTLR 4.5

package generated.regexERE;

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
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(RegularExpressionEREParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(RegularExpressionEREParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#startAnchor}.
	 * @param ctx the parse tree
	 */
	void enterStartAnchor(RegularExpressionEREParser.StartAnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#startAnchor}.
	 * @param ctx the parse tree
	 */
	void exitStartAnchor(RegularExpressionEREParser.StartAnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#endAnchor}.
	 * @param ctx the parse tree
	 */
	void enterEndAnchor(RegularExpressionEREParser.EndAnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#endAnchor}.
	 * @param ctx the parse tree
	 */
	void exitEndAnchor(RegularExpressionEREParser.EndAnchorContext ctx);
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
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#listElement}.
	 * @param ctx the parse tree
	 */
	void enterListElement(RegularExpressionEREParser.ListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#listElement}.
	 * @param ctx the parse tree
	 */
	void exitListElement(RegularExpressionEREParser.ListElementContext ctx);
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
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#charclass}.
	 * @param ctx the parse tree
	 */
	void enterCharclass(RegularExpressionEREParser.CharclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#charclass}.
	 * @param ctx the parse tree
	 */
	void exitCharclass(RegularExpressionEREParser.CharclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(RegularExpressionEREParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(RegularExpressionEREParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#alnum}.
	 * @param ctx the parse tree
	 */
	void enterAlnum(RegularExpressionEREParser.AlnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#alnum}.
	 * @param ctx the parse tree
	 */
	void exitAlnum(RegularExpressionEREParser.AlnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(RegularExpressionEREParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(RegularExpressionEREParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#blank}.
	 * @param ctx the parse tree
	 */
	void enterBlank(RegularExpressionEREParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#blank}.
	 * @param ctx the parse tree
	 */
	void exitBlank(RegularExpressionEREParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#cntrl}.
	 * @param ctx the parse tree
	 */
	void enterCntrl(RegularExpressionEREParser.CntrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#cntrl}.
	 * @param ctx the parse tree
	 */
	void exitCntrl(RegularExpressionEREParser.CntrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#digitclass}.
	 * @param ctx the parse tree
	 */
	void enterDigitclass(RegularExpressionEREParser.DigitclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#digitclass}.
	 * @param ctx the parse tree
	 */
	void exitDigitclass(RegularExpressionEREParser.DigitclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(RegularExpressionEREParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(RegularExpressionEREParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#lower}.
	 * @param ctx the parse tree
	 */
	void enterLower(RegularExpressionEREParser.LowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#lower}.
	 * @param ctx the parse tree
	 */
	void exitLower(RegularExpressionEREParser.LowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(RegularExpressionEREParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(RegularExpressionEREParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#punct}.
	 * @param ctx the parse tree
	 */
	void enterPunct(RegularExpressionEREParser.PunctContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#punct}.
	 * @param ctx the parse tree
	 */
	void exitPunct(RegularExpressionEREParser.PunctContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#spaceclass}.
	 * @param ctx the parse tree
	 */
	void enterSpaceclass(RegularExpressionEREParser.SpaceclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#spaceclass}.
	 * @param ctx the parse tree
	 */
	void exitSpaceclass(RegularExpressionEREParser.SpaceclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#upper}.
	 * @param ctx the parse tree
	 */
	void enterUpper(RegularExpressionEREParser.UpperContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#upper}.
	 * @param ctx the parse tree
	 */
	void exitUpper(RegularExpressionEREParser.UpperContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#xdigit}.
	 * @param ctx the parse tree
	 */
	void enterXdigit(RegularExpressionEREParser.XdigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#xdigit}.
	 * @param ctx the parse tree
	 */
	void exitXdigit(RegularExpressionEREParser.XdigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#anychar}.
	 * @param ctx the parse tree
	 */
	void enterAnychar(RegularExpressionEREParser.AnycharContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#anychar}.
	 * @param ctx the parse tree
	 */
	void exitAnychar(RegularExpressionEREParser.AnycharContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#escaped}.
	 * @param ctx the parse tree
	 */
	void enterEscaped(RegularExpressionEREParser.EscapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#escaped}.
	 * @param ctx the parse tree
	 */
	void exitEscaped(RegularExpressionEREParser.EscapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(RegularExpressionEREParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(RegularExpressionEREParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#listEscaped}.
	 * @param ctx the parse tree
	 */
	void enterListEscaped(RegularExpressionEREParser.ListEscapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#listEscaped}.
	 * @param ctx the parse tree
	 */
	void exitListEscaped(RegularExpressionEREParser.ListEscapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionEREParser#listEspecial}.
	 * @param ctx the parse tree
	 */
	void enterListEspecial(RegularExpressionEREParser.ListEspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionEREParser#listEspecial}.
	 * @param ctx the parse tree
	 */
	void exitListEspecial(RegularExpressionEREParser.ListEspecialContext ctx);
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