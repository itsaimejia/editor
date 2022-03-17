// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OpmezParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OpmezVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code cuerpo}
	 * labeled alternative in {@link OpmezParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(OpmezParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link OpmezParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(OpmezParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigDeclar}
	 * labeled alternative in {@link OpmezParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigDeclar(OpmezParser.AsigDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link OpmezParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(OpmezParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link OpmezParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(OpmezParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(OpmezParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(OpmezParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumSub}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSub(OpmezParser.SumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(OpmezParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(OpmezParser.IdContext ctx);
}