import java.util.Scanner;

public class  Burgess_P2{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			double weightPnd;
			double heightIn;
			double weightKilo;
			double heightM;
			double BMI = 0;
			int loop = 0;
			String table[] = {"Underweight", "Normal", "Overweight", "Obesity"};
			String range[] = {"Below 18.5", "18.5-24.9", "25.0-29.9", "30.0 and Above"};
			String measure;
			
		
			
		while (loop == 0) {
			System.out.println("Type US Customary or Metric System");
			measure = scnr.nextLine();
			measure = measure.toLowerCase();
			//System.out.println(measure);
			
			if (measure.contentEquals("us customary") || measure.contentEquals("customary")) {
				System.out.println("Enter weight(pounds):");
				weightPnd = scnr.nextDouble();
				
				System.out.println ("Enter height(inches):");
				heightIn = scnr.nextDouble();
				
				//doubSystem.out.println(weightPnd + " " + heightIn);
				BMI = (weightPnd * 703) / (Math.pow(heightIn, 2.0));
				System.out.printf("BMI = %.1f", BMI);
				System.out.println();
				loop = 1;
			}
			else if (measure.contentEquals("metric system") || measure.contentEquals("metric")) {
				System.out.println("Enter weight(kilos):");
				weightKilo = scnr.nextDouble();
				
				System.out.println ("Enter height(meters):");
				heightM = scnr.nextDouble();
				
				//System.out.println(weightKilo + " " + heightM);
				BMI = weightKilo / (Math.pow(heightM, 2.0));
				System.out.printf("BMI = %.1f", BMI);
				System.out.println("\n\n");
				loop = 1;
			}
			else {
				System.out.println("Not a valid measurement system");
				loop = 0;
			}
						
			
		}
		if (BMI == 0) {
			System.out.println("Weightless");
		}
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI < 25.0) {
			System.out.println("Normal");
		}
		else if (BMI < 30.0) {
			System.out.println("Overweight");
		}
		else if (BMI > 29.9) {
			System.out.println("Obesity");
		}
		
		
		
		System.out.println("\n\n");
		System.out.println("\t\t\t BMI");
		if (table[0] == "Underweight") {
			System.out.println(table[0] + "\t\t" + range[0]);
		}
		if (table[1] == "Normal") {
			System.out.println(table[1] + "\t\t\t" + range[1]);
		}
		if (table[2] == "Overweight") {
			System.out.println(table[2] + "\t\t" + range[2]);
		}
		if (table[3] == "Obesity") {
			System.out.println(table[3] + "\t\t\t" + range[3]);
		}
		scnr.close();	
	}

}
