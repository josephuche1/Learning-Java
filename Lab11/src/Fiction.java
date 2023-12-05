
public class Fiction extends Book implements Library{
   public Fiction(String title, int num) {
	   super(title);
	   this.numOfPages = num;
	   this.setPrice();
   }
   
   public void setTitle(String title) {
	   this.title = title;
   }
   public void setNumOfPages(int num) {
	   this.numOfPages = num;
   }
   public void setPrice() {
	   this.price = 29.99;
   }
   
   public String getName() {
	   return Fiction.name;
   }
   public double getSquareMeters() {
	   return Fiction.squareMeters;
   }
   public int getCapacity() {
	   return Fiction.libraryCapacity;
   }
}
