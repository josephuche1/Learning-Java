import java.util.Scanner;
public class TestHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String first, middle, last;
		
		System.out.print("Enter first name: ");
		first = console.next();
		System.out.print("Enter middle name: ");
		middle = console.next();
		System.out.print("Enter last name: ");
		last = console.next();
		
		Human  newHuman1 = new Human(first, last, middle);
		
		
		System.out.println("Human 1: ");
		System.out.println("First Name: " + newHuman1.getFirstName());
		System.out.println("Middle Name: "+ newHuman1.getMiddleName());
		System.out.println("Last Name: "+ newHuman1.getLastName());
		
		Human newHuman2 = new Human("Joseph", "Uche", "Ugo");
		Human newHuman3 = new Human(newHuman2);
		
		System.out.println("Human 3: ");
		System.out.println("First Name: " + newHuman3.getFirstName());
		System.out.println("Middle Name: "+ newHuman3.getMiddleName());
		System.out.println("Last Name: "+ newHuman3.getLastName());	
		
		
		/*
		 * 
		 * Enter first name: Olisa
         * Enter middle name: Akachukwu
         * Enter last name: Eric
         * Human 1: 
         * First Name: Olisa
         * Middle Name: Akachukwu
         * Last Name: Eric
         * Human 3: 
         * First Name: Joseph
         * Middle Name: Ugo
         * Last Name: Uche
*/
		
		
		console.close();
	}

}
