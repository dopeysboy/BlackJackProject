package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
	public Deck(int numDecks) {
		for(int i = 0; i < numDecks; i++) {
			for(Rank rank : Rank.values()) {
				for(Suit suit : Suit.values()) {
					deck.add(new Card(suit, rank));
				}
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck); 
	}
	
	public Card dealCard() {
		shuffle();
		Card returnCard = deck.get(0);
		deck.remove(0);
		
		return returnCard;
	}
	
	public int checkDeckSize() {
		return deck.size();
	}
	
}
