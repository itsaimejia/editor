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
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LenguajeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(LenguajeParser.IfElseContext ctx);
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
	 * Visit a parse tree produced by the {@code sentenceIf}
	 * labeled alternative in {@link LenguajeParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceIf(LenguajeParser.SentenceIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaElse}
	 * labeled alternative in {@link LenguajeParser#else_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElse(LenguajeParser.SentenciaElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cero}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCero(LenguajeParser.CeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LenguajeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionNegacion}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionNegacion(LenguajeParser.CondicionNegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionParentesis}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionParentesis(LenguajeParser.CondicionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(LenguajeParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesIgualdad}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesIgualdad(LenguajeParser.CondicionesIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uno}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUno(LenguajeParser.UnoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionO}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionO(LenguajeParser.CondicionOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionY}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionY(LenguajeParser.CondicionYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(LenguajeParser.VerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesRelacional}
	 * labeled alternative in {@link LenguajeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesRelacional(LenguajeParser.CondicionesRelacionalContext ctx);
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