
public abstract class Child {
   public String name;
   public String gender;
   public int age;
   
   // constructor
   public Child(String name, String gender){
	   this.name = name;
	   this.gender = gender;
   }
   

   abstract void setAge(int age);
   abstract void display();
}
