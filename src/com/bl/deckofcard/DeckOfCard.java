	/******************************************************************************
	 *  Purpose: Program is written for shuffle and distribute card of deck
	 *
	 *  @author  Jaswinder Singh
	 *  @version 1.0
	 *  @since   01-10-2020
	 *
	 ******************************************************************************/
	package com.bl.deckofcard;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCard {
	    public static final Scanner scanner = new Scanner(System.in);

		 String[] suit = { "Clubs" , "Diamonds" , "Heart" ,"Spade"};
		 String[] rank =  { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		 public static int player;
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
		 
		 /**
			 * Purpose: Display the card of deck
			 * 
			 * @param //Displaying cards and rank ,suit 
			 */
		 
		 public void printCard() {
		
			  for (int i =0;i<cards.length;i++) //loop to print all the element of ArrayList
			  {
				  System.out.println(cards[i]+"");
			  }
		
		 }
		 
		 /**
			 * Purpose: Number of Player
			 * 
			 * @param function player should be in between 2 to 4
			 */
		 
		    public void players() {
		    	System.out.print("Enter players should be minimum 2 , maximum 4 : ");
		        player = scanner.nextInt();
		        if (player >= 2 && player <= 4) {
		            System.out.println(player + " players will play the game");
		        } 
		        
		    }
		    
		    public void sequenceOfPlayers(int players) {
		        System.out.println("\nSequence of cards are below : ");
		        for (int i = 1; i <= players; i++) {
		            System.out.println("\nPlayer " + i + " Getting card.............");
		        }
		    }
		    
		    /**
			 * Purpose: shuffles the card of deck
			 * 
			 * @param arr array of cards
			 * swaping of cards
			 */
		    
		    public  void shuffleCardsDeck() {
		    	Random random = new Random();
				int temp1, temp2;
				String temp;
				for (int i = 0; i < 52; i++) {
					temp1 = random.nextInt(51);
					temp2 = random.nextInt(51);
					if (temp1 != temp2) {
						temp = cards[temp1];
						cards[temp1] = cards[temp2];
						cards[temp2] = temp;
					}
				}
			}
		    
		    public void cardDisturbtion(int players) {
		    	int count = 0;
		    	for (int i = 0; i < players; i++) {
					System.out.print("For Player " + i + ": \n");
					for (int j = 0; j < 9; j++) {
	
						System.out.print(cards[count] + "-->");
						count++;
					}
					System.out.println();
			}
	}
}