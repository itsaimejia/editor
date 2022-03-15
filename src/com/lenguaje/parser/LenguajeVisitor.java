// Generated from .\Lenguaje.g4 by ANTLR 4.9.2
package com.lenguaje.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LenguajeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code archivo}
	 * labeled alternative in {@link LenguajeParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(LenguajeParser.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LenguajeParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigDeclar}
	 * labeled alternative in {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigDeclar(LenguajeParser.AsigDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajeParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(LenguajeParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumSub}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSub(LenguajeParser.SumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(LenguajeParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeParser.IdContext ctx);
}