
public class Cat {
	// TODO Create a constructor
    // TODO Add two instance methods of your choice
	public Cat() {
		System.out.println("I am Cat");
	}
	
	public void isSleeping() {
		System.out.println("Cat is sleeping");
	}
	
	public void speak() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.speak();
		myCat.isSleeping();
         
	}

}
