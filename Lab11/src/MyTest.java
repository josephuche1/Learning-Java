
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fiction book1 = new Fiction("Black Clover", 300);
        NonFiction book2 = new NonFiction("Jujutsu Kaisen", 244);
        
        book1.setNumOfPages(368);
        book1.setPrice();
        
        book2.setPrice();
        
        System.out.println("Book 1: " + book1.getTitle() + ", "+book1.getNumOfPages()+ ", "+ book1.getPrice());
        System.out.println("Book 2: " + book2.getTitle() + ", "+book2.getNumOfPages()+ ", "+ book2.getPrice());
	}

}
