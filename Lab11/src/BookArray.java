
public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book[] books = new Book[10];
        
        books[0] = new Fiction("Enrolling in the Transcendent Academy", 87);
        books[1] = new NonFiction("Greatest Outcast", 81);
        books[2] = new Fiction("The Galactic Odyssey", 95);
        books[3] = new NonFiction("The Human Genome Project", 76);
        books[4] = new Fiction("Echoes of Eternity", 88);
        books[5] = new NonFiction("Sapiens: A Brief History of Humankind", 94);
        books[6] = new Fiction("The Quantum Paradox", 91);
        books[7] = new NonFiction("The Immortal Life of Henrietta Lacks", 80);
        books[8] = new Fiction("Beyond the Stars", 89);
        books[9] = new NonFiction("Einstein: His Life and Universe", 92);
        
        System.out.println("Books");
        System.out.println("----------------------------------------");
        for(int i =0; i < 10; i++) {
        	System.out.println("books["+i+"]: "+ books[i].getTitle() + ", "+books[i].getNumOfPages()+ ", "+ books[i].getPrice());
        	System.out.println("              "+books[i].getName()+ ", "+books[i].getSquareMeters()+", "+books[i].getCapacity());
        	System.out.println("----------------------------------------");
        }
	}

}
