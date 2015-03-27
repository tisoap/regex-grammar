// Generated from RegularExpression.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Enter a parse tree produced by {@link RegularExpressionParser#groupstart}.
	 * @param ctx the parse tree
	 */
	void enterGroupstart(RegularExpressionParser.GroupstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#groupstart}.
	 * @param ctx the parse tree
	 */
	void exitGroupstart(RegularExpressionParser.GroupstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegularExpressionParser#groupend}.
	 * @param ctx the parse tree
	 */
	void enterGroupend(RegularExpressionParser.GroupendContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegularExpressionParser#groupend}.
	 * @param ctx the parse tree
	 */
	void exitGroupend(RegularExpressionParser.GroupendContext ctx);
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
}