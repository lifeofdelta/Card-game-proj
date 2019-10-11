import java.util.*;
import java.awt.*;

	public class Card{
		public final static int width = 50;
		public final static int height = 70;
		public final static int heart = 0;
		public final static int spade =1;
		public final static int diamond = 2;
		public final static int club = 3;

		private int suit;
		private int rank;
		private int value;
		private boolean faceup;

	

	public Card(int rank, int suit){
		this.rank =rank;
		this.suit = suit;
		this.faceup = false;
	}

	public boolean faceup(){
		return this.faceup;
	}

	public boolean flip(){
		this.faceup = !(this.faceup);
		return this.faceup;
	}

	public String toString(){
		String[] ranks = {null, "Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Clubs", "Spades", "Diamonds","Hearts"};

		return (ranks[this.rank] + "  of  " + suits[this.suit]);
	}

	public int getValue(){
		int[] value_ranks = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] value_suits = {0,1,2,3};
		int red = 0;
		int black = 1;


		return value_ranks[this.rank] + value_suits[this.suit] ;
	}
	public int getSuitValue(){
		int[] value_suit = {0,1,2,3};

		return value_suit[this.suit];
	}

	public int getRankValue(){
		int[] value_ranks = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};

		return value_ranks[this.rank];
	}

	public String getCard(){
		String[] ranks = {null, "Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Clubs", "Spades", "Diamonds","Hearts"};
		return ranks[this.rank]  + " of " + suits[this.suit];
	}



	public int getSuit(){
		return this.suit;
	}

	public int getRank(){
		return this.rank;
	}

}