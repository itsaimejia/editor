package com.guarennes;



import com.guarennes.parser.GuarennesBaseVisitor;
import com.guarennes.parser.GuarennesParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyVisitorGuarennes extends GuarennesBaseVisitor<Integer> {
    public static HashMap<String, Integer> memory = new HashMap<>();
    public static List<String> output = new ArrayList<>();

    @Override
    public Integer visitCuerpo(GuarennesParser.CuerpoContext ctx) {
        for (int i =0; i<ctx.body().size(); i++){
            visit(ctx.body(i));
        }
        return 0;
    }

    @Override
    public Integer visitAsignacion(GuarennesParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }


    @Override
    public Integer visitImpresion(GuarennesParser.ImpresionContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        output.add(value.toString());
        return 0;
    }

    @Override
    public Integer visitNum(GuarennesParser.NumContext ctx) {
        return Integer.valueOf(ctx.NUM().getText());
    }

    @Override
    public Integer visitId(GuarennesParser.IdContext ctx) {

        String id = ctx.ID().getText();
        if(memory.containsKey(id))
            return memory.get(id);

        return 0;
    }
    @Override
    public Integer visitMultDiv(GuarennesParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == GuarennesParser.MULT)
            return left * right;
        else
            return left / right;
    }
    @Override
    public Integer visitSumSub(GuarennesParser.SumSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == GuarennesParser.SUM) {
            return left + right;
        }else {
            return left - right;
        }
    }

    @Override
    public Integer visitParentesis(GuarennesParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }
}
