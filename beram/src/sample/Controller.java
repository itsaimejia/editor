package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

    @FXML
    static TextArea text_area;

    @FXML
    private void onOpen() throws IOException
    {
        text_area = new TextArea();
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
            text_area.appendText(fill_text);
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