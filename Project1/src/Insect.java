
public abstract class Insect {
   private String name;
   private int legs;
   private boolean canFly;
   protected String habitat;
   protected boolean isNocturnal;
   
   // Constructors
   public Insect(String name, int legs, boolean canFly, boolean isNocturnal, String habitat) {
       this.name = name;
       this.legs = legs;
       this.canFly = canFly;
   }
   
   public void setName(String name) {
	   this.name =name;
   }
   public void  setLegs(int legs) {
	   this.legs =legs;
   }
   public void setCanFly(boolean canFly) {
	   this.canFly = canFly;
   }
   
   public String getName() {
	   return this.name;
   }
   public int getLegs() {
	   return this.legs;
   }
   public boolean canFly() {
	   return this.canFly;
   }


   // Abstract methods
   abstract void makeSound();
   abstract void reproduce();
   abstract void eat();

   // Instance method
   public void sleep() {
       System.out.println(name + " is sleeping.");
   }

}
