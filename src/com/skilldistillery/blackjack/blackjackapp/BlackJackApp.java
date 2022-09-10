package com.skilldistillery.blackjack.blackjackapp;

import java.util.Scanner;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

/*
 * TODO 
 * 	softAce
 * 	multiple players
 * 	implement bets
 * 	split hands
 * 	double down???
 *  figure out on lose why syserr happens after menu print (seemingly at random)
 */
public class BlackJackApp {

	private Dealer dealer = new Dealer(1000);
	private Player usr = new Player(100, dealer);
	private Scanner kb = new Scanner(System.in);
	
	//if the user quits, will end the game
	private boolean isRunning = true;
	//game is running until this boolean says false
	private boolean gameLoop;
	//game starts with the player still hitting, so will not show the dealer's full hand, just the first card
	private boolean playerStay;
	
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	public void run() {
		dealer.newPlayer(usr);
		while(isRunning) {
			gameLoop = true;
			playerStay = false;
			printMain();
			getMenuInput();
		}
			
		kb.close();
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
	
	public void getMenuInput() {
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
	

	public void playGame() {

		dealer.dealOpening();

		while(gameLoop) {
			//show player opening deal
			//get if user wants to hit or stay
			printTable();
			gameLogic();
			getGameInput();
		}
	}
	
	//TODO give user the rules
	//TODO wait until user input to close rules menu
	public void printRules() {
		StringBuilder sb = new StringBuilder();
		sb.append("TODO: give the user the rules");
		
		System.out.println(sb.toString());
	}

	//TODO pretty table ascii art
	public void printTable() {
		System.out.println("Dealer: ");
		System.out.println(dealer.showHand(playerStay));
		System.out.println("*******");
		System.out.println("You: ");
		System.out.println(usr);
	}
	
	public void printChoices() {
		System.out.print("1. Hit\t2. Stay");
	}
	
	public void gameLogic() {
		//auto game end logic
		if(usr.isBlackjack()) {
			System.out.println("BLACK JACK");
			gameLoop = false;
		} else if(usr.isBust()) {
			System.err.println("BUST");
			gameLoop = false;
		}
		
		//player is done hitting
		if(playerStay) {
			dealerLogic();
		}
		
	}
	
	public void dealerLogic() {
		while(dealer.getHandValue() < 17) {
			dealer.dealCard(dealer);
			printTable();
		}
		
		if(dealer.isBlackjack()) {
			System.err.println("BLACK JACK, YOU LOSE");
		} else if(dealer.isBust()) {
			System.out.println("DEALER BUST, YOU WIN");
		} else if(dealer.getHandValue() < usr.getHandValue()) {
			System.out.println("YOU WIN");
		} else if(dealer.getHandValue() > usr.getHandValue()) {
			System.err.println("YOU LOSE");
		} else if(dealer.getHandValue() == usr.getHandValue()) {
			System.out.println("PUSH");
		}
		
		gameLoop = false;
	}
	
	public void getGameInput() {
		if(gameLoop) {	
			boolean goodChoice = false;
				
			while(!goodChoice) {
				printChoices();
				
				String tempUsrInput = kb.nextLine();
				
				try {
					int usrInput = Integer.parseInt(tempUsrInput);
					switch (usrInput) {
						case 1:
							usr.hit();
							goodChoice = true;
							break;
						case 2:
							playerStay = true;
							goodChoice = true;
							break;
						default:
							System.err.println("Please enter 1, 2, Hit or Stay");
							break;
					}
				} catch (NumberFormatException e) {
					switch(tempUsrInput.toUpperCase()) {
						case "HIT":
							usr.hit();
							goodChoice = true;
							break;
						case "STAY":
							playerStay = true;
							goodChoice = true;
							break;
						default:
							System.err.println("Please enter 1, 2, Hit or Stay");
							break;
					}
				}
			}
		}
	}
}
