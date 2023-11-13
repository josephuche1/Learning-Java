
public class Dog extends Animal{
  private String name = "Dog";

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
 	   System.out.println("I am Void in Dog class");
   }
   
    public String method_Animal(String w) {
      System.out.println("String in Dog class");
  	  return w;
    }

    public String getClassName(){
         return this.name;
    }

    public String toString() {
      return this.getclassName()+" class";
    }
}
