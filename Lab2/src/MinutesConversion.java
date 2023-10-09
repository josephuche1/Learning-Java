import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double minutes;
		
		System.out.print("Enter the number of minutes: ");
		minutes = keyboard.nextDouble();
		
		double minutesToHours = minutes/60;
		double minutesToDays = minutes/1440;
		
		System.out.println(minutes+" minutes equals " +minutesToHours+" hours and equals "+minutesToDays+" days.");
		
		keyboard.close();
	}

}
