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
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class KlondikeController  {
	
	private Stage stage;

	@FXML
	private ImageView buttonImage;
	@FXML
	private ImageView defaultview;

	// Event Listener on Button.onAction
	@FXML
	public void TestClicked(ActionEvent event) {
				
        System.out.println("You clicked the button!");      
        File imageFile = new File("src/images/cardback.png");
        Image image;
		try {
			image = new Image(new FileInputStream(imageFile));
			buttonImage.setImage(image);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
	}
	
	@FXML
	public void imagePicker(){
        File imageFile = new File("src/images/cardback.png");
        Image image;
		try {
			image = new Image(new FileInputStream(imageFile));
			defaultview.setImage(image);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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