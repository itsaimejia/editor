package com;

import com.parser.OpmezBaseVisitor;
import com.parser.OpmezParser;

import java.io.PrintStream;
import java.util.HashMap;

public class CheckOpmez extends OpmezBaseVisitor<Object> {
    public static HashMap<String, Object> memory = new HashMap<String, Object>();
    public static HashMap<String, Object> tempMemory = new HashMap<>();
    boolean joinIfElse = false;
    public boolean errorDeclaration = false;
    public int errors = 0;

    @Override
    public Object visitDeclaracion(OpmezParser.DeclaracionContext ctx) {

        String id = ctx.ID().getText();
        if(joinIfElse){
            if(memory.containsKey(id) || tempMemory.containsKey(id)){
                errorDeclaration =true;

                errors++;
                System.out.println(ctx.ID().getText()+" ya esta declarada");
            }else{

                tempMemory.put(id,null);
            }
        }else if(!memory.containsKey(id)){

            memory.put(id,null);
        }else{
            errorDeclaration =true;
            errors++;
            System.out.println(ctx.ID().getText()+" ya esta declarada");
        }
        return null;
    }

    @Override
    public Object visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        if(joinIfElse){
            if(memory.containsKey(id) || tempMemory.containsKey(id)){
                errorDeclaration =true;
                errors++;
                System.out.println(ctx.ID().getText()+" ya esta declarada");
                return null;
            }else{
                tempMemory.put(id,value);
                return tempMemory.get(id);
            }
        }else if(!memory.containsKey(id)){
            memory.put(id,value);
            return memory.get(id);
        }else{
            errorDeclaration =true;
            errors++;
            System.out.println(ctx.ID().getText()+" ya esta declarada");
            return null;
        }
    }

    @Override
    public Object visitAsignacion(OpmezParser.AsignacionContext ctx) {

        String id = ctx.ID().getText();
        if(errorDeclaration){
            errors++;
            return null;
        }else{
            try{
                Object value = visit(ctx.expr());
                if(joinIfElse){
                    if(!memory.containsKey(id)){
                        tempMemory.put(id, value);
                        return tempMemory.get(id);
                    }else{
                        memory.put(id,value);
                        return memory.get(id);
                    }
                }else if(memory.containsKey(id)) {

                    memory.put(id, value);
                    return memory.get(id);
                }else{
                    errors++;
                    System.out.println(ctx.ID().getText()+" no esta definida");
                    return null;
                }
            }catch (Exception e){
                System.out.println("Ocurrio un error en la asignacion de: "+id);
                return null;
            }
        }
    }

    @Override
    public Object visitId(OpmezParser.IdContext ctx) {

        try{
            String id = ctx.ID().getText();
            if(joinIfElse){
                if(!memory.containsKey(id)){
                    return tempMemory.get(id);
                }else{
                    return memory.get(id);
                }
            }else if(memory.containsKey(id)) {
                return memory.get(id);
            }else{
                errors++;
                System.out.println(ctx.ID().getText()+" no esta definida");
                return null;
            }
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public Object visitNumero(OpmezParser.NumeroContext ctx) {

        if(ctx.op.getType() == OpmezParser.INT) {
            return Integer.valueOf(ctx.getText());
        }else if(ctx.op.getType() == OpmezParser.DOUBLE) {
            return Double.valueOf(ctx.getText());
        }else
            return null;
    }
    @Override
    public Object visitIfElse(OpmezParser.IfElseContext ctx)  {
        try{
            visit(ctx.if_sentence());
            if(ctx.else_sentence()!=null){
                visit(ctx.else_sentence());
            }else if(ctx.elif_sentence()!=null){
                visit(ctx.elif_sentence());
            }
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Object visitSentenciaIf(OpmezParser.SentenciaIfContext ctx)  {
        Object result = null;
        joinIfElse = true;
        try{
            boolean condicion = (boolean) visit(ctx.condition());
            result=visit(ctx.body());
        }catch(Exception e){
            errors++;
            System.out.println("Algo fallo en: if("+ctx.condition().getText()+")"+e);
        }
        joinIfElse = false;
        return result;

    }

    @Override
    public Object visitSentenciaElse(OpmezParser.SentenciaElseContext ctx) {
        Object result = null;
        joinIfElse = true;
        try{
            result=visit(ctx.body());
        }catch(Exception e){
            errors++;
            System.out.println("Algo fallo en: else");
        }
        joinIfElse = false;
        return result;

    }
    @Override
    public Object visitSentenciaElif(OpmezParser.SentenciaElifContext ctx) {

        try{
            visit(ctx.elif_frag_condition());
            if(ctx.else_sentence()!=null){
                visit(ctx.else_sentence());
            }else if(ctx.elif_sentence()!=null){
                visit(ctx.elif_sentence());
            }
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Object visitCondicionElif(OpmezParser.CondicionElifContext ctx) {
        Object result = null;
        joinIfElse = true;
        try{
            boolean condicion = (boolean) visit(ctx.condition());
            result=visit(ctx.body());
        }catch(Exception e){
            errors++;
            System.out.println("Algo fallo en: elif("+ctx.condition().getText()+")");
        }
        joinIfElse = false;
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

        if(ctx.expr().getText().equals("1") || ctx.expr().getText().equals("0")){
            return ctx.expr().getText().equals("1")? true :false;
        }else{
            errors++;
            return null;
        }

    }
}