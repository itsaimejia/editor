package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.*;
import java.util.Optional;

public class Controller {

    @FXML
    private TextArea text_area;


    boolean creado =false;
    static FileChooser fileChooser = new FileChooser();
    static String path_actual;
    static Alert alert = new Alert(AlertType.WARNING);
    static String initial_path = System.getProperty("user.home");
    static String last_text;


    public Controller() {
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("PDF Files","*.pdf"),
                new ExtensionFilter("dat Files","*.dat"),
                new ExtensionFilter("all files",".")
        );
        alert.setTitle("Error");

    }
    @FXML
    private void mostrarArbol() throws  IOException{

        if (creado){
            saveFile();
            execGrun();
        }else{
            if(saveAsFile())
                execGrun();

        }

    }

    //metodo que manda a llamar el .bat del grun para mostrar el arbol de la gramatica
    private void execGrun() throws IOException{
        //escribir sobre el archivo tel.txt
        FileWriter fw = new FileWriter("C:\\Javalib\\num_telefono\\tel.txt",false);
        fw.write(text_area.getText());
        fw.close();

        //ejecutar comando cmd
        ProcessBuilder builder = new ProcessBuilder( "cmd.exe", "/c", "cd \"C:\\Javalib\\num_telefono\"&& commando.bat");
        builder.redirectErrorStream(true);
        builder.start();
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
            text_area.setText("");
            if (path_name != null) {
                BufferedReader br = new BufferedReader(new FileReader(path_name));
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                    fill_text += strCurrentLine + "\n";
                }
                text_area.appendText(fill_text);
                last_text=text_area.getText();
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
            text_area.setText("");
            last_text= text_area.getText();
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
            if(last_text.equals(text_area.getText())){
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
            File fichero = fileChooser.showSaveDialog(text_area.getScene().getWindow());
            path_actual =fichero.getPath();
            if(fichero != null) {
                FileWriter fw = new FileWriter(fichero);
                fw.write(text_area.getText());
            }
            last_text= text_area.getText();
            creado=true;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    private void saveFile() throws  IOException{
        FileWriter fw = new FileWriter(path_actual,false);
        fw.write(text_area.getText());
        fw.close();
        last_text= text_area.getText();
    }
}