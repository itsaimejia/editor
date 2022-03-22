package com.lenguaje;

import com.lenguaje.parser.LenguajeBaseVisitor;
import com.lenguaje.parser.LenguajeParser;
import java.util.ArrayList;
import java.util.List;

public class MyVisitorLenguaje extends LenguajeBaseVisitor<String> {
    public static List<String> newSentence = new ArrayList<>();
    @Override
    public String visitArchivo(LenguajeParser.ArchivoContext ctx) {
        //System.out.println("# initial->");
        newSentence.add("#initial->");
        for (int i=0; i< ctx.body().size(); i++){
            newSentence.add(visit(ctx.body(i)));
            //System.out.println(visit(ctx.body(i)));
        }
        newSentence.add("<-");
        //System.out.println("<-");
        return null;
    }

    @Override
    public String visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
        return "decimalnt "+ ctx.ID() +';';

    }

    @Override
    public String visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        return ctx.ID().getText() + "="+ visit(ctx.expr())+';';
    }

    @Override
    public String visitAsigDeclar(LenguajeParser.AsigDeclarContext ctx) {
        return "decimalnt " +ctx.ID() + "="+visit(ctx.expr()) +';';
    }

    @Override
    public String visitImpresion(LenguajeParser.ImpresionContext ctx) {
        System.out.println(ctx.children);
        return "systalk(" + visit(ctx.expr()) + ");";
    }

    @Override
    public String visitParentesis(LenguajeParser.ParentesisContext ctx) {
        return '(' + visit(ctx.expr()) +')';
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
        return ctx.getText();
    }

    @Override
    public String visitSumSub(LenguajeParser.SumSubContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIfElse(LenguajeParser.IfElseContext ctx) {
        String lineIf = visit(ctx.if_sentence());
        String lineElse="";
        if(ctx.else_sentence()!=null){
            lineElse=visit(ctx.else_sentence());
        }
        return  lineIf + lineElse ;
    }

    @Override
    public String visitSentenceIf(LenguajeParser.SentenceIfContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ctx.body().size(); i++){
            sb.append(visit(ctx.body(i))+"\n");
        }
        return "if("+visit(ctx.condition())+")->\n"+sb +"<-";
    }

    @Override
    public String visitSentenciaElse(LenguajeParser.SentenciaElseContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ctx.body().size(); i++){
            sb.append(visit(ctx.body(i))+"\n");
        }
        return "else->\n"+sb+"<-";
    }

    @Override
    public String visitCondicionNegacion(LenguajeParser.CondicionNegacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionesIgualdad(LenguajeParser.CondicionesIgualdadContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionesRelacional(LenguajeParser.CondicionesRelacionalContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionY(LenguajeParser.CondicionYContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionO(LenguajeParser.CondicionOContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVerdadero(LenguajeParser.VerdaderoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFalso(LenguajeParser.FalsoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitUno(LenguajeParser.UnoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCero(LenguajeParser.CeroContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionParentesis(LenguajeParser.CondicionParentesisContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpresion(LenguajeParser.ExpresionContext ctx) {
        return visit(ctx.expr());
    }

}
