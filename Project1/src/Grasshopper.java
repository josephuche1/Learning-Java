
public class Grasshopper extends Insect{
  protected boolean isJumping;
  protected String camouflageColor;
  protected double antennaLength;
  protected String diet;
  
  public Grasshopper(String camouflageColor, double antennaLength, String diet) {
	  super("Grasshoper", 6, false, true, "Grass");
	  this.camouflageColor = camouflageColor;
	  this.antennaLength = antennaLength;
	  this.diet = diet;
	  this.isJumping = false;
  }
  
  // Instance method
  public void makeSound() {
	   System.out.println("Krr...krr ...");
  }
  public void reproduce() {
	   System.out.println("Grasshopper Reproducing ...");
  }
  public void eat() {
	   System.out.println("Grasshopper Eating ...");
  }
}
