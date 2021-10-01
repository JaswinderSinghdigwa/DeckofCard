
public class DeckOfCard {
 public static void main(String[] args) {
	 System.out.print("Welcom to Deck Of Crad");
	 String[] cardType = { "Clubs" , "Diamonds" , "Heart" ,"Spade"};
	 String[] cardNumber =  { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	 String[] cardArray = new String[52];
	 int start= 0,end =12 ,j1 =0;
	 
	 for (int i = 0;i < 4; i++) {
		 for (int j = start; j <= end;j++) {
			cardArray[j]= cardType[i] + " " + cardNumber[j1]; 
			System.out.println(cardArray[j]+"");
			j1++;
		 }
		 j1 = 0;
		 start = end+1;
		 end +=13;
	 }
	
}
}
