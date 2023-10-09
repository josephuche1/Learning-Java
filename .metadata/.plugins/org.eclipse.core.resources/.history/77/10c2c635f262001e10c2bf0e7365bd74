/*
 * Name: Uche Joseph
 * Student ID: U221N1068
 * TODO A program that accepts the number of each type of meal ordered and display the total money collected for adult meals, 
 * children’s meals, and all meals*/

import java.util.Scanner;

public class ChiliToGo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int adultMeal;
		int childMeal;
		double adultMealPrice = 7;
		double childMealPrice = 4;
		
		//Exercise 3
		System.out.print("Enter the number of Adult meals: ");
		adultMeal = keyboard.nextInt();
		System.out.print("Enter the number of Child meals: ");
		childMeal = keyboard.nextInt();
		
		double adultMealTotalPrice = adultMeal * adultMealPrice;
		double childMealTotalPrice = childMeal * childMealPrice;
		double total = adultMealTotalPrice + childMealTotalPrice;
		
		System.out.println("Total gotten from Adult Meals: $"+adultMealTotalPrice);
		System.out.println("Total gotten from Child Meals: $"+childMealTotalPrice);
		System.out.println("Total gotten from all meals: $"+total);
		
		//Exercise 4
		double costOfProductionAdult = 4.35;
		double costOfProductionChild = 3.10;
		
		double totalProductionCostAdult = costOfProductionAdult * adultMeal;
		double totalProductionCostChild = costOfProductionChild * childMeal;
		double totalProductionCost = totalProductionCostAdult + totalProductionCostChild;
		
		double profit = total - totalProductionCost;
		
		System.out.println("Total Profit: $"+profit);
	}

}
