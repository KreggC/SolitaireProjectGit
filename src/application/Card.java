package application;

import java.util.Arrays;
import java.util.List;

import javafx.scene.image.Image;

public class Card {

	private String face;
	private String suit;
	private Image faceImage;
	private Image CardBack;
	
	
	public Card(String face, String suit) { 
		this.face = face;
		this.suit = suit;
		String cardimage= face+suit;
		this.faceImage = (new Image("/images/"+cardimage+".png"));
		this.CardBack = (new Image("/images/cardback.png"));
	}


 
	/*
	 * Uses ValidFace Method to populate a list that holds strings.
	 * If the list of strings contains what the program is attempting to create a card object with,
	 * it will allow it. If the list of strings doesn't contain it, it will throw a custom error to the end user containing valid faces.
	 */
	
	
	public void setFace(String face) {
		List<String> ValidFace = ValidFace();
		if(ValidFace.contains(face))		
		this.face = face;
		else throw new IllegalArgumentException("Invalid card face, valid faces are: "+ ValidFace);
	}


	/*
	 * Uses ValidSuit Method to populate a list that holds strings.
	 * If the list of strings contains what the program is attempting to create a card object with,
	 * it will allow it. If the list of strings doesn't contain it, it will throw a custom error to the end user containing valid suits.
	 */
	
	public void setSuit(String suit) {
		List<String> ValidSuit = ValidSuit();
		if(ValidSuit.contains(suit))
		this.suit = suit;
		else throw new IllegalArgumentException("Invalid card suit, valid suits are: " + ValidSuit);
	};
	

	public String getSuit() {
		return suit;
	}

	public String getFace() {
		return face;
	}

	
	public String toString() {
		return String.format("%s of %s",face, suit);
	
	}
	
	
	/*
	 * Methods that return a List of strings for error checking purposes in setters.
	 */
		
	public static List<String> ValidFace(){
		return Arrays.asList("2","3","4","5","6","7","8","9","10","j","q","k","ace");
	};
	
	public static List<String> ValidSuit(){
		return Arrays.asList("c","s","d","h");
	};


}