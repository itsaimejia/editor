package com.opmez;

import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MyVisitorOpmez extends OpmezBaseVisitor<Object> {
    public static HashMap<String, Object> memory = new LinkedHashMap<>();
    public static HashMap<String, Object> tempMemory = new LinkedHashMap<>();
    public static List<String> compilador = new ArrayList<>();
    boolean joinIfElse = false;
    int fails = 0;
    private boolean bodyInScope=false;

    private PrintStream ps;
    public MyVisitorOpmez(PrintStream ps){
        this.ps=ps;
        System.setOut(this.ps);
        System.setErr(this.ps);
    }
    @Override
    public Object visitCuerpo(OpmezParser.CuerpoContext ctx) {
        compilador.add(".class public Codigo");
        compilador.add(".super java/lang/Object");
        compilador.add(".method public static main([Ljava/lang/String;)V");
        compilador.add(".limit stack 10");
        compilador.add(".limit locals 10");
        for (int i = 0; i < ctx.instructions().size(); i++) {
            visit(ctx.instructions(i));
        }
        compilador.add("return");
        compilador.add(".end method");
        return null;
    }

    @Override
    public Object visitCuerpoScope(OpmezParser.CuerpoScopeContext ctx) {
        for (int i = 0; i < ctx.instructions().size(); i++) {
            visit(ctx.instructions(i));
            bodyInScope = true;
        }
        bodyInScope=false;
        return null;
    }

    @Override
    public Object visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        if(joinIfElse || bodyInScope){
            if(!(memory.containsKey(id) || tempMemory.containsKey(id))){
                tempMemory.put(id,value);
                return tempMemory.get(id);
            }
        }else if(!memory.containsKey(id)){
            memory.put(id,value);
            return memory.get(id);
        }
        return null;
    }

    @Override
    public Object visitDeclaracion(OpmezParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();

        if(joinIfElse || bodyInScope){
            if(!(memory.containsKey(id) && tempMemory.containsKey(id))){
                tempMemory.put(id,null);
            }
        }else if(!memory.containsKey(id)){
            memory.put(id,null);
        }
        return null;
    }

    @Override
    public Object visitAsignacion(OpmezParser.AsignacionContext ctx) {
        try{
            String id = ctx.ID().getText();
            Object value = visit(ctx.expr());
            if(joinIfElse || bodyInScope){
                if(!memory.containsKey(id)){
                    tempMemory.put(id, value);
                    return tempMemory.get(id);
                }else{
                    memory.put(id,value);
                    return memory.get(id);
                }
            }else if(memory.containsKey(id)) {
                memory.put(id, value);
                int pos=0;
                for (String key: memory.keySet()) {
                    if(key.equals(id)) break;
                    pos++;
                }
                compilador.add("istore "+pos);
                return memory.get(id);
            }
        }catch (Exception e){

        }
        return null;
    }


    @Override
    public Object visitImpresionExpr(OpmezParser.ImpresionExprContext ctx) {
        compilador.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Object result = visit(ctx.expr());
        compilador.add("invokevirtual java/io/PrintStream/println(I)V");
        System.out.println(result);
        return null;
    }

    @Override
    public Object visitImpresionString(OpmezParser.ImpresionStringContext ctx) {
        compilador.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        compilador.add("ldc "+ctx.STRING());
        compilador.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        System.out.println(ctx.STRING().getText().replace('"', (char)' ').trim());
        return null;
    }

    @Override
    public Object visitNumero(OpmezParser.NumeroContext ctx) {
        compilador.add("bipush "+ctx.getText());
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Object visitId(OpmezParser.IdContext ctx) {
        try{
            String id = ctx.ID().getText();
            if(joinIfElse || bodyInScope){
                if(!memory.containsKey(id)){
                    return tempMemory.get(id);
                }else{
                    return memory.get(id);
                }
            }else if(memory.containsKey(id)) {

                int pos=0;
                for (String key: memory.keySet()) {
                    if(key.equals(id)) break;
                    pos++;
                }
                compilador.add("iload "+pos);
                return memory.get(id);
            }else{
                return null;
            }
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    @Override
    public Object visitMultDiv(OpmezParser.MultDivContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        compilador.add(ctx.op.getType() == OpmezParser.MULT?"imul":"idiv");
        return (ctx.op.getType() == OpmezParser.MULT)? left * right: left / right;
    }
    @Override
    public Object visitSumSub(OpmezParser.SumSubContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        compilador.add(ctx.op.getType() == OpmezParser.SUM?"iadd":"isub");
        return (ctx.op.getType() == OpmezParser.SUM) ? left + right : left - right;
    }

    @Override
    public Object visitParentesis(OpmezParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitIfElse(OpmezParser.IfElseContext ctx)  {
        joinIfElse = true;
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
        return null;
    }

    @Override
    public Object visitSentenciaIf(OpmezParser.SentenciaIfContext ctx)  {
        joinIfElse = true;
        try{
            boolean result = (boolean)visit(ctx.condition());
            if(result){
                visit(ctx.body());
            }
            tempMemory.clear();
            joinIfElse=false;
            bodyInScope=false;
            return  result;
        }catch(Exception e){
            System.out.println("Algo fallo en: if("+ctx.condition().getText()+")");
            return null;
        }

    }

    @Override
    public Object visitSentenciaElse(OpmezParser.SentenciaElseContext ctx) {
        joinIfElse = true;
        visit(ctx.body());
        tempMemory.clear();
        joinIfElse=false;
        bodyInScope=false;
        return null;

    }
    @Override
    public Object visitSentenciaElif(OpmezParser.SentenciaElifContext ctx) {
        joinIfElse = true;
        try{
            boolean result= (boolean) visit(ctx.elif_frag_condition());
            if(!result){
                if(ctx.else_sentence()!=null){
                    visit(ctx.else_sentence());
                }else if(ctx.elif_sentence()!=null){
                    visit(ctx.elif_sentence());
                }
            }
            joinIfElse=false;
            bodyInScope=false;
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public Object visitCondicionElif(OpmezParser.CondicionElifContext ctx) {
        try{
            joinIfElse = true;
            boolean result = (boolean)visit(ctx.condition());
            if(result){
                visit(ctx.body());
            }
            joinIfElse = false;
            tempMemory.clear();
            return  result;
        }catch(Exception e){
            fails++;
            System.out.println("Algo fallo en: elif("+ctx.condition().getText()+")");
            return null;

        }
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
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        return (ctx.op.getType() == OpmezParser.EQT) ? (left == right) : (left != right);
    }

    @Override
    public Object visitCondicionesMayMen(OpmezParser.CondicionesMayMenContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        return (ctx.op.getType() == OpmezParser.GT) ? (left > right) : (left < right);
    }

    @Override
    public Object visitCondicionesMayMenIgual(OpmezParser.CondicionesMayMenIgualContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        return (ctx.op.getType() == OpmezParser.GEQT) ? (left >= right) : (left <= right);
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
        if(ctx.expr().getText() .equals("1") || ctx.expr().getText().equals("0")){
            return ctx.expr().getText().equals("1")? true :false;
        }else{
            System.out.println("Se esperaba {1, 0, true, false, condition}");
            return null;
        }

    }


}
