package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();

	public Hand() {
		
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		for(Card c : cards) {
			cards.remove(c);
		}
	}
	
	public List<Card> getCards(){
		List<Card> returnList = new ArrayList<>();
		
		for(Card c: cards) {
			returnList.add(c);
		}
		
		return returnList;
	}
	
	public abstract int getHandValue();
	
	@Override
	public String toString() {
		return new String();
	}
}
