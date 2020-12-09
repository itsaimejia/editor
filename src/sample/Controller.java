package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    @FXML
    private TextArea text_area;
    static TextArea area;


    boolean creado =false;
    static FileChooser fileChooser = new FileChooser();
    static String path_actual;
    static Alert alert = new Alert(Alert.AlertType.WARNING);
    static String initial_path = System.getProperty("user.home");
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
    private void onOpen() throws IOException
    {
        try {
            fileChooser.setTitle("Seleccionar archivo");
            String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
            path_actual = path_name;
            String fill_text = "";
            area = text_area;
            area.setText("");
            if (path_name != null) {
                BufferedReader br = new BufferedReader(new FileReader(path_name));
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                    fill_text += strCurrentLine + "\n";
                }
                area.appendText(fill_text);
                creado = true;
            }else{
                alert.setTitle("Open");
                alert.setContentText("No seleccionaste ningun archivo");
                alert.showAndWait();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @FXML
    private void onSave() throws IOException
    {
        if(creado) {
            FileWriter fw = new FileWriter(path_actual,false);
            fw.write(area.getText());
            fw.close();
        }
        else {
            alert.setTitle("Save ");
            alert.setContentText("No se ha seleccionado archivo");
            alert.showAndWait();
        }

    }

    @FXML
    private void onSaveas() throws IOException
    {

        try{
            setFileChooser("Guardar como");
            area=text_area;
            File fichero = fileChooser.showSaveDialog(area.getScene().getWindow());
            path_actual =fichero.getPath();
            if(fichero != null)
            {
                FileWriter fw = new FileWriter(fichero);
                fw.write(area.getText());
                creado =true;
            }
        }catch(Exception e){
        }

    }
    @FXML
    private void onNew() throws  IOException
    {
        try{
            setFileChooser("Nuevo archivo");
            area=text_area;
            path_actual = fileChooser.showSaveDialog(area.getScene().getWindow()).getPath();
            area.setText("");
            creado=true;
        }catch(Exception e){
        }
    }
    @FXML
    private void onClose()
    {
        System.exit(0);
    }

    private void setFileChooser(String title){
        File userDirectory = new File(initial_path);
        fileChooser.setInitialDirectory(userDirectory);
        fileChooser.setTitle(title);
    }


}