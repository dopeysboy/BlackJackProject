package com.skilldistillery.blackjack.blackjackapp;

import java.util.Scanner;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

/*
 * TODO game logic:
 * 		player can hit until handValue >= 21
 * 		player wins if handValue == 21
 * 		player wins if handValue > dealer.handValue || dealerBusts
 * 		
 */
public class BlackJackApp {

	private Dealer dealer = new Dealer(1000);
	private Player usr = new Player(100);
	private Scanner kb = new Scanner(System.in);
	//if the user quits, will end the game
	private boolean isRunning = true;
	
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	public void run() {
//		while(isRunning) {
//			printMain();
//			getUserInput();
//		}
		playGame();
	}
	
	public void printMain() {
		StringBuilder sb = new StringBuilder();
		sb.append("******B*L*A*C*K*J*A*C*K******\n");
		sb.append("----------Main Menu----------\n");
		sb.append("1. Play game\n");
		sb.append("2. Rules of Blackjack\n");
		sb.append("3. Quit");
		
		System.out.println(sb.toString());
	}
	
	public void getUserInput() {
		String tempUsrInput = kb.nextLine();
		try {
			int usrInput = Integer.parseInt(tempUsrInput);
			
			switch (usrInput) {
				case 1:
					playGame();
					break;
				case 2:
					printRules();
					break;
				case 3:
					System.out.println("Goodbye!");
					isRunning = false;
					break;
				default:
					System.err.println("Please enter a valid number between 1 and 3.");
					break;
			}
		} catch(NumberFormatException e) {
			System.err.println("Please enter a valid number between 1 and 3.");
		}
	}
	
	/*
	 * TODO does player win or lose
	 * 		allow player to hit or stay
	 * 		show table
	 */
	public void playGame() {
		dealer.newPlayer(usr);
		dealer.dealOpening();
		System.out.println(usr);
	}
	
	//TODO give user the rules
	public void printRules() {
		StringBuilder sb = new StringBuilder();
		sb.append("TODO: give the user the rules");
		
		System.out.println(sb.toString());
	}

	
}
