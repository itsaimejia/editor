// Generated from .\Guarennes.g4 by ANTLR 4.9.2
package com.guarennes.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GuarennesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GuarennesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code cuerpo}
	 * labeled alternative in {@link GuarennesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(GuarennesParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link GuarennesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(GuarennesParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigDeclar}
	 * labeled alternative in {@link GuarennesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigDeclar(GuarennesParser.AsigDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link GuarennesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(GuarennesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link GuarennesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GuarennesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link GuarennesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(GuarennesParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link GuarennesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(GuarennesParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumSub}
	 * labeled alternative in {@link GuarennesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSub(GuarennesParser.SumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GuarennesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GuarennesParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GuarennesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GuarennesParser.IdContext ctx);
}