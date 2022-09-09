package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Deck;

public class Dealer extends Player{
	private Deck deck;
	private final int NUMBER_DECKS = 1;
	private Table table;
	
	public Dealer() {}
	
	public Dealer(int chips) {
		this.chips = chips;
		this.deck = new Deck(NUMBER_DECKS);
		this.table = new Table((Player)(this));
	}
	
	public void dealOpening() {
		for(Player p : table.getPlayers()) {
			
		}
	}
	
	public void newPlayer(Player p) {
		table.addPlayer(p);
	}
}
