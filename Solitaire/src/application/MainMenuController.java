package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MainMenuController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	// Event Listener on Button.onAction
	@FXML
	public void KlondikeClicked(ActionEvent event) {
	
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("KlondikeMode.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	
	
	
	@FXML
	public void GameClose(ActionEvent event) {
		try {
			
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
