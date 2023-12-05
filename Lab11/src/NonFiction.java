
public class NonFiction extends Book implements Library{
	
	   public NonFiction(String title, int num) {
		   super(title);
		   this.numOfPages = num;
		   this.setPrice();
	   }

	   protected void setPrice() {
		   this.price = 31.99;
	   }
	   
	   public String getName() {
		   return NonFiction.name;
	   }
	   public double getSquareMeters() {
		   return NonFiction.squareMeters;
	   }
	   public int getCapacity() {
		   return NonFiction.libraryCapacity;
	   }
}
