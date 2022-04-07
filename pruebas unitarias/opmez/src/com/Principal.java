package com;

import com.parser.OpmezLexer;
import com.parser.OpmezParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("input.txt");
            OpmezLexer lexico = new OpmezLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            OpmezParser sintactico = new OpmezParser(tokens);
            ParseTree arbol = sintactico.program();
            CheckOpmez visitas = new CheckOpmez();
            visitas.visit(arbol);
            if(visitas.errors == 0){
                CharStream input_ = CharStreams.fromFileName("input.txt");
                OpmezLexer lexico_ = new OpmezLexer(input_);
                CommonTokenStream tokens_ = new CommonTokenStream(lexico_);
                OpmezParser sintactico_ = new OpmezParser(tokens_);
                ParseTree arbol_ = sintactico_.program();
                MyVisitorOpmez visitas_ = new MyVisitorOpmez();
                visitas_.visit(arbol_);
            }
        } catch (ArithmeticException | IOException e) {
            System.out.println(e);
        }
    }
}
