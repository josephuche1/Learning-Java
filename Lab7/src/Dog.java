
public class Dog extends Animal{
    public Dog(String name) {
		super(name);
	}
	public void bark() {
    	System.out.println("Barking");
    }
    public String bark(String i) {
    	System.out.println("Howling");
    	return i;
    }
    public int bark(int i) {
    	System.out.println("Whining");
    	return i;
    }
    
    public void method_Animal() {
 	   System.out.println("I am the method that is void in Dog class");
   }
   
    public String method_Animal(String w) {
  	  return "String in Dog class";
    }
}
