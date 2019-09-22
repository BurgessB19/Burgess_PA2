import java.util.Scanner;

public class Burgess_P3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			int numRespond;
			double sum;
			double avg; 
			double highTotal;
			double lowTotal;
			String highTop;
			String lowTop;
			
			System.out.println ("How many responded to the poll?");
			numRespond = scnr.nextInt();
			
			if (numRespond > 10) {
				while (numRespond > 10) {
				System.out.println("Too many responders. Enter a number less than or equal to 10");
				numRespond = scnr.nextInt();
				}
			}
			
			int[][] resArray = new int[5][10];
			int x;
			int z;
			String[] topics = {"Video Games","Sports","Leisure","Entertainment","Technology"}; 
			
			
			System.out.println("Rate importance of topic (1-10)\n" );
			for (x = 0; x < numRespond; ++x) {
				
				System.out.println ("Person number " + (x + 1) + " please rate.\n");
				for (z = 0; z < 5; ++z) { 
					System.out.println(topics[z] + ": ");
					resArray[z][x] = scnr.nextInt();
						if((resArray[z][x]<0) || (resArray[z][x]>10)) {
							while ((resArray[z][x]<0) || (resArray[z][x]>10)) {
							System.out.println("Not within rating range. Please enter again");
							resArray[z][x] = scnr.nextInt();
							}
						}
						
				}
				System.out.println();
			}
			System.out.println("\n");
			System.out.print("Responder:\t");
			for (x = 0; x < numRespond; ++x) {
				
				System.out.print((x + 1) +"\t");
			}
			System.out.print("Avg Rate\t");
			
				for (z = 0; z < 5; ++z) {
					sum = 0;
					avg = 0;
					System.out.println();
					System.out.print(topics[z]+ ": \t");
					for (x = 0; x < numRespond; ++x) {
						
					System.out.print(resArray[z][x]+ " \t");
					sum = sum +resArray[z][x];
					
					avg = sum / numRespond;
					}
					
					System.out.printf(" %.1f ", avg);
					System.out.print("\t\t");
			
					
				}
										
			double sum2 = 0;
			highTop = "top";
			lowTop = "low";
			highTotal = 0;
			lowTotal = 101;
			for (z = 0; z < 5; ++z) {
				 sum2 =0;
				 for (x = 0; x < numRespond; ++x){
						sum2 = sum2 + resArray[z][x];	
				 	}
				 
				 if (sum2 > highTotal) {
						highTotal = sum2;
						highTop = topics[z];
					} 
				if (sum2 < lowTotal) {
						lowTotal = sum2;
						lowTop = topics[z];
					}
			 	}
			 
			 	System.out.println("\n\nHighest point total: " + highTop + "\t" + highTotal);
				System.out.println("\nLowest point total: " + lowTop + "\t\t" + lowTotal);					
				scnr.close();	
	}

}
