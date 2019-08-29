import java.util.Scanner;
import java.util.Random;    
public class Deck
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
			//System.out.println(deck[i]);
			i++;
		}
	
		Scanner myObj = new Scanner(System.in); // asking user to shuffle cards
		System.out.println("would you like to shuffle deck? yes/no");
		String shuffle = myObj.nextLine();
		String[] shuffledDeck = {"not shuffled"};
		if (shuffle.equals("yes"))
		{
			 shuffledDeck = doShuffle(deck);
		}
		else if (shuffle.equals("no"))
		{
			System.out.println("no shuffling");
		}
		else
		{
			System.out.println("type \"yes\" or \"no\"");
		}
		for(int l = 0;l< shuffledDeck.length; l++)
		{
			System.out.println(shuffledDeck[l]);
		}
	}
	
	public static String[] doShuffle(String[] preShuf)
	{
		Random rnd = new Random();
		for (int i = preShuf.length-1;i >0;i--)
		{
			int index = rnd.nextInt(i+1);//randomly selecting an index to switch
			//simple swap
			String a = preShuf[index];
			preShuf[index] = preShuf[i];
			preShuf[index] = a;
		}
		return preShuf;
	}
}