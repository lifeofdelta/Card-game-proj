import java.util.*;
/**
This class populate the card array with card objects hence forming a deck and it has functions like the riffle shuffle to shuffle the deck
*/


	public class Deck{
		
		private Card[] cards;

		

		public Deck(int k){
			this.cards = new Card[k];    //creates a deck with a given number
		}


		public Deck(){
			this.cards = new Card[52];          // creates a standard deck

			int idx = 0;

			for(int suit = 0;suit<=3;suit++){     //Populates the card array with card objects
				for (int rank=1;rank<=13 ;rank++ ) {
					cards[idx++] = new Card(rank,suit);
					}
				}
		}

		
		public Card[] Shuffle(){
												// RIFFLE SHUFFLE ALGORITHM


		Random rand = new Random();
		 int split =  20 + rand.nextInt(10) ; //randomly go through the middle of the this.cards

		 Card[] split_arr= new Card[split];
		 Card[] remainder_arr= new Card[this.cards.length-split];
		 Card[] finalarr = new Card[this.cards.length];		 
		 for(int i = 0; i<split_arr.length;i++)
		 {

		    split_arr[i] = this.cards[i];
		 }
		 


		 for(int k = 0;k<remainder_arr.length;k++)
		 {

		   remainder_arr[k] = this.cards[split++];
		 }



				int temp = 0;
				int temp_1 =0;
				int temp_2 =0;
				int take = 5;
				int take_2 = 5;


				for(int p = 0;p<7;p++){
				//System.out.println("        --------Number of Shuffle/s------    "+ p);
					while(temp < finalarr.length){

						int pickside = rand.nextInt(2);
					
						if(pickside ==0){
							
							if(split_arr.length - temp_1 < take){
								take = split_arr.length -temp_1;
							}
							
							if(take ==0){
								continue;
							}

							int	select = rand.nextInt(take);
							if(take == 1){
								select =1;
							}
							int i = temp_1;
							int idx =0;
							
							while(idx <select){
								this.cards[temp] = split_arr[i];
								i++;
								idx++;
								temp++;

							}
							temp_1+=select;


							
							}

						

						else {
						
						if(remainder_arr.length - temp_2<take_2){
							take_2 = remainder_arr.length - temp_2;
						}

						if(take_2==0){
							continue;
						}



						int select_2 = rand.nextInt(take_2);

						if (take_2==1){
							select_2 = 1;
						}
						
						int k = temp_2;
						int idx_2 =0;

						while (idx_2 < select_2){
							this.cards[temp] = remainder_arr[k];
							k++;
							idx_2++;
							temp++;
						}

						temp_2+=select_2;
						
						}

					}
				}
				return this.cards;
			}

	public int getCardvalue(int idx){
			return this.cards[idx].getValue();
		}

	public Card getCard(int idx2){
			return this.cards[idx2];
		}

	public String toString(){
			return Arrays.toString(this.cards);
		}

	}
	
