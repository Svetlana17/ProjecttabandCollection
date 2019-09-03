package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Tab2Controller implements Initializable{

	@FXML private Label lbl_2;
	@FXML private Button btn2;
	private int counter=0;
	@FXML private ComboBox<String>comboBox;
     PieChart pieChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	public  void addViewCounter(){
		lbl_2.setText(""+counter);
		counter++;
	}
	
	@FXML public void resetCounter1(ActionEvent e) throws IOException{
		MainController m = Main.loader.getController();
		m.tab1contentController.resetCounter();

	
   }

	public void resetCounter() {
		counter = 0;
		lbl_2.setText(""+counter);
	}

	public void hello(ActionEvent actionEvent) {
		System.out.println("hello");
	}



}