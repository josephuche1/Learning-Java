
public class Vehicle {
   private int numOfWheels;
   private int aveNumOfMilesPerGallon;
   
   public Vehicle(int number, int average) {
	   this.numOfWheels = number;
	   this.aveNumOfMilesPerGallon = average;
   }
   
   public String toString() {
	   return "Number of wheels: "+this.numOfWheels+". Average number of miles per gallon: "+this.aveNumOfMilesPerGallon+".";
   }
}
