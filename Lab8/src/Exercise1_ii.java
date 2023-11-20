
public class Exercise1_ii {
    public static void main(String[] args) {
    	Inner.data = "new";
    	System.out.println(Inner.data);
    }
    
    public static class Inner{
    	public static String data;
    }
}
