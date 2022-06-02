package com.opmez;

import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CheckOpmez extends OpmezBaseVisitor<Object> {
    public static HashMap<String, Object> memory = new LinkedHashMap<>();
    public static HashMap<String, Object> tempMemory = new LinkedHashMap<>();
    public static List<String> compilador = new ArrayList<>();
    private boolean joinIfElse = false;
    private boolean bodyInScope=false;
    private boolean errorDeclaration = false;
    private boolean globalSentence=false;
    public int errors = 0;
    private PrintStream ps;
    int line = 0;
    String globalPos;
    String label;
    public CheckOpmez(PrintStream ps){
        this.ps=ps;
        System.setOut(this.ps);
        System.setErr(this.ps);
    }

    @Override
    public Object visitCuerpo(OpmezParser.CuerpoContext ctx) {
        compilador.add(".class public Codigo");
        compilador.add(".super java/lang/Object");
        compilador.add(".method public static main([Ljava/lang/String;)V");
        compilador.add(".limit stack 20");
        compilador.add(".limit locals 20");
        for (int i = 0; i < ctx.instructions().size(); i++) {
            visit(ctx.instructions(i));
            globalSentence=true;
            line++;
        }
        globalSentence=false;

        compilador.add("return");
        compilador.add(".end method");
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
    public Object visitImpresionExpr(OpmezParser.ImpresionExprContext ctx) {
        compilador.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expr());
        compilador.add("invokevirtual java/io/PrintStream/println(I)V");
        return null;
    }

    @Override
    public Object visitCadenaTexto(OpmezParser.CadenaTextoContext ctx) {
        compilador.add("ldc \""+ctx.STRING().getText().replace('"',' ').trim()+"\n\"");
        return ctx.STRING().getText();
    }

    @Override
    public Object visitImpresionString(OpmezParser.ImpresionStringContext ctx) {
        compilador.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.string());
        compilador.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
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
                    int pos=0;
                    for (String key: memory.keySet()) {
                        if(key.equals(id)) break;
                        pos++;
                    }
                    compilador.add("istore "+pos);
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
        try{
            String id = ctx.ID().getText();
            if(joinIfElse || bodyInScope){
                if(tempMemory.containsKey(id)){
                    return tempMemory.get(id);
                }else if(memory.containsKey(id)){
                    int pos=0;
                    for (String key: memory.keySet()) {
                        if(key.equals(id)) break;
                        pos++;
                    }
                    compilador.add("iload "+pos);
                    globalPos=String.valueOf(pos);
                    return memory.get(id);
                }else{
                    errors++;
                    System.out.println("Linea"+line+": "+ctx.ID().getText()+" no esta definida");
                    return null;
                }
            }else if(memory.containsKey(id)) {
                System.out.println("iload");
                int pos=0;
                for (String key: memory.keySet()) {
                    if(key.equals(id)) break;
                    pos++;
                }
                compilador.add("iload "+pos);
                globalPos=String.valueOf(pos);
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
        compilador.add("bipush "+ctx.getText());
        return Integer.valueOf(ctx.getText());
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
        compilador.add("istore "+globalPos);
        return (ctx.op.getType() == OpmezParser.SUM) ? left + right : left - right;
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
        compilador.add("END:");
        return null;
    }

    @Override
    public Object visitCicle(OpmezParser.CicleContext ctx) {
        line++;
        joinIfElse=true;
        Object result = null;
        label="WHILEBODY";

        try{

            visit(ctx.condition());
            compilador.add("goto DONE");
            compilador.add("WHILEBODY:");
            result=visit(ctx.body());
            visit(ctx.condition());

            compilador.add("DONE:");
        }catch(Exception e){
            errors++;
            ps.println("Algo fallo en: while");
        }
        tempMemory.clear();
        joinIfElse=false;
        bodyInScope=false;
        return result;
    }

    @Override
    public Object visitSentenciaIf(OpmezParser.SentenciaIfContext ctx)  {
        line++;
        Object result = null;
        label = "IFBODY";
        try{
            visit(ctx.condition());
            compilador.add("goto ELSEBODY");
            compilador.add("IFBODY:");
            result=visit(ctx.body());
            compilador.add("goto END");
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
        line++;
        Object result = null;
        joinIfElse = true;
        try{
            compilador.add("ELSEBODY:");
            result=visit(ctx.body());
            compilador.add("goto END");
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
        line++;
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
            ps.println("Algo fallo en: elif");
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
        if(ctx.op.getType() == OpmezParser.EQT){
            compilador.add("if_icmpeq "+label);
            return (left == right);
        }else {
            compilador.add("if_icmpne "+label);
            return (left != right);
        }
    }

    @Override
    public Object visitCondicionesMayMen(OpmezParser.CondicionesMayMenContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));
        if(ctx.op.getType() == OpmezParser.GT) {
            compilador.add("if_icmpgt "+label);
            return  (left > right);
        }else{
            compilador.add("if_icmplt "+label);
            return (left < right);
        }
    }

    @Override
    public Object visitCondicionesMayMenIgual(OpmezParser.CondicionesMayMenIgualContext ctx) {
        int left = (int) visit(ctx.expr(0));
        int right = (int) visit(ctx.expr(1));

        if(ctx.op.getType() == OpmezParser.GEQT){
            compilador.add("if_icmpge "+label);
            return (left >= right);
        }else{
            compilador.add("if_icmple "+label);
            return (left <= right);
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
        if(ctx.expr().getText() .equals("1") || ctx.expr().getText().equals("0")){
            return ctx.expr().getText().equals("1")? true :false;
        }else{
            errors++;
            System.out.println("Error en evaluar: "+ctx.expr().getText()+" se esperaba {1, 0, true, false, condition}");
            return null;
        }

    }
}
