package com.opmez;



import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TranslateToC extends OpmezBaseVisitor<String> {
    public static List<String> newSentence = new ArrayList<>();

    public int errors = 0;
    private PrintStream ps;
    public TranslateToC(PrintStream ps){
        this.ps=ps;
        System.setErr(ps);
        System.setOut(ps);
    }

    @Override
    public String visitCuerpo(OpmezParser.CuerpoContext ctx) {
        newSentence.add("void main(){");
        for (int i=0; i< ctx.instructions().size(); i++){
            String current = visit(ctx.instructions(i));
            if(current != null) {
                newSentence.add(visit(ctx.instructions(i)));
            }
            else{
                errors++;
                break;
            }
        }
        newSentence.add("}");
        return null;
    }

    @Override
    public String visitDeclaracion(OpmezParser.DeclaracionContext ctx) {
        try{
            return "int "+ ctx.ID() +';';
        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitAsignacion(OpmezParser.AsignacionContext ctx) {
        try{
            return ctx.ID() + "="+ visit(ctx.expr())+';';
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    @Override
    public String visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        try{
            return "int " +ctx.ID() + "="+visit(ctx.expr()) +';';
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitImpresionExpr(OpmezParser.ImpresionExprContext ctx) {
        try{
            return "printf(" + visit(ctx.expr()) + ");";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitImpresionString(OpmezParser.ImpresionStringContext ctx) {
        try{
            return "printf(" + ctx.string().getText() + ");";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitParentesis(OpmezParser.ParentesisContext ctx) {
        try{
            return '(' + visit(ctx.expr()) +')';
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitNumero(OpmezParser.NumeroContext ctx) {
        try{
            return Integer.valueOf(ctx.getText()).toString();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitId(OpmezParser.IdContext ctx) {
        try{
            return ctx.ID().getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }

    }

    @Override
    public String visitMultDiv(OpmezParser.MultDivContext ctx) {
        try{
            return ctx.getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSumSub(OpmezParser.SumSubContext ctx) {

        try{
            return ctx.getText();
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitIfElse(OpmezParser.IfElseContext ctx) {
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
    public String visitCuerpoScope(OpmezParser.CuerpoScopeContext ctx) {
        boolean fail = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ctx.instructions().size(); i++){
            String current = visit(ctx.instructions(i));
            if(current != null)
                sb.append(current+"\n");
            else{
                fail = true;
                break;
            }
        }
        return sb.toString();
    }

    @Override
    public String visitCondicionElif(OpmezParser.CondicionElifContext ctx) {
        boolean fail = false;
        try{
            String sb = visit(ctx.body());
            return "else if("+visit(ctx.condition())+"){\n"+sb +"}";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenciaIf(OpmezParser.SentenciaIfContext ctx) {
        boolean fail = false;
        try{
            String sb = visit(ctx.body());
            return "if(" +ctx.condition().getText()+"){\n"+sb +"}";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String visitSentenciaElse(OpmezParser.SentenciaElseContext ctx) {
        boolean fail = false;
        try{
            String sb = visit(ctx.body());
            return "else{\n"+sb +"}";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }
    @Override
    public String visitSentenciaElif(OpmezParser.SentenciaElifContext ctx) {

        boolean existNull;
        try {
            String lineIf = visit(ctx.elif_frag_condition());
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
    public String visitCicle(OpmezParser.CicleContext ctx) {
        boolean fail = false;
        try{
            String sb = visit(ctx.body());
            return "while("+ctx.condition().getText()+"){\n"+sb +"}";
        }catch (Exception e){
            errors++;
            System.out.println(e);
            return null;
        }
    }


    @Override
    public String visitCondicionNegacion(OpmezParser.CondicionNegacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionesIgualdad(OpmezParser.CondicionesIgualdadContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionesIgualdadExpr(OpmezParser.CondicionesIgualdadExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionY(OpmezParser.CondicionYContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondicionO(OpmezParser.CondicionOContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVerdadero(OpmezParser.VerdaderoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFalso(OpmezParser.FalsoContext ctx) {
        return ctx.getText();
    }


    @Override
    public String visitCondicionParentesis(OpmezParser.CondicionParentesisContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpresion(OpmezParser.ExpresionContext ctx) {
        return visit(ctx.expr());
    }

}