package com.opmez;

import com.opmez.parser.OpmezBaseVisitor;
import com.opmez.parser.OpmezParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyVisitorOpmez extends OpmezBaseVisitor<Integer> {
    public static HashMap<String, Integer> memory = new HashMap<>();
    public static List<String> output = new ArrayList<>();

    @Override
    public Integer visitCuerpo(OpmezParser.CuerpoContext ctx) {
        for (int i =0; i<ctx.body().size(); i++){
            visit(ctx.body(i));
        }
        return 0;
    }

    @Override
    public Integer visitAsigDeclar(OpmezParser.AsigDeclarContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }

    @Override
    public Integer visitAsignacion(OpmezParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }


    @Override
    public Integer visitImpresion(OpmezParser.ImpresionContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        output.add(value.toString());
        return 0;
    }

    @Override
    public Integer visitNum(OpmezParser.NumContext ctx) {
        return Integer.valueOf(ctx.NUM().getText());
    }

    @Override
    public Integer visitId(OpmezParser.IdContext ctx) {

        String id = ctx.ID().getText();
        if(memory.containsKey(id))
            return memory.get(id);

        return 0;
    }
    @Override
    public Integer visitMultDiv(OpmezParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == OpmezParser.MULT)
            return left * right;
        else
            return left / right;
    }
    @Override
    public Integer visitSumSub(OpmezParser.SumSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == OpmezParser.SUM) {
            return left + right;
        }else {
            return left - right;
        }
    }

    @Override
    public Integer visitParentesis(OpmezParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }
}
