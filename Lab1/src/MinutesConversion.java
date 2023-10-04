/*
 * Name: Uche Joseph
 * Student ID: U221N1068
 * TODO  A program that calculates and displays the conversion of an entered
number of dollars into currency denominations -- 20s, 10s, 5s, and 1s*/

import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double minutes;
		
		System.out.print("Enter the number of minutes: ");
		minutes = keyboard.nextDouble();
		
		double minutesToHours = minutes/60;
		double minutesToDays = minutes/1440;
		
		System.out.println(minutes+" minutes equals " +minutesToHours+" hours and equals "+minutesToDays+" days.");
		

	}

}
