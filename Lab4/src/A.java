
public class A {
	public void display() {
		System.out.println(B.var1);
	}
    private class B{
    	private static String var1;
    	private int var2;
    	public B(String var1, int var2) {
    		this.var1 = var1;
    		this.var2 = var2;
    	}
    }
}
