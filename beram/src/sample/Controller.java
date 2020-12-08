package sample;

import javafx.fxml.FXML;
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
        path_actual =path_name;
        String fill_text="";
        area=text_area;
        area.setText("");
        if (path_name != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(path_name))) {
                String strCurrentLine;
                while ((strCurrentLine = br.readLine()) != null) {
                    fill_text+=strCurrentLine+"\n";

                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }

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
                FileWriter fw = new FileWriter(path_actual,false);
                fw.write(area.getText());
                fw.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("No se ha seleccionado archivo");
        }

    }

    @FXML
    private void onSaveas()
    {

        try{
            File userDirectory = new File("C:");
            fileChooser.setInitialDirectory(userDirectory);
            fileChooser.setTitle("Guardar archivo");
            area=text_area;
            File fichero = fileChooser.showSaveDialog(area.getScene().getWindow());
            path_actual =fichero.getPath();
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
        try{
            File userDirectory = new File("C:");
            fileChooser.setInitialDirectory(userDirectory);
            fileChooser.setTitle("Nuevo archivo");
            area=text_area;
            File fichero = fileChooser.showSaveDialog(area.getScene().getWindow());
            path_actual =fichero.getPath();
            area.setText("");
            creado=true;
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    @FXML
    private void onClose()
    {
        System.exit(0);
    }


}