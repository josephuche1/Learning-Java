
public class Drawing extends Art{
	public Drawing() {
		System.out.println("Drawing constructor");
	}
	void art_method (int num) {
		super.art_method(0);
		System.out.println("I'm art_method in Drawing Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Drawing d = new Drawing();
        d.art_method(0);
	}

}
