
public class ElectricBlanket extends Blanket{
   private int numOfHeatSettings;
   private boolean hasAutomaticShutoff;
   
   public ElectricBlanket() {
	   super();
	   this.numOfHeatSettings = 1;
	   this.hasAutomaticShutoff = false;
	   
   }
   
   public void setNumOfHeatSettings(int num) throws NumberOfHeatSettingsException{
	   if(num > 5 || num < 1) {
		   throw(new NumberOfHeatSettingsException("The number should be between 1-5(inclusive). "+ num+" is not a valid input."));
	   }
	   this.numOfHeatSettings = num;
   }
   public void setHasAutomaticShutoff(boolean hasAutomaticShutoff) {
	   this.hasAutomaticShutoff = hasAutomaticShutoff;
	   if(hasAutomaticShutoff) {
		   double price = this.getPrice();
		   this.setPrice(price+5.75);
	   }
   }
   
   @Override
   public String toString() {
  	 String message = this.getSize()+"-sized electric blanket: "
 	 		+ "\t\tMaterial: "+this.getMaterial()
 	 		+"\t\tColor: " +this.getColor()
 	 		+"\t\tPrice: "+this.getPrice()
 	 		+"\t\tBrand: "+this.getBrand()
 	 		+"\t\tPattern: "+this.getPattern()
 	 		+"\t\tNumber in Stock: "+this.getInvCount()
 	 		+"\t\tCare Instructions: "+this.getCareInstructions()
 	 		+"\t\tNumber of Heat Settings: "+ this.numOfHeatSettings
 	 		+"\t\tHas Automatic Shutoff?: " + this.hasAutomaticShutoff;
 	 return message;
   }
   
   @Override
   public String announceSelf() {
	   return "Electric Blanket";
   }
   
   @Override
   public  String describe() {
   	return this.getSize()+"-sized "+this.getMaterial()+" electric blanket is worth $"+this.getPrice();
   }
   
   
}
