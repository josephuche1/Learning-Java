import java.util.Scanner;

public class PaintCalculator {
	
    public double length;
    public double width;
    public double height;
    
    
    public double calculateWallArea() {
    	double surfaceArea = (2*length*width) + (2*length*height)+ (2*height*width);
    	return surfaceArea;
    }
    
    public double calculateNumberOfGallons(double surfaceArea) {
    	double numOfGallons = surfaceArea / 350;
    	return numOfGallons;
    }
    
    public double priceCalculator(double numOfGallons) {
    	double totalPrice = 32 * numOfGallons;
    	return totalPrice;
    }
    
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		PaintCalculator p = new PaintCalculator();
		
		System.out.print("Enter the length of the room: ");
		p.length = keyboard.nextDouble();
		
		System.out.print("Enter the height of the room: ");
		p.height = keyboard.nextDouble();
		
		System.out.print("Enter the width of the room: ");
		p.width = keyboard.nextDouble();
		
		double wallArea = p.calculateWallArea();
		
		double numOfGallons = Math.round(p.calculateNumberOfGallons(wallArea));
		
		double totalPrice = p.priceCalculator(numOfGallons);
		
		System.out.println(", the cost to paint a "+p.length+"-by-"+p.width+" foot room with "+p.height+"-foot ceilings is $"+totalPrice);
		
		
	}

}
