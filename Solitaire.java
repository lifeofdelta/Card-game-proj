import java.util.*;

public class Solitaire{
	public static void main(String[]args){
	Deck mydeck = new Deck();
	Card[] ShuffledDeck = mydeck.Shuffle();
	ArrayList<List<String>> ShuffledDeckDisplay = new ArrayList<List<String>>();
	ArrayList<String> LeftDeckDisplay = new ArrayList<String>();
	

	
	/**for(int i = 0; i< ShuffledDeck.length;i++){
		ShuffledDeckDisplay.get() ShuffledDeck[i].toString();
	}
		*/

	//System.out.println(Arrays.toString(ShuffledDeck));   //This converts the Array to a String when its bring printed out as printing an array only shows a code of characters of elements in memory
	
	Deal setTable = new Deal();

	ArrayList<List<Card>> Table = setTable.Deal(ShuffledDeck); //This deals out 7 piles onto the table
	
	//System.out.println(Table.size());




	for(int a = 0;a <8;a++){
		ShuffledDeckDisplay.add(new ArrayList<String>());
	}

	int n =0;
	int j_2=0;
	for (int j = 0; j< 7; j++)
	{
		for(int k = 0; k< j+1; k++)
		{ 
			if(k == j)
			{
				ShuffledDeckDisplay.get(j).add(ShuffledDeck[n].toString());
			}
			else
			{
				ShuffledDeckDisplay.get(j).add("***");	
			}
			n++;
		}
		j_2 = j;
	}
	//creating the Suit piles
	ShuffledDeckDisplay.get(7).add("ACE foundation");
	// ShuffledDeckDisplay.get(8).add("ACE foundation");
	// ShuffledDeckDisplay.get(9).add("ACE foundation");
	// ShuffledDeckDisplay.get(10).add("ACE foundation");


	System.out.println("							------------------WELCOME TO SOLITAIRE ---------------------");
	Scanner in = new Scanner(System.in);
	System.out.println("Do you want to read the rules of the game   <y> for yes, anthing else for no");
	String option = in.nextLine();
	if(option.equals("y")){
		System.out.println("In Solitaire Klondike, the goal is to create a stack of cards from low to high, in the foundation at the bottom. Each pile can contain only one suit\n");

	}
	else{
		;
	}

	ArrayList<Card> LeftDeck = setTable.getLeftdeck();
	System.out.println(LeftDeck);
	System.out.println();

	int p =0;
	for(int l = 0;l<8;l++)
	{
		System.out.print(ShuffledDeckDisplay.get(l));
		System.out.println();
		System.out.println();

	}
		

	for(int i = 0;i<8;i++){
		Card topCardPiles = Table.get(i).get((Table.get(i).size())-1);  //gets the top card of each piles 
		topCardPiles.flip();
	}


	//System.out.println(Table);
	GameMech(Table,ShuffledDeckDisplay,LeftDeck);

	}


	public static void GameMech(ArrayList<List<Card>> Table, ArrayList<List<String>> ShuffledDeckDisplay,ArrayList<Card> LeftDeck){
		Scanner in = new Scanner(System.in);
		boolean win = false;
		//System.out.println("Do you want to access the Dicard deck or the seven piles, <D> for deck and <P> for piles");
		//String option = in.nextLine();
		while(win != true)
		{
		System.out.println("\nWhich pile do you want to access?");
		int access = in.nextInt()-1;					//Minus one so that we dont have to start counting from 0 but 1 instead
		System.out.println("Which pile do you want to move it to?");
		int move = in.nextInt()-1;
		
		Card topCard = Table.get(access).get((Table.get(access).size())-1); //this gets the top card of the pile you want to access
		String topCardDisplay = ShuffledDeckDisplay.get(access).get((ShuffledDeckDisplay.get(access).size())-1);
		Card topCard_movepile = Table.get(move).get((Table.get(move).size())-1); //this gets the top card of the pile you want to move to
		
		

			if(move>6 && topCard_movepile.getSuitValue() == Table.get(move).get(Table.get(move).size()-1).getSuitValue()){

			Table.get(access).remove((Table.get(access).size())-1);
					Table.get(move).add(topCard);
				

					// now display the movement for the card on ShuffledDeckDisplay,and 
					ShuffledDeckDisplay.get(access).remove((ShuffledDeckDisplay.get(access).size())-1);
					ShuffledDeckDisplay.get(move).add(topCardDisplay);

				System.out.println(LeftDeck);
					
				for(int l = 0;l<9;l++){
					System.out.print(ShuffledDeckDisplay.get(l));
					System.out.println();
					System.out.println();

				}
			
			
			//System.out.println(Table);
		}

		
			
		else if(((topCard.getSuitValue() < 2 && topCard_movepile.getSuitValue() >1) || (topCard.getSuitValue() > 1 && topCard_movepile.getSuitValue() <2) ) && (topCard.getRankValue() == topCard_movepile.getRankValue()-1)  ) // THIS IF STATEMENTS ALLOW US TO MOVE A CARD INTO A DECK OF A DIFFERENT COLOR AND A RANK LESS THAN THE CARD
			{
				
					Table.get(access).remove((Table.get(access).size())-1);
					Table.get(move).add(topCard);
					//Table.get(access).get((Table.get(access).size())-1).flip();//now the card under that was 2nd last is last therefor becoming face up
				
				

					// now display the movement for the card on ShuffledDeckDisplay,and 
					ShuffledDeckDisplay.get(access).remove((ShuffledDeckDisplay.get(access).size())-1);
					ShuffledDeckDisplay.get(move).add(topCardDisplay);

					// now we must change *** value to the the card that it was hiding

					ShuffledDeckDisplay.get(access).set((ShuffledDeckDisplay.get(access).size())-1,(Table.get(access).get((Table.get(access).size())-1)).toString()); //
				
				System.out.println(LeftDeck);

				for(int l = 0;l<9;l++){
					System.out.print(ShuffledDeckDisplay.get(l));
					System.out.println();
					System.out.println();

				}
			}
			
			else{
				System.out.println("MOVE NOT PERMITTED");

				
				



			}

		
		if((Table.get(8).get((Table.get(8).size())-1)).getRankValue()==13){
			win = true;
			break;

		}

		}

			//System.out.println(Table);
		}
	}


			

	
	
	


		
		


			
		
	

