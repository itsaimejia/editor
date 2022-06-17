package sample;

import com.lenguaje.MyVisitorLenguaje;
import com.lenguaje.parser.LenguajeLexer;
import com.lenguaje.parser.LenguajeParser;
import com.opmez.CheckOpmez;
import com.opmez.MyVisitorOpmez;
import com.opmez.TranslateToC;
import com.opmez.parser.OpmezLexer;
import com.opmez.parser.OpmezParser;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.Paragraph;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.collection.ListModification;
import sample.richtext.JavaKeywordsAsyncDemo;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.opmez.CheckOpmez.compilador;

public class Main extends Application {

    CodeArea text_Input = new CodeArea();
    TextArea text_Output = new TextArea();


    static boolean creado =false;
    static boolean opmezCreado =false;
    static boolean jasminCreado = false;
    static FileChooser fileChooser = new FileChooser();
    static String path_actual;

    static String initial_path = System.getProperty("user.home");
    static String last_text;

    public Main(){
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("opmez files","*.op"),
                new FileChooser.ExtensionFilter("c files","*.c")

        );
        text_Output.setEditable(false);
    }
    private static final String[] KEYWORDS = new String[] {
            "else", "if", "int", "void", "while", "use", "initial"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/"   // for whole text processing (text blocks)
            + "|" + "/\\*[^\\v]*" + "|" + "^\\h*\\*([^\\v]*|/)";  // for visible paragraph processing (line by line)

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #262440;");

        text_Input.setParagraphGraphicFactory(LineNumberFactory.get(text_Input));
        text_Input.getVisibleParagraphs().addModificationObserver
                (
                        new VisibleParagraphStyler<>( text_Input, this::computeHighlighting )
                );
        final Pattern whiteSpace = Pattern.compile( "^\\s+" );
        text_Input.addEventHandler( KeyEvent.KEY_PRESSED, KE ->
        {
            if ( KE.getCode() == KeyCode.ENTER ) {
                int caretPosition = text_Input.getCaretPosition();
                int currentParagraph = text_Input.getCurrentParagraph();
                Matcher m0 = whiteSpace.matcher( text_Input.getParagraph( currentParagraph-1 ).getSegments().get( 0 ) );
                if ( m0.find() ) Platform.runLater( () -> text_Input.insertText( caretPosition, m0.group() ) );
            }
        });
        text_Input.setStyle("-fx-background-color: #e3d2ed;");


        MenuBar menuBar = new MenuBar();
        menuBar.setPrefSize(1000, 30);
        menuBar.setStyle("-fx-background-color: #5e5a8e; -fx-text-fill: white; -fx-font-size: 14px;");
        Menu menuFile = new Menu("File");
        menuFile.setStyle("-fx-text: white; -fx-font-size: 14px;");
        MenuItem item_open = new MenuItem("Open");
        item_open.setOnAction(actionEvent -> {
            try {
                fileChooser.setTitle("Seleccionar archivo");
                String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
                path_actual = path_name;
                String fill_text = "";
                System.out.println(path_name);
                text_Input.clear();
                if (path_name != null) {
                    BufferedReader br = new BufferedReader(new FileReader(path_name));

                    String strCurrentLine;
                    while ((strCurrentLine = br.readLine()) != null) {
                        fill_text += strCurrentLine + "\n";
                    }
                    text_Input.appendText(fill_text);
                    last_text= text_Input.getText();
                    creado = true;
                }else{

                }
            }catch (Exception e){
            }
        });
        MenuItem item_save = new MenuItem("Save");
        item_save.setOnAction(actionEvent -> {
            if(creado) {
                try {
                    saveFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    if(saveAsFile()){
                        try {
                            saveFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        creado=true;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        MenuItem item_saveAs = new MenuItem("Save As");
        item_saveAs.setOnAction(actionEvent -> {
            try {
                saveAsFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            creado =true;
        });
        menuFile.getItems().add(item_open);
        menuFile.getItems().add(item_save);
        menuFile.getItems().add(item_saveAs);

        Menu menuTools = new Menu("Tools");
        MenuItem item_clean_editor = new MenuItem("Clean editor");
        item_clean_editor.setOnAction(actionEvent -> {
            text_Input.clear();
        });
        MenuItem item_clean = new MenuItem("Clean console");
        item_clean.setOnAction(actionEvent -> {
            text_Output.clear();
        });
        MenuItem item_exit = new MenuItem("Exit");
        item_exit.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            ButtonType btn_save;
            ButtonType btn_exit = new ButtonType("Salir");
            if(creado){
                if(last_text.equals(text_Input.getText())){
                    System.exit(0);
                }else{
                    alert.setTitle("Antes de cerrar...");
                    alert.setHeaderText("Tu archivo presenta cambios");
                    alert.setContentText("Escoge una opcion");
                    btn_save = new ButtonType("Guardar cambios");
                    alert.getButtonTypes().setAll(btn_save,btn_exit);
                    Optional<ButtonType> result = alert.showAndWait();

                    if (result.get() == btn_exit){
                        System.exit(0);
                    }else if(result.get() == btn_save){
                        try{
                            saveFile();
                            System.exit(0);
                        }catch (Exception E){
                        }
                    }
                }

            }else{
                alert.setHeaderText("No has guardado tu archivo");
                alert.setContentText("Escoge una opcion");
                btn_save = new ButtonType("Guardar");
                alert.getButtonTypes().setAll(btn_save,btn_exit);
                Optional<ButtonType> result = alert.showAndWait();

                if (result.get() == btn_exit){
                    System.exit(0);
                }else if(result.get() == btn_save){
                    try{
                        saveAsFile();

                    }catch (Exception E){
                    }
                }
            }
        });
        menuTools.getItems().addAll(item_clean_editor,item_clean,item_exit);


        Menu menuTranslate = new Menu("Translate");
        MenuItem item_translate_to_opmez = new MenuItem("Translate to Opmez");
        item_translate_to_opmez.setOnAction(actionEvent -> {
            text_Output.clear();
            if (creado){
                try {
                    saveFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writeOpmez();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    if(saveAsFile())
                        writeOpmez();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        MenuItem item_translate_to_C = new MenuItem("Translate to C");
        item_translate_to_C.setOnAction(actionEvent -> {
            text_Output.clear();
            if (creado){
                try {
                    saveFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writeC();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    if(saveAsFile())
                        writeC();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        menuTranslate.getItems().addAll(item_translate_to_opmez, item_translate_to_C);

        Menu menuRun = new Menu("Run");
        MenuItem item_run = new MenuItem("Run opmez");
        item_run.setOnAction(actionEvent -> {

            try {
                if(opmezCreado){
                    resolve();
                }else{
                    if(text_Input.getText().length()>0){
                        fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("opmez files","*.op"));
                        File userDirectory = new File(initial_path);
                        fileChooser.setInitialDirectory(userDirectory);
                        fileChooser.setTitle("Guardar como");
                        File fichero = fileChooser.showSaveDialog(text_Input.getScene().getWindow());
                        path_actual =fichero.getPath();
                        if(fichero != null) {
                            FileWriter fw = new FileWriter(fichero);
                            fw.write(text_Input.getText());
                        }
                        last_text= text_Input.getText();
                        opmezCreado = true;
                        resolve();
                    }else{
                        fileChooser.setTitle("Seleccionar archivo");
                        String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
                        path_actual = path_name;
                        String fill_text = "";
                        System.out.println(path_name);
                        text_Input.clear();
                        if (path_name != null) {
                            BufferedReader br = new BufferedReader(new FileReader(path_name));

                            String strCurrentLine;
                            while ((strCurrentLine = br.readLine()) != null) {
                                fill_text += strCurrentLine + "\n";
                            }
                            text_Input.appendText(fill_text);
                            last_text = text_Input.getText();
                            opmezCreado=true;
                            resolve();
                        }
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        MenuItem item_jasmin = new MenuItem("Build jasmin");
        item_jasmin.setOnAction(actionEvent -> {
            if(opmezCreado){
                text_Output.appendText("Generate jasmin file\n");
                String file_in = new File ("code.j").getAbsolutePath();
                File file = new File(file_in);
                if(!file.exists()){
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                FileWriter fw = null;
                try {
                    fw = new FileWriter(file_in,false);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (String line: compilador) {
                    try {
                        fw.write(line+"\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                compilador.clear();
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                compilador.clear();
                jasminCreado=true;
            }

        });
        MenuItem item_class = new MenuItem("Build class");
        item_class.setOnAction(actionEvent -> {
            if(jasminCreado){
                ProcessBuilder builder = new ProcessBuilder(
                        "cmd.exe", "/c", "cd "+new File("").getAbsolutePath()+
                        "&& java -jar jasmin.jar code.j" +
                        "&& java Codigo");
                builder.redirectErrorStream(true);
                Process p = null;
                try {
                    p = builder.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while (true) {
                    try {
                        line = r.readLine();
                        if (line == null) { break; }
                        System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

        });

        menuRun.getItems().addAll(item_run,item_jasmin,item_class);

        menuBar.getMenus().addAll(menuFile, menuTools, menuTranslate, menuRun);

        HBox topMenu = new HBox(menuBar);
        topMenu.setPrefSize(1000, 30);
        topMenu.setStyle("-fx-background-color: #292D3E;");


        VirtualizedScrollPane inputText = new VirtualizedScrollPane<>(text_Input);
        inputText.setStyle("-fx-background-color: #292D3E;");
        inputText.setPrefSize(960, 400);

        text_Output.setPrefSize(960, 300);
        ScrollPane outputText = new ScrollPane(text_Output);
        outputText.setPrefSize(960, 300);

        AnchorPane.setLeftAnchor(inputText, 20.0);
        AnchorPane.setTopAnchor(inputText,60.0);
        AnchorPane.setLeftAnchor(outputText,20.0);
        AnchorPane.setTopAnchor(outputText,470.0);
        anchorPane.getChildren().addAll(inputText, topMenu, outputText);

        Scene scene = new Scene(anchorPane, 1000, 800, Color.GRAY);

        scene.getStylesheets().add(JavaKeywordsAsyncDemo.class.getResource("java-keywords.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Editor");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void writeC() throws IOException{
        PrintStream ps = new PrintStream(new CustomOutputStream(text_Output));
        System.setErr(ps);
        System.setOut(ps);
        try {
            CharStream input = CharStreams.fromString(text_Input.getText());
            OpmezLexer lexico = new OpmezLexer(input);
            lexico.removeErrorListeners();
            lexico.addErrorListener(new BaseErrorListener(){

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("line:" + line + ":" + charPositionInLine + " " + msg);
                }
            });
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            OpmezParser sintactico = new OpmezParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("line:" + line + ":" + charPositionInLine + " " + msg);
                }
            });
            ParseTree arbol = sintactico.program();
            TranslateToC visitas = new TranslateToC(ps);
            visitas.visit(arbol);

            if (visitas.errors == 0) {
                text_Input.clear();
                for (String line : TranslateToC.newSentence) {
                    text_Input.appendText(line + "\n");
                }
                TranslateToC.newSentence.clear();
            } else {
                ps.println("Ocurrio un problema al traducir");

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private void writeOpmez() throws IOException{
        PrintStream ps = new PrintStream(new CustomOutputStream(text_Output));
        System.setErr(ps);
        System.setOut(ps);
        try {
            CharStream input = CharStreams.fromString(text_Input.getText());
            LenguajeLexer lexico = new LenguajeLexer(input);
            lexico.removeErrorListeners();
            lexico.addErrorListener(new BaseErrorListener(){

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("line:" + line + ":" + charPositionInLine + " " + msg);
                }
            });
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            LenguajeParser sintactico = new LenguajeParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener(){
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("line:" + line + ":" + charPositionInLine + " " + msg);
                }
            });
            ParseTree arbol = sintactico.program();
            MyVisitorLenguaje visitas = new MyVisitorLenguaje(ps);
            visitas.visit(arbol);

            if (visitas.errors == 0) {
                text_Input.clear();
                for (String line : MyVisitorLenguaje.newSentence) {
                    text_Input.appendText(line + "\n");
                }
                MyVisitorLenguaje.newSentence.clear();

            } else {
                ps.println("Ocurrio un problema al traducir");

            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    private void resolve() throws IOException{
        saveFile();
        text_Output.clear();
        inputOpmez();
    }
    public void inputOpmez() throws IOException {
        PrintStream ps = new PrintStream(new CustomOutputStream(text_Output));
        try {

            CharStream input_ = CharStreams.fromString(text_Input.getText());
            OpmezLexer lexico_ = new OpmezLexer(input_);
            CommonTokenStream tokens_ = new CommonTokenStream(lexico_);
            OpmezParser sintactico_ = new OpmezParser(tokens_);
            ParseTree arbol_ = sintactico_.program();
            CheckOpmez visitas_ = new CheckOpmez(ps);
            visitas_.visit(arbol_);

            if(visitas_.errors == 0){

                text_Output.clear();
                CharStream input = CharStreams.fromString(text_Input.getText());
                OpmezLexer lexico = new OpmezLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexico);
                OpmezParser sintactico = new OpmezParser(tokens);
                ParseTree arbol = sintactico.program();
                MyVisitorOpmez visitas = new MyVisitorOpmez(ps);
                visitas.visit(arbol);
                MyVisitorOpmez.memory.clear();
                MyVisitorOpmez.tempMemory.clear();
                CheckOpmez.memory.clear();
                CheckOpmez.tempMemory.clear();

            }else{
                ps.println("No se pudo compilar");
            }
            visitas_.errors=0;

        } catch (ArithmeticException e) {
            ps.println(e);
            ps.println("No se puede dividir entre 0");
        }
    }


    private boolean saveAsFile() throws IOException {
        try{
            File userDirectory = new File(initial_path);

            fileChooser.setInitialDirectory(userDirectory);
            fileChooser.setTitle("Guardar como");
            File fichero = fileChooser.showSaveDialog(text_Input.getScene().getWindow());
            path_actual =fichero.getPath();
            if(fichero != null) {
                FileWriter fw = new FileWriter(fichero);
                fw.write(text_Input.getText());
            }
            last_text= text_Input.getText();
            creado=true;

            return true;
        }catch(Exception e){
            return false;
        }
    }
    private void saveFile() throws  IOException{

        FileWriter fw = new FileWriter(path_actual,false);
        fw.write(text_Input.getText());
        fw.close();
        last_text= text_Input.getText();
    }
    private StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("SEMICOLON") != null ? "semicolon" :
                                                    matcher.group("STRING") != null ? "string" :
                                                            matcher.group("COMMENT") != null ? "comment" :
                                                                    null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }
    private class VisibleParagraphStyler<PS, SEG, S> implements Consumer<ListModification<? extends Paragraph<PS, SEG, S>>>
    {
        private final GenericStyledArea<PS, SEG, S> area;
        private final Function<String,StyleSpans<S>> computeStyles;
        private int prevParagraph, prevTextLength;

        public VisibleParagraphStyler( GenericStyledArea<PS, SEG, S> area, Function<String,StyleSpans<S>> computeStyles )
        {
            this.computeStyles = computeStyles;
            this.area = area;
        }

        @Override
        public void accept( ListModification<? extends Paragraph<PS, SEG, S>> lm )
        {
            if ( lm.getAddedSize() > 0 )
            {
                int paragraph = Math.min( area.firstVisibleParToAllParIndex() + lm.getFrom(), area.getParagraphs().size()-1 );
                String text = area.getText( paragraph, 0, paragraph, area.getParagraphLength( paragraph ) );

                if ( paragraph != prevParagraph || text.length() != prevTextLength )
                {
                    int startPos = area.getAbsolutePosition( paragraph, 0 );
                    Platform.runLater( () -> area.setStyleSpans( startPos, computeStyles.apply( text ) ) );
                    prevTextLength = text.length();
                    prevParagraph = paragraph;
                }
            }
        }
    }



}


