package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;

public class Controller {

    @FXML
    private TextArea text_area;
    static TextArea area;
    boolean creado =false;
    static FileChooser fileChooser = new FileChooser();
    static String ruta_actual;
    public Controller() {

        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("PDF Files","*.pdf"),
                new ExtensionFilter("dat Files","*.dat"),
                new ExtensionFilter("all files",".")
        );

    }

    @FXML
    private void onOpen()
    {
        String path_name = fileChooser.showOpenDialog(new Stage()).getPath();
        ruta_actual=path_name;
        String fill_text="";
        if (path_name != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(path_name))) {
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                    fill_text+=strCurrentLine+"\n";

                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
            area=text_area;
            area.appendText(fill_text);
            creado=true;
        }
    }

    @FXML
    private void onSave()
    {
        if(creado)
        {
            try
            {
                FileWriter f2 = new FileWriter(ruta_actual,false);
                f2.write(area.getText());
                f2.close();

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(),"No se ha seleccionado un archivo", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    private void onSaveas()
    {

        try{
            File userDirectory = new File("C:");
            fileChooser.setInitialDirectory(userDirectory);
            fileChooser.setTitle("Guardar Archivo");
            area=text_area;
            File fichero = fileChooser.showSaveDialog(area.getScene().getWindow());
            ruta_actual=fichero.getPath();
            if(fichero != null)
            {
                try(FileWriter fw = new FileWriter(fichero)){
                    fw.write(area.getText());
                    creado =true;
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