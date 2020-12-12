// Generated from .\elementos.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link elementosParser}.
 */
public interface elementosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link elementosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(elementosParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link elementosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(elementosParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link elementosParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(elementosParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link elementosParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(elementosParser.ElemContext ctx);
}