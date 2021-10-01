package com.bl.main;

import com.bl.deckofcard.DeckOfCard;

public class main {
	public main() {
		DeckOfCard deck = new DeckOfCard();
		System.out.print("Welcom to Deck Of Crad");
		deck.rank();
		deck.print();
	}
}
