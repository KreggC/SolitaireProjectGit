package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class KlondikeModeController implements Initializable {
	@FXML
	private ImageView DeckImage;
	@FXML
	private ImageView WasteImage;
	@FXML
	private MenuBar MenuBar;
	private Deck deck;
	private Stage stage;
	private Scene scene;
	private Parent root;


	
	public void initialize(URL arg0, ResourceBundle arg1) {
		deck = new Deck();
		deck.shuffle();
		DeckImage.setImage(deck.getBackImage());
	}
	
	

	@FXML 
	public void DeckClicked() {
		if(deck.CheckCard() == null) {
			DeckImage.setImage(null);
		}
		else {
			WasteImage.setImage(deck.DealCard().getFaceImage());
		}
	}
	
	@FXML
	public void MainMenuClicked(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			stage = (Stage) MenuBar.getScene().getWindow();
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
			Platform.exit();
			}
		catch(Exception e){
			e.printStackTrace();			
	}
}	
	@FXML
	public void RestartClicked(ActionEvent event) {		
		try {
			root = FXMLLoader.load(getClass().getResource("KlondikeMode.fxml"));
			stage = (Stage) MenuBar.getScene().getWindow();
			scene = new Scene(root);	
			stage.setScene(scene);
			stage.show();		
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}	
}

		
