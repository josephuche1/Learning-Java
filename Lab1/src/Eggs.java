/*
 * Name: Uche Joseph
 * Student ID: U221N1068
 * TODO A program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation*/

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        double perDozen = 3.25;
        double perEgg = 0.45;
        int numOfEggs;
        
        System.out.print("Please enter the number of eggs to order: ");
        numOfEggs = keyboard.nextInt();
        
        int looseEggs = numOfEggs % 12;
        int dozens = (numOfEggs - looseEggs) / 12;
        
        double costPerEgg = looseEggs * perEgg;
        double costPerDozen = dozens * perDozen;
        double total = costPerEgg + costPerDozen;
        
        System.out.println("You have ordered "+numOfEggs+". That's "+dozens+" dozen at $"+perDozen+
        		" per dozen and "+looseEggs+" loose eggs at $"+perEgg+" each for a total of $"+total+".");
        
	}

}
