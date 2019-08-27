public class deck
{
	public static void main(String[] args)
	{
	String[] deck = new String[52];
	String[] suits = {"Clubs", "Diamonds","hearts","Spades"};
	String[] Ranks = {"Ace", "2", "3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
	
	
   for(int i = 0;i<deck.length;)
   for(int k = 0; k<suits.length;k++)
   for(int j = 0; j<Ranks.length;j++)
   {
      
			deck[i] = suits[k] +" "+ Ranks[j];
			System.out.println(deck[i]);
			i++;

	}
  }	
}
//Guys i just created a deck of cards, that doesnt have jokers, you can run the code to check how it works.