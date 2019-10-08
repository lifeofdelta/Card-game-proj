import java.util.*;

public class Shuffle{

	public static void main(String[] args){
		Riffle();
		//shannonEntropy(finalarr);
	}




	public static void Riffle(){
		int[] deck = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

		Random rand = new Random();
 int split =  20 + rand.nextInt(10) ; //randomly go through the middle of the deck

 int[] split_arr= new int[split];
 int[] remainder_arr= new int[deck.length-split];
 int[] finalarr = new int[deck.length];

 System.out.println("split     ->    " + split);
 
 for(int i = 0; i<split_arr.length;i++)
 {

    split_arr[i] = deck[i];
    System.out.println(split_arr[i] + "     ->        this is the first half");
 }
 


 for(int k = 0;k<remainder_arr.length;k++)
 {

   remainder_arr[k] = deck[split++];
   System.out.println(remainder_arr[k] + "     ->        this is the second half");
 }

 System.out.println("cardCount     ->    " + (split-1));

		int temp = 0;
		int temp_1 =0;
		int temp_2 =0;
		int take = 5;
		int take_2 = 5;

		System.out.println(split_arr.length);
		System.out.println(remainder_arr.length);
		System.out.println();

		for(int p = 0;p<7;p++){
		System.out.println("        --------Number of Shuffle/s------    "+ p);
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
						finalarr[temp] = split_arr[i];
						System.out.println(finalarr[temp]);
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
				//System.out.println("select is: " +select_2);

				if (take_2==1){
					select_2 = 1;
				}
				
				int k = temp_2;
				int idx_2 =0;

				while (idx_2 < select_2){
					finalarr[temp] = remainder_arr[k];
					//System.out.println("take_2 is: " +take_2);
					//System.out.println("Index of remainder_arr   " + k);
					//System.out.println("Index of finalarr "+ temp);
					System.out.println(finalarr[temp]);
					k++;
					idx_2++;
					temp++;
				}

				temp_2+=select_2;
				
				}

			}
		}
		}
	
	
}


	
		
	



		