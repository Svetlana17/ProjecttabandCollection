package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Tab1Controller implements Initializable{
	

	 @FXML private Label lbl_1;
	 @FXML private Button btn1, btn1ex;
	 @FXML private Tab2Controller tab2contentController;
	 @FXML private Label lbl_2;
	 Operationable operationable;

	private Desktop desktop = Desktop.getDesktop();


////

	private int counter=0;
	final Menu menu1 = new Menu("File");

	MenuBar menuBar = new MenuBar();
	final FileChooser fileChooser = new FileChooser();


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		menuBar.getMenus().add(menu1);


		//menuBar.getMenus().add(menu2);

		//menuBar.prefWidthProperty().bind(.widthProperty());
	}
	
	@FXML public void resetCounter2(ActionEvent e) throws IOException{
			
			
			MainController m = Main.loader.getController();
			m.tab2contentController.resetCounter();
			 
		
	}

	public void resetCounter() {
		counter = 0;
		lbl_1.setText(""+counter);
		lbl_2.setText("OK");
	}
	
	
	public void addViewCounter(){
		counter++;
		lbl_1.setText(""+counter);
	}
	public  void  run_a_loop(){
		int i =1;
		while (i<5){
			System.out.println(i*7 + " i");
			i++;
		}

		// Лямда выражения
		operationable =((x, y) -> x+y);
		int result = operationable.calculate(10,20);
		//System.out.println(result);
           // случатель для кнопки
		btn1ex.setOnAction(event -> System.out.println(result));

				//System.out.println(operationable);

	}

   /// Обработчик событий для пункта меню
	public void print(ActionEvent actionEvent) {
		System.out.println("Идет печать");
	}

	public  void read (ActionEvent actionEvent){

		try(FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\notes3.txt"))
		{
			// читаем посимвольно
			int c;
			while((c=reader.read())!=-1){

				System.out.print((char)c);
			}
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

	public  void open(ActionEvent actionEvent)
	{


	}

}

//}
