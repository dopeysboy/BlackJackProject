package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Card;

public class Player {
	protected int chips;
	protected BlackjackHand hand = new BlackjackHand();
	protected Dealer dealer;
	
	public Player() {}
	
	public Player(int chips, Dealer dealer) {
		this.chips = chips;
		this.dealer = dealer;
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public int getHandValue() {
		return hand.isHard();
	}
	
	public int getChips() {
		return chips;
	}
	
	public void clearHand() {
		this.hand = new BlackjackHand();
	}
	
	public boolean isBust() {
		return hand.isBust();
	}
	
	public boolean isBlackjack() {
		return hand.isBlackJack();
	}
	
	public void addChips(int chips) {
		this.chips += chips;
	}
	
	public int bet(int chips) {
		if(chips <= this.chips) {
			this.chips -= chips;
			return chips;
		} else {
			return 0;
		}
	}
	
	//tell dealer to deal to me
	public void hit() {
		dealer.dealCard(this);
	}

	public void split() {
		
	}
	
	@Override
	public String toString() {
		return hand.toString();
	}
}
