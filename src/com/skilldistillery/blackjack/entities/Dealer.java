package com.skilldistillery.blackjack.entities;

import com.skilldistillery.blackjack.common.Deck;

/*
 * TODO dealer logic ->
 * 		if dealer hand value < 17 hits
 * 		if dealer hand value == 21 dealer wins
 * 		if dealer busts -> players that did not bust win
 * 		if dealer is dealt 21 -> dealer auto wins
 * 		if dealer hand value == 17 stay
 * 		dealer will pay out winner if there is one
 */
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
	
	//deals two cards to each player
	public void dealOpening() {
		for(int i = 0; i < 2; i++) {	
			for(Player p : table.getPlayers()) {
				p.addCardToHand(deck.dealCard());
			}
		}
	}
	
	public void dealCard(Player p) {
		p.addCardToHand(deck.dealCard());
	}
	
	public void newPlayer(Player p) {
		table.addPlayer(p);
	}
	
	public String showHand(boolean playerStay) {
		//if the player is done hitting, show whole hand
		if(playerStay) {
			return this.toString();
		} else {
			return hand.getCards().get(0).toString() + "\t***";
		}
	}
}
