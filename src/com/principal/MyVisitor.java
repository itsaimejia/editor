package com.principal;

import com.parser.CalculadoraBaseVisitor;
import com.parser.CalculadoraParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyVisitor extends CalculadoraBaseVisitor<Integer> {
    public static HashMap<String, Integer> memory = new HashMap<>();
    public static List<String> output = new ArrayList<>();

    @Override
    public Integer visitAsignacion(CalculadoraParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id,value);

        return value;
    }

    @Override
    public Integer visitImpresion(CalculadoraParser.ImpresionContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        output.add(value.toString());
        return 0;
    }

    @Override
    public Integer visitInt(CalculadoraParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(CalculadoraParser.IdContext ctx) {

        String id = ctx.ID().getText();
        if(memory.containsKey(id))
            return memory.get(id);

        return 0;
    }
    @Override
    public Integer visitMultDiv(CalculadoraParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == CalculadoraParser.MULT)
            return left * right;
        else
            return left / right;
    }
    @Override
    public Integer visitSumSub(CalculadoraParser.SumSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == CalculadoraParser.SUM) {
            return left + right;
        }else {
            return left - right;
        }
    }

    @Override
    public Integer visitParentesis(CalculadoraParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }


}
