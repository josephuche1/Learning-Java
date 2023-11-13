
public class Animal {
  private String name = "Animal";
  public Animal() {
	  System.out.println("I am the Animal class");
  }
  public String method_Animal(String w) {
    System.out.println("String in Animal");
	  return w;
  }
  
  public boolean method_Animal(boolean b) {
    System.out.println("Boolean in Animal");
	  return true;
  }
  
  public void method_Animal() {
	   System.out.println("Void in Animal");
  }
  
  public String getclassName() {
	  return this.name;
  }
  
  public String toString() {
	  return this.getclassName()+" class";
  }
}
