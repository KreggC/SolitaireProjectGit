package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class MainMenuController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	
	@FXML
	private Parent root;
	

	// Event Listener on Button.onAction
	@FXML
	public void KlondikeClicked(ActionEvent event) {
	
		
		try {
			root = FXMLLoader.load(getClass().getResource("KlondikeMode.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();

			/*
			 * Image card = new Image("images/10c.png"); ImageView view = new
			 * ImageView(card); view.setFitHeight(80); view.setPreserveRatio(true); Button
			 * test = new Button(); test.setTranslateX(500); test.setTranslateY(500);
			 * test.setPrefSize(80, 80); test.setGraphic(view); Group group1 = new
			 * Group(test);
			 */
			
			scene = new Scene(root);	
			stage.setScene(scene);
			stage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	/*
	 * @FXML public void cardImage() {
	 * 
	 * }
	 */
	
	@FXML
	public void GameClose(ActionEvent event) {
		try {
			
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
