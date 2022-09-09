package com.skilldistillery.blackjack.common;

import java.util.Objects;

public class Card {
	protected Suit suit;
	protected Rank value;
	
	public Card(Suit suit, Rank value) {
		this.suit = suit;
		this.value = value;
	}

	public int getValue() {
		return this.value.getValue();
	}
	
	@Override
	public String toString() {
		return value + " of " + suit;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return suit == other.suit && value == other.value;
	}
	
}
