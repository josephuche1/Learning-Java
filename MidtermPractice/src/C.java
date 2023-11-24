class A{
	public A() {
		System.out.println("A invoked");
	}
}

class B extends A{
	public B(String s) {
		System.out.println(s);
	}
}
public class C {
    public static void main(String[] args) {
    	B b = new B("The constructor of B is invoked");
    	A b1 = new B("Constructor of B again");
    }
}
