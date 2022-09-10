package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Card;

public class Player {
	protected int chips;
	protected BlackjackHand hand = new BlackjackHand();
	
	public Player() {}
	
	public Player(int chips) {
		this.chips = chips;
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public int getChips() {
		return chips;
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
		
	}
	
	public void stay() {
		
	}
	
	public void split() {
		
	}
	
	@Override
	public String toString() {
		return hand.toString();
	}
}
