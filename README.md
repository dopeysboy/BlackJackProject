<a name="readme-top"></a>
<h1 align="center">BlackjackProject</h1>
<h2 align="center">Table of Contents</h2>
<ul>
    <li><a href="#readme-description">Description</a></li>
    <li><a href="#readme-built">Built With</a></li>
    <li><a href="#readme-learned">Things I learned</a></li>
    <li><a href="#readme-future">Next Time</a></li>
    <li><a href="#readme-note">Things of Note</a></li>
    <li><a href="#readme-contact">Contact me</a></li>
</ul>
<a name="readme-description"></a>
<h2 align="center">Description</h2>
<p>This application will simulate a game (or games) of blackjack. The main meat of the program is in BlackJackApp, where the game logic is located for if the player or dealer has blackjack, has bust, or if they tie.</p>
<p>The common package contains all of the information you would need to create any standard 52 card deck playing card game, such as poker or go fish.</p>
<ul>
	<li>Deck's constructor allows it to be created with multiple decks like you would inside a casino, but for this program is only built with one deck. It contains a list of type Card, and other helper functions like shuffle() and dealCard()</li>
	<li>Each Card is built with a Suit and a Rank (i.e. 4 of Diamonds)</li>
	<li>Hand is an abstract class that contains a list of type cards (similar to a deck) and other functions that will be used in every game that has a hand of cards</li> 
	<li>Table holds a List of Players, and a pot total of chips for betting purposes. It contains functionality to add players, eject players, and place and payout bets. Betting was not implemented in this application, but with some time could be implemented in a future patch.</li>
</ul>
<p>Inside of the blackjack.entities package contains all classes for the blackjack game.</p>
<ul>
	<li>BlackjackHand extends Hand and contains functionality to determine if an Ace is hard or soft and get the value of a hand</ul>
	<li>Player is the user (but was written in such a way that additional AI players could be created) and contains functions for adding cards, hitting, and functionality for betting. The Player constructor takes Betting is unseen by the user, but could be implemented given more time</li>
	<li>Dealer extends the Player class and is used to deal out hands to the Player and them self. The logic for the dealer is within the BlackJackApp class</li>
</ul>
<p>The BlackJackApp is the meat and potatoes of this application, containing the game logic, dealer logic, and menus. After the player has decided they are done hitting, the dealer will hit until they have a hand value of 17 or greater. After the dealer is done hitting, if no one has bust or gotten blackjack, it will compare the two hand values of dealer and player and determine a winner</p>
<p align="right">(<a href="#readme-top">back to top</a>)</p>
<a name="readme-built"></a>
<h2 align="center">Built With</h2>
<p>This application was built with java and git</p>
<a name="readme-learned"></a>
<h2 align="center">Things learned</h2>
<p>I learned that because System.err uses a separate bitstream from System.out, if you do not System.flush(), there is a possibility that System.err (which was used for displaying you lose messages) will display before System.out lines. This was a bug that bothered me for a couple of hours</p>
<p align="right">(<a href="#readme-top">back to top</a>)</p>
<a name="readme-future"></a>
<h2 align="center">Things to do next time</h2>
<p>Given more time with this application, I would have liked to fully implement betting and implement a few AI (one that makes the optimal move and one that plays at random)</p>
<p align="right">(<a href="#readme-top">back to top</a>)</p>
<a name="readme-note"></a>
<h2 align="center">Things of Note</h2>
<p>Something that feels off to me, but I was unsure how to do better was passing a Dealer to the Player as it was created. It feels weird, but it was the only way I could think of to make sure the player could get a card.</p>
<p align="right">(<a href="#readme-top">back to top</a>)</p>
<a name="readme-contact"></a>
<h2 align="center">Contact me</h2>
<p>You can contact me at:</p>
	<ul>
		<li>github: github.com/dopeysboy</li>
		<li>email: tyler.j.tanner@gmail.com</li>
	</ul>
<p align="right">(<a href="#readme-top">back to top</a>)</p>
