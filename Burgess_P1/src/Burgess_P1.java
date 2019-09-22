
import java.util.Scanner;

public class Burgess_P1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput;
		int num1;
		int num2;
		int num3;
		int num4;
		int temp1;
		int temp2;
		
		System.out.println("Enter 4 digit number: ");
		userInput = scnr.nextInt();
				
		
		//Get individual Numbers
		num1 = userInput / 1000;
		num2 = (userInput / 100) % 10;
		num3 = (userInput / 10) % 10;
		num4 = userInput % 10;
		
		
		//Encrypt
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		//Swap
		temp1 = num1;
		num1 = num3;
		num3 = temp1;
		
		temp2 = num2;
		num2 = num4;
		num4 = temp2;
		
		//New number
		System.out.println(num1 + "" + num2 + "" + num3 + "" + num4 + "\n");
	
	
		
		
		System.out.println("Enter encrypted number:");
		userInput = scnr.nextInt();
		
		
		
		//Get individual numbers
		num1 = userInput / 1000;
		num2 = (userInput / 100) % 10;
		num3 = (userInput / 10) % 10;
		num4 = userInput % 10;
		
		
		//Swap
		temp1 = num1;
		num1 = num3;
		num3 = temp1;
		
		temp2 = num2;
		num2 = num4;
		num4 = temp2;
		
		//Decrypt
		num1 = (num1 + 10 - 7) % 10;
		num2 = (num2 + 10 - 7) % 10;
		num3 = (num3 + 10 - 7) % 10;
		num4 = (num4 + 10 - 7) % 10;
		
		//Original number
		System.out.println(num1 + "" + num2 + "" + num3 + "" + num4);
		
		
			scnr.close();
	}}



