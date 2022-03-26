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
	 * labeled alternative in {@link OpmezParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(OpmezParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link OpmezParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(OpmezParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link OpmezParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(OpmezParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link OpmezParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(OpmezParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigDeclar}
	 * labeled alternative in {@link OpmezParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigDeclar(OpmezParser.AsigDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaElif}
	 * labeled alternative in {@link OpmezParser#elif_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElif(OpmezParser.SentenciaElifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionElif}
	 * labeled alternative in {@link OpmezParser#elif_frag_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionElif(OpmezParser.CondicionElifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaIf}
	 * labeled alternative in {@link OpmezParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(OpmezParser.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaElse}
	 * labeled alternative in {@link OpmezParser#else_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElse(OpmezParser.SentenciaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpmezParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(OpmezParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(OpmezParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionNegacion}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionNegacion(OpmezParser.CondicionNegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionParentesis}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionParentesis(OpmezParser.CondicionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesMayMen}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesMayMen(OpmezParser.CondicionesMayMenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesIgualdad}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesIgualdad(OpmezParser.CondicionesIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionO}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionO(OpmezParser.CondicionOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionY}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionY(OpmezParser.CondicionYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesIgualdadExpr}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesIgualdadExpr(OpmezParser.CondicionesIgualdadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionesMayMenIgual}
	 * labeled alternative in {@link OpmezParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionesMayMenIgual(OpmezParser.CondicionesMayMenIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(OpmezParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(OpmezParser.NumeroContext ctx);
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
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(OpmezParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(OpmezParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link OpmezParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(OpmezParser.VerdaderoContext ctx);
}