/*
 * Name: Uche Joseph
 * Student ID: U221N1068
 * TODO A program that displays a conversion table of gallons to liters*/
public class GalToLitTable {

	public static void main(String[] args) {
		double gallons, liters;
		int counter;
		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons+ " gallons is "+ liters+" liters.");
			counter++;
			
			// every 10th line, print a blank line
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}

	}

}
