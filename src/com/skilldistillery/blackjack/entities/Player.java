package com.skilldistillery.blackjack.entities;

public class Player {
	protected int chips;
	protected BlackjackHand hand;
	
	public Player() {}
	
	public Player(int chips) {
		this.chips = chips;
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
	
	public void hit() {
		
	}
	
	public void stay() {
		
	}
	
	public void split() {
		
	}

}
