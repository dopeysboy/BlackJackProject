package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Hand;
import com.skilldistillery.blackjack.common.Rank;
import com.skilldistillery.blackjack.common.Suit;

public class BlackjackHand extends Hand{
	
	private final Card aceD = new Card(Suit.DIAMONDS, Rank.ACE);
	private final Card aceH = new Card(Suit.HEARTS, Rank.ACE);
	private final Card aceS = new Card(Suit.SPADES, Rank.ACE);
	private final Card aceC = new Card(Suit.CLUBS, Rank.ACE);
	
	public BlackjackHand() {
		
	}
	
	public boolean isBlackJack() {
		if(getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBust() {
		if(getHandValue() > 21) {
			return true;
		} else {
			return false;
		}
	}
	
	//if an ace is hard, its worth 11, otherwise its worth 1
	public boolean isHard() {
		if(containsAce() && isBust() || containsAce() && isBlackJack()) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean containsAce() { 
		if(cards.contains(aceC) || cards.contains(aceD) || cards.contains(aceH) || cards.contains(aceS)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int getHandValue() {
		int handValue = 0;
		
		for(Card c : cards) {
			handValue += c.getValue();
		}
		
		return handValue;
	}
}
