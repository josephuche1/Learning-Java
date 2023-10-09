import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x, y, z, result;
		
		System.out.print("Enter the first number: ");
		x = keyboard.nextInt();
		System.out.print("Enter the second number: ");
        y = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        z = keyboard.nextInt();
        result = x * y *z;
        
        System.out.printf("Product is " + result);
	}

}
