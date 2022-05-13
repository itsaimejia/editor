package com.opmez;

import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.io.PrintStream;
import java.util.HashMap;

public class CheckOpmez extends OpmezBaseVisitor<Object> {
    public static HashMap<String, Object> memory = new HashMap<String, Object>();
    public static HashMap<String, Object> tempMemory = new HashMap<>();
    private boolean joinIfElse = false;
    private boolean bodyInScope=false;
    private boolean errorDeclaration = false;
    private boolean globalSentence=false;
    public int errors = 0;
    private PrintStream ps;
    int line = 1;
    public CheckOpmez(PrintStream ps){
        this.ps=ps;
        System.setOut(this.ps);
        System.setErr(this.ps);
    }

    @Override
    public Object visitCuerpo(OpmezParser.CuerpoContext ctx) {
        for (int i = 0; i < ctx.instructions().size(); i++) {
            visit(ctx.instructions(i));
            globalSentence=true;
            line++;
        }
        globalSentence=false;
        return null;
    }

    @Override
    public Object visitCuerpoScope(OpmezParser.CuerpoScopeContext ctx) {
        line++;
        for (int i = 0; i < ctx.instructions().size(); i++) {
            visit(ctx.instructions(i));
            bodyInScope = true;
            line++;

        }
        bodyInScope=false;
        return null;
    }

    @Override
    public Object visitDeclaracion(OpmezParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();

        if(joinIfElse || bodyInScope ){
            if(memory.containsKey(id) && tempMemory.containsKey(id)){
                errorDeclaration =true;
                errors++;
                System.out.println("Linea"+line+":"+ctx.ID().getText()+" ya esta declarada");
            }else{
                tempMemory.put(id,null);
            }
        }else if(!memory.containsKey(id)){
            memory.put(id,null);
        }else{
            errorDeclaration =true;
            errors++;
            System.out.println("Linea"+line+":"+ctx.ID().getText()+" ya esta declarada");
        }
        return null;
    }

    @Override
    public Object visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        if(joinIfElse || bodyInScope){
            if(memory.containsKey(id) || tempMemory.containsKey(id)){
                errorDeclaration =true;
                errors++;
                System.out.println("Linea"+line+":"+ctx.ID().getText()+" ya esta declarada");
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
            System.out.println("Linea"+line+": "+ctx.ID().getText()+" ya esta declarada");
            return null;
        }
    }

    @Override
    public Object visitAsignacion(OpmezParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();

        if(errorDeclaration){
            errors++;
            System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta declarada");
            return null;
        }else{
            try{
                Object value = visit(ctx.expr());
                if(joinIfElse || bodyInScope){
                    if(tempMemory.containsKey(id)){
                        tempMemory.put(id, value);
                        return tempMemory.get(id);
                    }else if(memory.containsKey(id)){
                        memory.put(id,value);
                        return memory.get(id);
                    }else{
                        errors++;
                        System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta declarada");
                        return null;
                    }
                }else if(memory.containsKey(id)) {
                    memory.put(id, value);
                    return memory.get(id);
                }else{
                    errors++;
                    System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta declarada");
                    return null;
                }
            }catch (Exception e){
                System.out.println("Linea"+line+": Ocurrio un error en la asignacion de: "+id);
                return null;
            }
        }
    }

    @Override
    public Object visitId(OpmezParser.IdContext ctx) {
        System.out.println(memory);
        System.out.println(tempMemory);
        try{
            String id = ctx.ID().getText();
            if(joinIfElse || bodyInScope){
                if(tempMemory.containsKey(id)){
                    return tempMemory.get(id);
                }else if(memory.containsKey(id)){
                    return memory.get(id);
                }else{
                    errors++;
                    System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta definida");
                    System.out.println();
                    return null;
                }
            }else if(memory.containsKey(id)) {
                return memory.get(id);
            }else{
                errors++;
                System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta definida");
                return null;
            }
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public Object visitNumero(OpmezParser.NumeroContext ctx) {
        return Integer.valueOf(ctx.getText());
    }



    @Override
    public Object visitIfElse(OpmezParser.IfElseContext ctx)  {
        joinIfElse = true;
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
        try{
            visit(ctx.condition());
            result=visit(ctx.body());
        }catch(Exception e){
            errors++;
            ps.println("Algo fallo en: if("+ctx.condition().getText()+")");
        }
        tempMemory.clear();
        joinIfElse=false;
        bodyInScope=false;
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
            ps.println("Algo fallo en: else");
        }
        joinIfElse=false;
        bodyInScope=false;
        tempMemory.clear();
        return result;

    }
    @Override
    public Object visitSentenciaElif(OpmezParser.SentenciaElifContext ctx) {
        joinIfElse = true;
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
        try{
            boolean condicion = (boolean) visit(ctx.condition());
            result=visit(ctx.body());
        }catch(Exception e){
            errors++;
            ps.println("Algo fallo en: else");
        }
        tempMemory.clear();
        joinIfElse=false;
        bodyInScope=false;
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
            errors++;
            System.out.println("Error en evaluar: "+ctx.expr().getText()+" se esperaba {1, 0, true, false, condition}");
            return null;
        }

    }
}
