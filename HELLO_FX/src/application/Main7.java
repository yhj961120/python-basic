package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Main7 extends Application {
	
	TextField tfMine ;
	TextField tfCom ;
	TextField tfResult ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("main7.fxml"));

			Scene scene = new Scene(root,400,400);
			
			tfMine = (TextField) scene.lookup("#tfMine");
			tfCom = (TextField) scene.lookup("#tfCom");
			tfResult = (TextField) scene.lookup("#tfResult");
			Button btn = (Button) scene.lookup("#btn");
			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myclick();
				}	
			});
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myclick() {
		String com = "";
		String mine = "";
		String result ="";
		
		mine = tfMine.getText();
		
		double rnd = Math.random();
		
		if(rnd >0.66) {
			com = "가위";
		} else if(rnd >0.33) {
			com = "바위";
		} else {
			com = "보";
		}
		
		if(com.equals("가위")&&mine.equals("가위"))	result="비김";
		if(com.equals("가위")&&mine.equals("바위"))	result="이김";
		if(com.equals("가위")&&mine.equals("보"))		result="짐";
		
		if(com.equals("바위")&&mine.equals("가위"))	result="짐";
		if(com.equals("바위")&&mine.equals("바위"))	result="비김";
		if(com.equals("바위")&&mine.equals("보"))		result="이김";
		
		if(com.equals("보")&&mine.equals("가위"))	result="이김";
		if(com.equals("보")&&mine.equals("바위"))	result="짐";
		if(com.equals("보")&&mine.equals("보"))	result="비김";

		tfCom.setText(com);
		tfResult.setText(result);
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
