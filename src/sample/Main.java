package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static sample.RandomMethod.getRandomNaumber;

public class Main extends Application {


    public  static  FXMLLoader loader;
    RandomMethod r = new RandomMethod();
    @Override
    public void start(Stage primaryStage) {
        try {
            loader = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root = loader.load();
          //  Scene scene = new Scene(root);
            Scene scene = new Scene(root, 400, 300, Color.WHITE);
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
        getRandomNaumber(); // Вызов методы из класса RandomMethod
    }
}
