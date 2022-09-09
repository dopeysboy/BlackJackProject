package com.skilldistillery.blackjack.common;

import java.util.List;

public abstract class Hand {
	protected List<Card> cards;

	public Hand() {
		
	}
	
	public void addCard(Card card) {
		
	}
	
	public void clear() {
		
	}
	
	public abstract int getHandValue();
	
	@Override
	public String toString() {
		return new String();
	}
}
