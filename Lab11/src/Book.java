
public abstract class Book implements Library{
   protected String title;
   protected double price;
   protected int numOfPages;
   
   public Book(String title) {
	   this.title  = title;
   }
   
   public String getTitle() {
	   return this.title;
   }
   
   public double getPrice() {
	   return this.price;
   }
   
   public int getNumOfPages() {
	   return this.numOfPages;
   }

   
   protected abstract void setPrice();
}
