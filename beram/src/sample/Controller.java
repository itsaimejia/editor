package sample;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.control.TextArea;
public class Controller {

    private boolean flag=true;
    private String aux_lector;
    @FXML
    public static TextArea text_area;
    @FXML
    private void onOpen()
    {
        FileChooser fc= new FileChooser();
        FileChooser.ExtensionFilter txt = new FileChooser.ExtensionFilter("TXT file (.txt)" ,".txt");
        FileChooser.ExtensionFilter pdf = new FileChooser.ExtensionFilter("PDF file(.pdf)" ,".pdf");
        FileChooser.ExtensionFilter dat = new FileChooser.ExtensionFilter("Binary Code (.dat)" ,".dat");
        fc.getExtensionFilters().add(txt);
        fc.getExtensionFilters().add(pdf);
        fc.getExtensionFilters().add(dat);
        fc.showOpenDialog(new Stage());

        //Capturar archivo a poner en JTextArea
        File  archivo= new File (fc.getInitialDirectory()+fc.getInitialFileName());
        System.out.println(fc.getInitialDirectory()+fc.getInitialFileName());
        text_area.setText("");
        try {
            if (archivo != null){
                FileReader archivos= new FileReader(archivo);
                BufferedReader leer = new BufferedReader(archivos);
                while ((aux_lector = leer.readLine()) != null) {
                    text_area.appendText(aux_lector+"\n");
                }
                leer.close();
            }
        }catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    @FXML
    private void onSave()
    {

    }

    @FXML
    private void onSaveas()
    {

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