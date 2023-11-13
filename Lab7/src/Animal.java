
public class Animal {
  private String name;
  public Animal(String name) {
	  this.name = name;
	  System.out.println("I am the Animal class");
  }
  
  
  
  public String method_Animal(String w) {
	  return "String";
  }
  
  public boolean method_Animal(boolean b) {
	  return true;
  }
  
  public void method_Animal() {
	   System.out.println("I am the method that is void");
  }
  
  public String getclassName() {
	  return this.name;
  }
  
  public String toString() {
	  return this.getclassName()+" class";
  }
}
