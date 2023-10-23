import java.util.Scanner;

public class DistanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double speed;
		int maxHours;
		int period = 0;
		
		double distance;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the vehicle's speed: ");
		speed = keyboard.nextDouble();
		
		while(speed < 0) {
			System.out.println("Enter 0 or greater for speed: ");
			speed = keyboard.nextDouble();
		}
		
		System.out.println("Enter max hours travelled: ");
		maxHours = keyboard.nextInt();
		
		while(maxHours < period) {
			System.out.println("Enter 1 or greater for max hours: ");
			maxHours = keyboard.nextInt();
		}
		Distance newDistance = new Distance(speed, maxHours);;
		distance = newDistance.getDistance();  
		
		System.out.println("Distance: "+distance);

	}

}
