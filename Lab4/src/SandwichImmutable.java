
public class SandwichImmutable {
	   // Data Fields
	   private String mainIngredient;
	   private String breadType;
	   private double price;
	   // Constructor
	   public SandwichImmutable(String mainIngredient, String breadType, double price) {
		   this.mainIngredient = mainIngredient;
		   this.breadType = breadType;
		   this.price = price;
	   }
	   // methods
	   // Accessors
	   public String getMainIngredient() {
		   return this.mainIngredient;
	   }
	   
	   public String getBreadType(){
		   return this.breadType;
	   }
	   
	   public double getPrice() {
		   return this.price;
	   }
}
