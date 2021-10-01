/******************************************************************************
 *  Purpose: Program is written for shuffle and distribute card of deck
 *
 *  @author  Jaswinder Singh
 *  @version 1.0
 *  @since   01-10-2020
 *
 ******************************************************************************/
package com.bl.deckofcard;

public class DeckOfCard {
	 String[] cardType = { "Clubs" , "Diamonds" , "Heart" ,"Spade"};
	 String[] cardNumber =  { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	 String[] cardArray = new String[52];
	 int start= 0,end =12 ,j1 =0;
	 
	 public void rank() {
	 for (int i = 0;i < 4; i++) {
		 for (int j = start; j <= end;j++) {
			cardArray[j]= cardType[i] + " " + cardNumber[j1]; 
			j1++;
		 }
		 j1 = 0;
		 start = end+1;
		 end +=13;
	 	}
	 }
	 
	  public void print() {
	
		  for (int i =0;i<cardArray.length;i++) {
			  System.out.println(cardArray[i]+"");
		  }
	
	  }
}
