package com.opmez;

import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.io.PrintStream;
import java.util.HashMap;

public class MyVisitorOpmez extends OpmezBaseVisitor<Object> {
    public static HashMap<String, Object> memory = new HashMap<String, Object>();
    private PrintStream ps;
    public MyVisitorOpmez(PrintStream ps){
        this.ps=ps;
        System.setOut(this.ps);
        System.setErr(this.ps);
    }

    @Override
    public Object visitCuerpo(OpmezParser.CuerpoContext ctx) {
        for (int i =0; i<ctx.body().size(); i++){
            visit(ctx.body(i));
        }
        return null;
    }

    @Override
    public Object visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }

    @Override
    public Object visitDeclaracion(OpmezParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        memory.put(id,null);
        return null;
    }

    @Override
    public Object visitAsignacion(OpmezParser.AsignacionContext ctx) {
        try{
            String id = ctx.ID().getText();
            if(memory.containsKey(id)){
                Object value = visit(ctx.expr());
                memory.put(id,value);
                return value;
            }else{
                throw new Exception(ctx.ID().getText()+" se debe declarar antes");
            }
        }catch (Exception e){
            ps.println(e);
            return null;
        }
    }


    @Override
    public Object visitImpresion(OpmezParser.ImpresionContext ctx) {
        Object result = visit(ctx.expr());
        ps.println(result);
        return null;
    }

    @Override
    public Object visitNumero(OpmezParser.NumeroContext ctx) {
        if(ctx.op.getType() == OpmezParser.INT) {
            return Integer.valueOf(ctx.getText());
        }else
            return Double.valueOf(ctx.getText());
    }

    @Override
    public Object visitId(OpmezParser.IdContext ctx) {
        String id = ctx.ID().getText();
        return memory.getOrDefault(id, null);
    }
    @Override
    public Object visitMultDiv(OpmezParser.MultDivContext ctx) {
        if(visit(ctx.expr(0)).getClass().equals(Integer.class) && visit(ctx.expr(1)).getClass().equals(Integer.class)){
            int left = (int) visit(ctx.expr(0));
            int right = (int) visit(ctx.expr(1));
            return (ctx.op.getType() == OpmezParser.MULT)? left * right: left / right;
        }else{
            double left =  Double.parseDouble(visit(ctx.expr(0)).toString());
            double right = Double.parseDouble(visit(ctx.expr(1)).toString());
            return (ctx.op.getType() == OpmezParser.MULT)? left * right: left / right;
        }
    }
    @Override
    public Object visitSumSub(OpmezParser.SumSubContext ctx) {
        if(visit(ctx.expr(0)).getClass().equals(Integer.class) && visit(ctx.expr(1)).getClass().equals(Integer.class)){
            int left = (int) visit(ctx.expr(0));
            int right = (int) visit(ctx.expr(1));
            return (ctx.op.getType() == OpmezParser.SUM) ? left + right : left - right;
        }else{
            double left =  Double.parseDouble(visit(ctx.expr(0)).toString());
            double right = Double.parseDouble(visit(ctx.expr(1)).toString());
            return (ctx.op.getType() == OpmezParser.SUM) ? left + right : left - right;
        }
    }

    @Override
    public Object visitParentesis(OpmezParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitIfElse(OpmezParser.IfElseContext ctx)  {
        if(visit(ctx.if_sentence())!=null){
            try{
                boolean result= (boolean) visit(ctx.if_sentence());
                if(!result){
                    if(ctx.else_sentence()!=null){
                        visit(ctx.else_sentence());
                    }else if(ctx.elif_sentence()!=null){
                        visit(ctx.elif_sentence());
                    }
                }
            }catch (Exception e){
            }
        }

        return null;
    }

    @Override
    public Object visitSentenciaIf(OpmezParser.SentenciaIfContext ctx)  {
        try{
            boolean result = (boolean)visit(ctx.condition());
            if(result){
                for (int i = 0; i < ctx.body().size(); i++) {
                    visit(ctx.body(i));
                }
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            ps.println("Error if: "+e);
            return null;
        }
    }

    @Override
    public Object visitSentenciaElse(OpmezParser.SentenciaElseContext ctx) {
        for (int i = 0; i < ctx.body().size(); i++) {
            visit(ctx.body(i));
        }
        return null;

    }
    @Override
    public Object visitSentenciaElif(OpmezParser.SentenciaElifContext ctx) {
        try{
            boolean result= (boolean) visit(ctx.elif_frag_condition());
            if(!result){
                if(ctx.else_sentence()!=null){
                    visit(ctx.else_sentence());
                }else if(ctx.elif_sentence()!=null){
                    visit(ctx.elif_sentence());
                }
            }
        }catch (Exception e){
            ps.println("Error elif: "+e);
        }
        return null;
    }

    @Override
    public Object visitCondicionElif(OpmezParser.CondicionElifContext ctx) {
        boolean result = (boolean)visit(ctx.condition());
        if(result){
            for (int i = 0; i < ctx.body().size(); i++) {
                visit(ctx.body(i));
            }
        }
        return result;
    }

    @Override
    public Object visitCondicionNegacion(OpmezParser.CondicionNegacionContext ctx) {
        return !(boolean)visit(ctx.condition());
    }

    @Override
    public Object visitCondicionesIgualdad(OpmezParser.CondicionesIgualdadContext ctx) {
        boolean left = (boolean) visit(ctx.condition(0));
        boolean right = (boolean) visit(ctx.condition(1));
        return (ctx.op.getType() == OpmezParser.EQT) ? (left == right) : (left != right);
    }

    @Override
    public Object visitCondicionesIgualdadExpr(OpmezParser.CondicionesIgualdadExprContext ctx) {
        if(visit(ctx.expr(0))!=null || visit(ctx.expr(1))!=null){
            if(visit(ctx.expr(0)).getClass().equals(Integer.class) && visit(ctx.expr(1)).getClass().equals(Integer.class)){
                int left = (int) visit(ctx.expr(0));
                int right = (int) visit(ctx.expr(1));
                return (ctx.op.getType() == OpmezParser.EQT) ? (left == right) : (left != right);
            }else if(visit(ctx.expr(0)).getClass().equals(Double.class) || visit(ctx.expr(1)).getClass().equals(Double.class)){
                double left =  Double.parseDouble(visit(ctx.expr(0)).toString());
                double right = Double.parseDouble(visit(ctx.expr(1)).toString());
                return (ctx.op.getType() == OpmezParser.EQT) ? (left == right) : (left != right);
            }else{
                boolean left = (boolean) visit(ctx.expr(0));
                boolean right = (boolean) visit(ctx.expr(1));
                return (ctx.op.getType() == OpmezParser.EQT) ? (left == right) : (left != right);
            }
        }else{
            System.out.println("Error");
            return null;
        }


    }

    @Override
    public Object visitCondicionesMayMen(OpmezParser.CondicionesMayMenContext ctx) {
        if(visit(ctx.expr(0)).getClass().equals(Integer.class) && visit(ctx.expr(1)).getClass().equals(Integer.class)){
            int left = (int) visit(ctx.expr(0));
            int right = (int) visit(ctx.expr(1));
            return (ctx.op.getType() == OpmezParser.GT) ? (left > right) : (left < right);
        }else{
            double left =  Double.parseDouble(visit(ctx.expr(0)).toString());
            double right = Double.parseDouble(visit(ctx.expr(1)).toString());
            return (ctx.op.getType() == OpmezParser.GT) ? (left > right) : (left < right);
        }

    }

    @Override
    public Object visitCondicionesMayMenIgual(OpmezParser.CondicionesMayMenIgualContext ctx) {
        if(visit(ctx.expr(0)).getClass().equals(Integer.class) && visit(ctx.expr(1)).getClass().equals(Integer.class)){
            int left = (int) visit(ctx.expr(0));
            int right = (int) visit(ctx.expr(1));
            return (ctx.op.getType() == OpmezParser.GEQT) ? (left >= right) : (left <= right);
        }else{
            double left =  Double.parseDouble(visit(ctx.expr(0)).toString());
            double right = Double.parseDouble(visit(ctx.expr(1)).toString());
            return (ctx.op.getType() == OpmezParser.GEQT) ? (left >= right) : (left <= right);
        }

    }

    @Override
    public Object visitCondicionY(OpmezParser.CondicionYContext ctx) {
        boolean left = (boolean) visit(ctx.condition(0));
        boolean right = (boolean) visit(ctx.condition(1));
        return (left && right);
    }

    @Override
    public Object visitCondicionO(OpmezParser.CondicionOContext ctx) {
        boolean left = (boolean) visit(ctx.condition(0));
        boolean right = (boolean) visit(ctx.condition(1));
        return (left || right);
    }

    @Override
    public Object visitVerdadero(OpmezParser.VerdaderoContext ctx) {
        return true;
    }

    @Override
    public Object visitFalso(OpmezParser.FalsoContext ctx) {
        return false;
    }

    @Override
    public Object visitCondicionParentesis(OpmezParser.CondicionParentesisContext ctx) {
        return (boolean)visit(ctx.condition());
    }

    @Override
    public Object visitExpresion(OpmezParser.ExpresionContext ctx) {
        if ((int)visit(ctx.expr())==0){
            return false;
        }else if((int)visit(ctx.expr())==1){
            return true;
        }else{
            return visit(ctx.expr());
        }
    }

}
