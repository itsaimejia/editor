package sample;

import com.opmez.MyVisitorOpmez;
import com.lenguaje.parser.LenguajeLexer;
import com.lenguaje.parser.LenguajeParser;
import com.lenguaje.MyVisitorLenguaje;
import com.opmez.parser.OpmezLexer;
import com.opmez.parser.OpmezParser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.Optional;

public class Controller {

    @FXML
    private TextArea text_Input;
    @FXML
    private TextArea text_Output;


    boolean creado =false;
    boolean traducido =false;
    static FileChooser fileChooser = new FileChooser();
    static String path_actual;
    static Alert alert = new Alert(AlertType.WARNING);
    static String initial_path = System.getProperty("user.home");
    static String last_text;

    public Controller() {
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("dat Files","*.dat"),
                new ExtensionFilter("c files","*.c"),
                new ExtensionFilter("all files","*.*")
        );
        alert.setTitle("Error");
    }


    public boolean validTranstale(String file_in) throws IOException {
        CharStream input = CharStreams.fromFileName(file_in);
        LenguajeLexer lexico = new LenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        LenguajeParser sintactico = new LenguajeParser(tokens);
        ParseTree arbol = sintactico.program();
        try{
            MyVisitorLenguaje visitas = new MyVisitorLenguaje();
            visitas.visit(arbol);
            traducido=true;
            return true;
        }catch (Exception e){
            System.out.println(e);
            text_Output.appendText("No se puso traducir");
            return false;
        }
    }
    private void write() throws IOException{
        String file_in ="C:\\Javalib\\lib\\input.txt";
        FileWriter fw = new FileWriter(file_in,false);
        fw.write(text_Input.getText());
        fw.close();
        saveFile();
        if(validTranstale(file_in)){
            text_Input.clear();
            for (String line: MyVisitorLenguaje.newSentence) {
                text_Input.appendText(line + "\n");
            }
            MyVisitorLenguaje.newSentence.clear();
        }

    }

    @FXML
    private void translate() throws  IOException{
        if (creado){
            saveFile();
            write();
        }else{
            if(saveAsFile())
                write();
        }
    }
    public void inputOpmez(String file_in) throws IOException {
        PrintStream ps = new PrintStream(new CustomOutputStream(text_Output));
        try {
            CharStream input = CharStreams.fromFileName(file_in);
            OpmezLexer lexico = new OpmezLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            OpmezParser sintactico = new OpmezParser(tokens);
            ParseTree arbol = sintactico.program();
            MyVisitorOpmez visitas = new MyVisitorOpmez(ps);
            visitas.visit(arbol);
            MyVisitorOpmez.memory.clear();
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("No se puede dividir entre 0");
        }
    }
    private void resolve() throws IOException{

        String file_in ="C:\\Javalib\\lib\\input.txt";
        FileWriter fw = new FileWriter(file_in,false);
        fw.write(text_Input.getText());
        fw.close();
        saveFile();
        text_Output.clear();
        inputOpmez(file_in);

    }
    @FXML
    private void execute() throws  IOException{
        if (creado){
            saveFile();
            resolve();
        }else{
            if(saveAsFile())
                resolve();
        }
    }

    //metodo que abre un filechooser para seleccionar un archivo
    @FXML
    private void onOpen() throws IOException
    {
        try {
            fileChooser.setTitle("Seleccionar archivo");
            String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
            path_actual = path_name;
            String fill_text = "";
            text_Input.setText("");
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
                alert.setTitle("Open");
                alert.setContentText("No seleccionaste ningun archivo");
                alert.showAndWait();
            }
        }catch (Exception e){
        }
    }

    @FXML
    private void onSave() throws IOException
    {
        if(creado) {
            saveFile();
        }
        else {
            if(saveAsFile()){
                saveFile();
                creado=true;
            }
        }

    }

    @FXML
    private void onSaveas() throws IOException
    {
        saveAsFile();
        creado =true;
    }

    @FXML
    private void onNew() throws  IOException
    {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Abrir nueva ventana");
        alert.setHeaderText("Quieres abrir el archivo en una nueva ventana?");
        alert.setContentText("Escoge tu opcion");

        ButtonType new_window = new ButtonType("Nueva ventana");
        ButtonType this_window = new ButtonType("Esta ventana");
        ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(new_window, this_window, cancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == new_window){
            try{

                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                primaryStage.setTitle("Editor de texto");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();

            }catch(Exception e){
            }
        } else if (result.get() == this_window) {
            text_Input.setText("");
            last_text= text_Input.getText();
            creado=false;
        }
    }
    @FXML
    private void onClose()
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
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
    }
    private boolean saveAsFile() throws  IOException{
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


}

