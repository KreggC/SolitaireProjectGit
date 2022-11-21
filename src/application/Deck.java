package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.image.Image;


public class Deck {
	
	private ArrayList<Card> deck;
	private Image BackImage;
	
	public Deck(ArrayList<Card> deck) {
		this.deck = deck;
		BackImage = new Image("src/images/cardback.png");
	}
	
	
	
	
	/*
	 *Deck method that generates a deck of cards using a for loop to programmatically create all possible variations of suits and faces provided.
	 *Source for references later: https://www.youtube.com/watch?v=AckjW0C2vc8
	 */
	


	public Deck() {
		List<String> suits = Card.ValidSuit();
		List<String> faces = Card.ValidFace();
		
		deck = new ArrayList<>();
		
		for (String suit:suits) {
			for (String face:faces) {
				deck.add(new Card(face, suit));
			}
			BackImage = new Image("file:src/images/cardback.png");
		}
	
	}	
	public Card CheckCard() {
		if(deck.size()>0) {
			return deck.get(0);
		}
		else return null;	
	}
	
	public Card DealCard() {
		if(deck.size()>0) {
			return deck.remove(0);
		}
		else return null;
	}
	
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public Image getBackImage() {
		return BackImage;
	}

	public void setBackImage(Image backImage) {
		BackImage = backImage;
	}

}