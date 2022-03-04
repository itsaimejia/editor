package com.principal;

import com.parser.CalculadoraLexer;
import com.parser.CalculadoraParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public void ExecuteAntlr(String file_in) throws IOException{
        CharStream input = CharStreams.fromFileName(file_in);
        CalculadoraLexer lexico = new CalculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        CalculadoraParser sintactico = new CalculadoraParser(tokens);
        ParseTree arbol = sintactico.program();
        MyVisitor visitas = new MyVisitor();
        visitas.visit(arbol);

    }
}



