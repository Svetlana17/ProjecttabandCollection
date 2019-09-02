package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public  static  FXMLLoader loader;
    @Override
    public void start(Stage primaryStage) {
        try {
            loader = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    catch (Exception e){
        e.printStackTrace();}
    }


    public static void main(String[] args) {
        launch(args);
    }
}
