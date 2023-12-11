import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in); 
        int size;
        
        
        try {
        	System.out.print("Enter an Array size: ");
            size = keyboard.nextInt();
        	int[] numbers = new int[size];
        } catch(NegativeArraySizeException err) {
        	System.out.println("Array size must be a positive number");
        } catch(ArrayIndexOutOfBoundsException err) {
        	System.out.println("array out of bounds");
        } catch(InputMismatchException err) {
        	System.out.println("You entered the wrong input type");
        }
   
	}

}
