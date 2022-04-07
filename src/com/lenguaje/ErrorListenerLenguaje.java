package com.lenguaje;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListenerLenguaje  extends BaseErrorListener {

    public static final ErrorListenerLenguaje INSTANCE = new ErrorListenerLenguaje();
    public static int errorSyntax = 0;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        errorSyntax++;
        throw new ParseCancellationException("si " + line + ":" + charPositionInLine + " " + msg);
    }
}