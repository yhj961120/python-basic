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


public class Maina extends Application {
	
	TextField tf1;
	TextField tf2;
	TextField tf3;
	TextField tf4;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("maina.fxml"));

			Scene scene = new Scene(root,400,400);
			
			tf1 = (TextField) scene.lookup("#tf1");
			tf2 = (TextField) scene.lookup("#tf2");
			tf3 = (TextField) scene.lookup("#tf3");
			tf4 = (TextField) scene.lookup("#tf4");
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
		String a = tf1.getText();
		String b = tf2.getText();
		String c = tf3.getText();
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);
		int sum = 0;
		
		for(int i=aa;i<=bb;i++) {
			if(i%cc==0) {
				sum+=i;	
			}
		}
		
		tf4.setText(Integer.toString(sum));
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}



