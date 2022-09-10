package com.skilldistillery.blackjack.common;

public enum Rank {
	
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
	EIGHT(8), NINE(9), TEN(10), JACK(10, "J"), QUEEN(10, "Q"), 
	KING(10, "K"), ACE(11, "A");
	
	private int value;
	private String display;
	
	private Rank(int value) {
		this.value = value;
		this.display = "" + value;
	}
	
	private Rank(int value, String display) {
		this.value = value;
		this.display = display;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return display;
	}
}
