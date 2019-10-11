import java.util.*;
public class Deal{
	private ArrayList<Card> LeftInDeck;
	private ArrayList<List<Card>> piles;

	public Deal(){
		this.LeftInDeck = new ArrayList<Card>(); 
		this.piles = new ArrayList<List<Card>>(); // creating an array within an array (2d array list) to house the piles
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (List<Card> s : this.piles)
		{
		    sb.append(s);
		    sb.append("\t");
		}

		return(sb.toString());
		
	}

	
/**
	public String toString(){
	StringBuilder sj = new StringBuilder();
		for (Card p : this.LeftInDeck)
		{
		    sj.append(p);
		    sj.append("\t");
		}

		return(sj.toString());

	}

*/

	public ArrayList<List<Card>> Deal(Card[] ShuffledDeck){

		for(int l = 0; l< 8;l++)
		{
		this.piles.add(new ArrayList<Card>()); 	//instantiate all columns of 2d array with arrays inside them
		}

		

		int i = 0;
		for (int j = 0; j< 7; j++){
			for(int k = 0; k<j+1; k++){ 
				this.piles.get(j).add(ShuffledDeck[i++]);
			}
		}
		
		for(int s = 7;s<8;s++){
			this.piles.get(s).add(new Card(0,0));
		
		}

		
		while(i< ShuffledDeck.length) 
		{
			this.LeftInDeck.add(ShuffledDeck[i++]);
		}


		return this.piles;


	}
	public ArrayList<Card> getLeftdeck(){
		return this.LeftInDeck;
	}
}

	
	