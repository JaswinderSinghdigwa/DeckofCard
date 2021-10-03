	/******************************************************************************
	 *  Purpose: Program is written for shuffle and distribute card of deck
	 *
	 *  @author  Jaswinder Singh
	 *  @version 1.0
	 *  @since   01-10-2020
	 *
	 ******************************************************************************/
	package com.bl.deckofcard;

import java.util.Scanner;

public class DeckOfCard {
	    public static final Scanner scanner = new Scanner(System.in);

		 String[] suit = { "Clubs" , "Diamonds" , "Heart" ,"Spade"};
		 String[] rank =  { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		 
		 //initialized the size of cards
		 String[] cards = new String[52];
		 private int start= 0,end =12 ,count =0;
		 
		 // creating the quiuness of cards
		 public void DeckofcardGame() {
		 for (int i = 0;i < 4; i++) {
			 for (int j = start; j <= end;j++) {
				cards[j]= suit[i] + " " + rank[count]; 
				count++;
			 }
			 count = 0;
			 start = end+1;
			 end +=13;
		 	}
		}
		 
		 //Displaying cards and rank ,suit 
		 public void printCard() {
		
			  for (int i =0;i<cards.length;i++) //loop to print all the element of ArrayList
			  {
				  System.out.println(cards[i]+"");
			  }
		
		 }
		 //function player should be in between 2 to 4
		    public void players() {
		        System.out.print("Enter players should be minimum 2 , maximum 4 : ");
		        int player = scanner.nextInt();
		        if (player >= 2 && player <= 4) {
		            System.out.println(player + " players will play the game");
		        } 
		 
		    }
	}
