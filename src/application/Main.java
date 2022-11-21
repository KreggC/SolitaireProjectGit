package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Solitaire");
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/icon.png")));
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {			
			e.printStackTrace();	
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		launch(args);
	}
}