
public class Sandwich {
   // Data Fields
   private String mainIngredient;
   private String breadType;
   private double price;
   
   // methods
   // Mutators
   public void setMainIngredient(String ingredient) {
	   this.mainIngredient = ingredient;
   }
   
   public void setBreadType(String breadType) {
	   this.breadType = breadType;
   }
   
   public void setPrice(double price) {
	   this.price = price;
   }
   
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
