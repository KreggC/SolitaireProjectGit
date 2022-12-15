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
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class KlondikeModeController implements Initializable {
	@FXML
	private ImageView DeckImage;
	@FXML
	private ImageView WasteImage;
	@FXML
	private MenuBar MenuBar;
	private double X, Y;
	private Deck deck;
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Pile Tableau1, Tableau2, Tableau3, Tableau4, Tableau5, Tableau6, Tableau7, Foundation1, Foundation2, Foundation3, Foundation4, Waste;


	
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		piles();
		fillTableau();
		
	}


	/*
	 * when the deck is clicked, it checks if the deck is null. If the deck is null, it changes the waste pile image to also be null. 
	 * If the deck isn't null, it grabs the image from the deck before it deals the card from the deck ArrayList to the pile ArrayList.
	 */
	
	@FXML 
	public void DeckClicked() {
		if(deck.CheckCard() == null) {
			DeckImage.setImage(null);
		}
		else {
			WasteImage.setImage(deck.CheckCard().getFaceImage());
			Waste.AddToPile(deck.DealCard());
			
		}
	}
	
	/*
	 * Fills the tableau piles using for loops
	 */
	
	public void fillTableau() {
		Tableau1.AddToPile(deck.DealCard());
		
		for(int i = 1; i > 2; i++) {
			Tableau2.AddToPile(deck.DealCard());
		}
		for(int i = 1; i > 3; i++) {
			Tableau3.AddToPile(deck.DealCard());
		}
		for(int i = 1; i > 4; i++) {
			Tableau4.AddToPile(deck.DealCard());
		}
		for(int i = 1; i > 5; i++) {
			Tableau5.AddToPile(deck.DealCard());
		}
		for(int i = 1; i > 6; i++) {
			Tableau6.AddToPile(deck.DealCard());
		}
		for(int i = 1; i > 7; i++) {
			Tableau7.AddToPile(deck.DealCard());
		}	
	}
	
	@FXML
	public void mainMenuClicked(ActionEvent event) {
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
	public void restartClicked(ActionEvent event) {		
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
	public void piles() {
		deck = new Deck();
		Waste = new Pile();
		Tableau1 = new Pile();
		Tableau2 = new Pile();
		Tableau3 = new Pile();
		Tableau4 = new Pile();
		Tableau5 = new Pile();
		Tableau6 = new Pile();
		Tableau7 = new Pile();
		Foundation1 = new Pile();
		Foundation2 = new Pile();
		Foundation3 = new Pile();
		Foundation4 = new Pile();
		deck.shuffle();
		DeckImage.setImage(deck.getBackImage());
	}	
}


		