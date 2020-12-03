package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Editor de texto");

        TextArea textArea = new TextArea();
        Button imprimir = new Button("Imprimir");
        imprimir.setMinWidth(50);

        MenuBar menuBar = new MenuBar();
        VBox vBox = new VBox(menuBar, textArea, imprimir);
        Scene scene = new Scene(vBox, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

        Menu menu = new Menu("File");
        MenuItem abrir = new MenuItem("Open");
        MenuItem guardar = new MenuItem("Save");
        MenuItem guardarComo = new MenuItem("Save as");
        MenuItem nuevo = new MenuItem("New");

        menu.getItems().add(abrir);
        menu.getItems().add(guardar);
        menu.getItems().add(guardarComo);
        menu.getItems().add(nuevo);
        menuBar.getMenus().add(menu);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
