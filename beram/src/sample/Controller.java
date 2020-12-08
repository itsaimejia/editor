package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    @FXML
    private TextArea text_area;
    static TextArea area;

    @FXML
    private void onOpen()
    {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("PDF Files","*.pdf"),
                new ExtensionFilter("dat Files","*.dat")
                );
        String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
        String fill_text="";
        if (path_name != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(path_name))) {
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                    fill_text+=strCurrentLine+"\n";
                }
            } catch (IOException e) {
                System.out.println(e.toString());;
            }
            System.out.println(fill_text);
            area=text_area;
            area.appendText(fill_text);
        }
    }

    @FXML
    private void onSave()
    {


    }

    @FXML
    private void onSaveas()
    {

        try{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.getExtensionFilters().addAll(
                    new ExtensionFilter("Text Files", "*.txt"),
                    new ExtensionFilter("PDF Files","*.pdf"),
                    new ExtensionFilter("dat Files","*.dat"),
                    new ExtensionFilter("all files",".")
            );
            File userDirectory = new File("C:");
            fileChooser.setInitialDirectory(userDirectory);
            fileChooser.setTitle("Guardar Archivo");
            area=text_area;
            File fichero = fileChooser.showSaveDialog(area.getScene().getWindow());
            if(fichero != null)
            {
                try(FileWriter fw = new FileWriter(fichero)){
                    fw.write(area.getText());
                }catch(final IOException ex){
                    ex.printStackTrace();
                }

            }
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
    @FXML
    private void onNew()
    {

    }
    @FXML
    private void onClose()
    {
        System.exit(0);
    }


}