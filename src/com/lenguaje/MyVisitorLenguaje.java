package com.lenguaje;

import com.lenguaje.parser.LenguajeBaseVisitor;
import com.lenguaje.parser.LenguajeParser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MyVisitorLenguaje extends LenguajeBaseVisitor<String> {
    public static List<String> newSentence = new ArrayList<>();
    public int errors = 0;
    private PrintStream ps;
    public MyVisitorLenguaje(PrintStream ps){
        this.ps=ps;
        System.setErr(this.ps);
        System.setOut(this.ps);
    }
    @Override
    public String visitArchivo(LenguajeParser.ArchivoContext ctx) {
        newSentence.add("#initial()->");
        for (int i=0; i< ctx.body().size(); i++){
            newSentence.add(visit(ctx.body(i)));
        }
        newSentence.add("<-");
        return null;
    }

    @Override
    public String visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
       try{
           return "use "+ ctx.ID() +';';
       }catch (Exception e){
           errors++;
           System.out.println(e);
           return null;
       }

    }

    @Override
    public String visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        try{
            return ctx.ID().getText() + "="+ visit(ctx.expr())+';';
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitAsigDeclar(LenguajeParser.AsigDeclarContext ctx) {
        try{
            return "use " +ctx.ID() + "="+visit(ctx.expr()) +';';
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitImpresion(LenguajeParser.ImpresionContext ctx) {
        try{
            return "systalk(" + visit(ctx.expr()) + ");";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitParentesis(LenguajeParser.ParentesisContext ctx) {
        try{
            return '(' + visit(ctx.expr()) +')';
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitNum(LenguajeParser.NumContext ctx) {

        try{
            return ((ctx.SUB() != null)? '-' + ctx.NUM().getText() : ctx.NUM().getText()) ;
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitId(LenguajeParser.IdContext ctx) {
        try{
            return ctx.ID().getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitMultDiv(LenguajeParser.MultDivContext ctx) {

        try{
            return ctx.getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSumSub(LenguajeParser.SumSubContext ctx) {

        try{
            return ctx.getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitIfElse(LenguajeParser.IfElseContext ctx) {
        try{
            String lineIf = visit(ctx.if_sentence());
            String lineElse="";
            String lineElif="";
            if(ctx.else_sentence()!=null){
                lineElse=visit(ctx.else_sentence());
            }else if(ctx.elif_sentence()!=null){
                lineElif=visit(ctx.elif_sentence());
            }
            return  lineIf+ lineElse +lineElif ;
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenceIf(LenguajeParser.SentenceIfContext ctx) {
        try{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<ctx.body().size(); i++){
                sb.append(visit(ctx.body(i))+"\n");
            }
            return "if("+visit(ctx.condition())+")->\n"+sb +"<-";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenciaElse(LenguajeParser.SentenciaElseContext ctx) {
        try{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<ctx.body().size(); i++){
                sb.append(visit(ctx.body(i))+"\n");
            }
            return "else->\n"+sb+"<-";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }
    @Override
    public String visitSentenciaElif(LenguajeParser.SentenciaElifContext ctx) {


        try{
            String lineElIf = "el"+visit(ctx.if_sentence());
            String lineElse="";
            String lineElif="";
            if(ctx.else_sentence()!=null){
                lineElse=visit(ctx.else_sentence());
            }else if(ctx.elif_sentence()!=null){
                lineElif=visit(ctx.elif_sentence());
            }
            return  lineElIf+ lineElse +lineElif ;
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
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
    public String visitCondicionParentesis(LenguajeParser.CondicionParentesisContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpresion(LenguajeParser.ExpresionContext ctx) {
        return visit(ctx.expr());
    }

}
