package com.bl.deckofcard;

public class DeckofCardMain {
	public static void main(String[] args) {
		DeckOfCard deckofcard = new DeckOfCard();
		System.out.print("Welcom to Deck Of Crad");
		deckofcard.DeckofcardGame();
		deckofcard.printCard();
		deckofcard.players();
		deckofcard.sequenceOfPlayers(deckofcard.player);
	}
}