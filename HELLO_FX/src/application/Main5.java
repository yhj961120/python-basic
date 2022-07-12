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


public class Main5 extends Application {
	
	TextField tf_mine ;
	TextField tf_com ;
	TextField tf_result ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("main5.fxml"));

			Scene scene = new Scene(root,400,400);
			
			tf_mine = (TextField) scene.lookup("#tf_mine");
			tf_com = (TextField) scene.lookup("#tf_com");
			tf_result = (TextField) scene.lookup("#tf_result");
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
		
		mine = tf_mine.getText();
		
		double rnd = Math.random();
		
		if(rnd >0.5) {
			com = "홀";
		} else {
			com = "짝";
		}
		
		if(com.equals(mine)) {
			result = "이김";
		} else {
			result = "짐";
		}
		tf_com.setText(com);
		tf_result.setText(result);
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
