package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class Main4 extends Application {
	
	TextField tf;
	TextArea ta;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("main4.fxml"));

			Scene scene = new Scene(root,400,400);
			
			tf = (TextField) scene.lookup("#tf");
			ta = (TextArea) scene.lookup("#ta");
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
		String dan = tf.getText();
		int idan = Integer.parseInt(dan);
		String txt = "";
		
		txt += idan+"*"+1+"="+(1*idan)+"\n";
		txt += idan+"*"+2+"="+(2*idan)+"\n";
		txt += idan+"*"+3+"="+(3*idan)+"\n";
		txt += idan+"*"+4+"="+(4*idan)+"\n";
		txt += idan+"*"+5+"="+(5*idan)+"\n";
		txt += idan+"*"+6+"="+(6*idan)+"\n";
		txt += idan+"*"+7+"="+(7*idan)+"\n";
		txt += idan+"*"+8+"="+(8*idan)+"\n";
		txt += idan+"*"+9+"="+(9*idan)+"\n";

		ta.setText(txt);

	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
