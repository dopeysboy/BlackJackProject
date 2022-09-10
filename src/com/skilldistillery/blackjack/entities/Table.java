package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private int pot;
	private List<Player> players = new ArrayList<>();
	
	public Table() {}
	
	public Table(Player...players) {
		for(Player p : players) {
			this.players.add(p);
		}
	}
	
	public void addToPot(int bet) {
		pot += bet;
	}
	
	//TODO split pots
	public void payout(Player player) {
		player.addChips(pot);
		pot = 0;
	}
	
	public void addPlayer(Player p1, Player...players) {
		this.players.add(p1);
		
		for(Player p : players) {
			this.players.add(p);
		}
	} 
	
	public void ejectPlayer(Player player) {
		this.players.remove(player);
	}
	
	public int getPot() {
		return this.pot;
	}
	
	public List<Player> getPlayers(){
		return players;
	}
}
