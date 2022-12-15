package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VegasModeController implements Initializable {
	@FXML
	private ImageView WasteImageVegas;
	@FXML
	private ImageView DeckImageVegas;
	private MenuBar VegasMenuBarReset;
	private Deck deck;
	private Stage stage;
	private Scene scene;
	private Parent root;


	
	
	@FXML
	public void DeckClicked(MouseEvent MouseAction) {
		if(deck.CheckCard() == null) {
			DeckImageVegas.setImage(null);
		}
		else {
			WasteImageVegas.setImage(deck.DealCard().getFaceImage());
		}
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void VegasRestartButton(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("VegasMode.fxml"));
			stage = (Stage) VegasMenuBarReset.getScene().getWindow();
			scene = new Scene(root);	
			stage.setScene(scene);
			stage.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void VegasMenu(ActionEvent event) {
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		deck = new Deck();
		deck.shuffle();
		DeckImageVegas.setImage(deck.getBackImage());
		
	}
}
