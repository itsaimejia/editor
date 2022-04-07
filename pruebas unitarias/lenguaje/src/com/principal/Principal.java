package com.principal;

import com.parser.LenguajeLexer;
import com.parser.LenguajeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("test.c");
        LenguajeLexer lexico = new LenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        LenguajeParser sintactico = new LenguajeParser(tokens);
        ParseTree arbol = sintactico.program();
        MyVisitor visitas = new MyVisitor();
        visitas.visit(arbol);

        if(visitas.errors == 0){
            for (String line: MyVisitor.newSentence) {
                System.out.println(line+"\n");
            }
        }
    }
}
