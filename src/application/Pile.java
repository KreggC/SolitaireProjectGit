package application;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Pile {		
		private ArrayList<Card> pile;
		private Image BackImage;
		
		
		


		public Pile(){
			this.pile = new ArrayList<Card>();
			this.BackImage = new Image("file:src/images/cardback.png");
		}	
			
			
		public void AddToPile(Object Card) {
			pile.add(0, (application.Card) Card);	
		}
		
		public String toString() {
			return pile.toString();
		
		}
		
}
