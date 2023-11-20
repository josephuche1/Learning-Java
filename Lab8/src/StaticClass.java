
public class StaticClass {
	
	static String saying = "Something";
	static String proverb;
	static {
		proverb = "Something else";
	}
	
	static void printStuff() {
		System.out.println(saying);
		System.out.println(proverb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticClass.printStuff();
	}

}
