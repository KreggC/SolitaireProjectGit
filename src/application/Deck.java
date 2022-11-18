package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.image.Image;


public class Deck {
	
	private ArrayList<Card> deck;
	
	public Deck(ArrayList<Card> deck) {
		this.deck = deck;
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
		}
	}	
	
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	
	
	
}