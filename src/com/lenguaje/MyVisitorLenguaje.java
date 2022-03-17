package com.lenguaje;

import com.lenguaje.parser.LenguajeBaseVisitor;
import com.lenguaje.parser.LenguajeParser;
import java.util.ArrayList;
import java.util.List;

public class MyVisitorLenguaje extends LenguajeBaseVisitor<String> {
    public static List<String> newSentence = new ArrayList<>();
    @Override
    public String visitArchivo(LenguajeParser.ArchivoContext ctx) {
        System.out.println("# initial<>|");
        newSentence.add("#initial<>|");
        for (int i=0; i< ctx.body().size(); i++){
            newSentence.add(visit(ctx.body(i)));
            System.out.println(visit(ctx.body(i)));
        }
        newSentence.add("|");
        System.out.println("|");
        return null;
    }

    @Override
    public String visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
        return "decimalnt "+ ctx.ID() +'!';

    }

    @Override
    public String visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        return ctx.ID().getText() + "="+ visit(ctx.expr())+'!';
    }

    @Override
    public String visitAsigDeclar(LenguajeParser.AsigDeclarContext ctx) {
        return "decimalnt " +ctx.ID() + "="+visit(ctx.expr()) +'!';
    }

    @Override
    public String visitImpresion(LenguajeParser.ImpresionContext ctx) {
        return "systalk<" + visit(ctx.expr()) + ">!";
    }

    @Override
    public String visitParentesis(LenguajeParser.ParentesisContext ctx) {
        return '<' + visit(ctx.expr()) +'>';
    }

    @Override
    public String visitNum(LenguajeParser.NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitId(LenguajeParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitMultDiv(LenguajeParser.MultDivContext ctx) {
        return visit(ctx.expr(0)) + ((ctx.op.getType() == LenguajeParser.MULT) ? "*":"/") + visit(ctx.expr(1));
    }

    @Override
    public String visitSumSub(LenguajeParser.SumSubContext ctx) {
        return visit(ctx.expr(0)) + ((ctx.op.getType() == LenguajeParser.SUM) ? "+":"-") +visit(ctx.expr(1));
    }
}
