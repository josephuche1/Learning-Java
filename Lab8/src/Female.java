import java.util.Scanner;
public class Female extends Child{
	
   private static Scanner keyboard = new Scanner(System.in);
   public Female(String name) {
	   super(name, "Female");
	   System.out.println("Enter the child's age: ");
	   int num = keyboard.nextInt();
	   this.setAge(num);
   }
   
   public void setAge(int age) {
	   this.age = age;
   }
   public void display() {
	   System.out.println(this.name+", "+this.age+", "+this.gender);
   }
   
   
}
