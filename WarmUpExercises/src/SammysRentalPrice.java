/*
 * Name: Uche Joseph
 * Student ID: U221N1068*/
import java.util.Scanner;

public class SammysRentalPrice {

	public static void main(String[] args) {
		
		
        double perHourKayaksAndCanoes = 40;
        double perHourBeachChairAndUmbrella = 20;
        double totalPrice;
        double totalPriceHours = 0;
        double totalPriceMinutes = 0;
        int hours;
        int minutes;
        int option;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Chose the equipment to rent: ");
        System.out.println("1. Kayak/Canoe");
        System.out.println("2. Beach Chair/ Beach Umbrella");
        System.out.print("Enter option: ");
        option = keyboard.nextInt();
  
        System.out.println("How long:  ");
        System.out.println("Hours: ");
        hours = keyboard.nextInt();
        System.out.println("Minutes: ");
        minutes = keyboard.nextInt();
        while(minutes < 30 && hours == 0) {
        	System.out.print("Minutes cannot be less than: ");
        	minutes = keyboard.nextInt();
        }
        
        if(option == 1) {
        	totalPriceHours = hours * perHourKayaksAndCanoes;
        	if(minutes < 30) {
        		totalPriceMinutes = (minutes%30) * 1;
        		minutes -= minutes%30;
        		totalPriceMinutes += 0.5 * perHourKayaksAndCanoes;
        	}
        	else if(minutes == 30) {
        		totalPriceMinutes = 0.5 * perHourKayaksAndCanoes;
        	}
        }
        else if(option  == 2) {
        	totalPriceHours = hours * perHourBeachChairAndUmbrella;
        	if(minutes < 30) {
        		totalPriceMinutes = (minutes%30) * 0.55;
        		minutes -= minutes%30;
        		totalPriceMinutes += 0.5 * perHourBeachChairAndUmbrella;
        	}
        	else if(minutes == 30) {
        		totalPriceMinutes = 0.5 * perHourBeachChairAndUmbrella;
        	}
        }
        
        totalPrice = totalPriceHours + totalPriceMinutes;
        
        System.out.println("The total Price: "+totalPrice);
        keyboard.close();
	}

}
