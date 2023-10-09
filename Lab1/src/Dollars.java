/*
 * Name: Uche Joseph
 * Student ID: U221N1068
 * TODO  A program that calculates and displays the conversion of an entered
number of dollars into currency denominations -- 20s, 10s, 5s, and 1s*/

import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int count20s = 0;
        int count10s = 0;
        int count5s = 0;
        int count1s = 0;
        
        System.out.print("Enter Amount: ");
        amount = keyboard.nextInt();
        
        while(amount != 0) {
        	if(amount >= 20) {
        		count20s++;
        		amount -= 20;
        	}
        	else if(amount >= 10) {
        		count10s++;
        		amount -= 10;
        	}
        	else if(amount >= 5) {
        		count5s++;
        		amount -= 5;
        	}
        	else {
        		count1s++;
        		amount--;
        	}
        }
        
        System.out.println("Amount: $"+amount);
        System.out.println("20s: "+count20s);
        System.out.println("10s: "+count10s);
        System.out.println("5s: "+count5s);
        System.out.println("1s: "+count1s);
        keyboard.close();
	}

}
