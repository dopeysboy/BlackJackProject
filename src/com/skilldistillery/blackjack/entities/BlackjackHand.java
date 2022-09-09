package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Hand;

public class BlackjackHand extends Hand{

	public BlackjackHand() {
		
	}
	
	public boolean isBlackJack() {
		return false;
	}
	
	public boolean isBust() {
		return false;
	}
	
	public boolean isHard() {
		return false;
	}
	
	public boolean isSoft() {
		return false;
	}
	
	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
