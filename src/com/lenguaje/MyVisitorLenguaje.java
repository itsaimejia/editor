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
        System.setErr(ps);
        System.setOut(ps);
    }
    @Override
    public String visitArchivo(LenguajeParser.ArchivoContext ctx) {
        newSentence.add("#initial()->");

        for (int i=0; i< ctx.body().size(); i++){
            String current = visit(ctx.body(i));
            if(current != null) {
                newSentence.add(visit(ctx.body(i)));

            }
            else{
                errors++;
                break;
            }
        }

        newSentence.add("<-");
        return null;
    }

    @Override
    public String visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
        try{

                return "use "+ ctx.ID() +';';

        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        try{

                return ctx.ID() + "="+ visit(ctx.expr())+';';

        }catch (Exception e){
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
    public String visitImpresionExpr(LenguajeParser.ImpresionExprContext ctx) {
        try{
            return "systalk(" + visit(ctx.expr()) + ");";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitImpresionString(LenguajeParser.ImpresionStringContext ctx) {
        try{
            return "systalk(" + ctx.STRING() + ");";
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
            return Integer.valueOf(ctx.getText()).toString();
        }catch (Exception e){
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
        boolean existNull;
        try {
            String lineIf = visit(ctx.if_sentence());
            existNull= (lineIf == null)? true:false;
            String lineElse = "";
            String lineElif = "";
            if (ctx.else_sentence() != null) {
                lineElse = visit(ctx.else_sentence());
                existNull= (lineElse == null)? true:false;
            } else if (ctx.elif_sentence() != null) {
                lineElif = visit(ctx.elif_sentence());
                existNull= (lineElif == null)? true:false;
            }

            if(!existNull)
                return lineIf + lineElse + lineElif;
            else return null;
        } catch (Exception e) {
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenceIf(LenguajeParser.SentenceIfContext ctx) {
        boolean fail = false;
        try{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<ctx.body().size(); i++){
                String current = visit(ctx.body(i));
                if(current != null)
                    sb.append(current+"\n");
                else{
                    fail = true;
                    break;
                }
            }
            if(!fail)
                return "if("+visit(ctx.condition())+")->\n"+sb +"<-";
            else return null;
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenciaElse(LenguajeParser.SentenciaElseContext ctx) {
        boolean fail = false;
        try{
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<ctx.body().size(); i++) {
                String current = visit(ctx.body(i));
                if (current == null){
                    fail = true;
                    break;
                }
                sb.append(current+"\n");
            }
            if(!fail)
                return "else->\n"+sb+"<-";
            else return null;
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }
    @Override
    public String visitSentenciaElif(LenguajeParser.SentenciaElifContext ctx) {

        boolean existNull;
        try {
            String lineIf = visit(ctx.if_sentence());
            existNull= (lineIf == null)? true:false;
            String lineElse = "";
            String lineElif = "";
            if (ctx.else_sentence() != null) {
                lineElse = visit(ctx.else_sentence());
                existNull= (lineElse == null)? true:false;
            } else if (ctx.elif_sentence() != null) {
                lineElif = visit(ctx.elif_sentence());
                existNull= (lineElif == null)? true:false;
            }

            if(!existNull)
                return "el"+lineIf + lineElse + lineElif;
            else return null;
        } catch (Exception e) {
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitCiclo(LenguajeParser.CicloContext ctx) {


        boolean fail = false;
        try{

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<ctx.body().size(); i++) {
                String current = visit(ctx.body(i));
                if (current == null){
                    fail = true;
                    break;
                }
                sb.append(current+"\n");
            }
            if(!fail)
                return "while("+ctx.condition().getText()+"){\n"+sb+"}";
            else return null;
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