package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static sample.RandomMethod.getRandomNaumber;

public class Main extends Application {


    public  static  FXMLLoader loader;
    RandomMethod r = new RandomMethod();
    @Override
    public void start(Stage primaryStage) {
        try {
            loader = new FXMLLoader(getClass().getResource("test.fxml"));
            Parent root = loader.load();
          //  Scene scene = new Scene(root);
            Scene scene = new Scene(root, 600, 400, Color.WHITE);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            scene.getStylesheets().add((getClass().getResource("/css/color.css")).toExternalForm());
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



       // stage.setScene(scene);
       // stage.show();
    }
//}



