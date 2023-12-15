
public abstract class BubbleBee extends Insect {
	   protected int honeyLevel;
	   protected boolean hasStinger;
	   protected int pollinationCapacity;
	   protected double wingSize;
	   
	   // Constructors
	   public BubbleBee(int honeyLevel, boolean hasStinger, int pollinationCapacity, double wingSize) {
	       super("BubbleBee", 6, true, false, "Hives");
	       this.honeyLevel = honeyLevel;
	       this.hasStinger = hasStinger;
	       this.pollinationCapacity = pollinationCapacity;
	       this.wingSize = wingSize;
	   }

	   // Abstract method
	   abstract void gatherNectar();

	   // Instance method
	   public void makeSound() {
		   System.out.println("Buzz ...");
	   }
	   public void reproduce() {
		   System.out.println("BubbleBee Reproducing ...");
	   }
	   public void eat() {
		   System.out.println("BubbleBee Eating ...");
	   }
}
