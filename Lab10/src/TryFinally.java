
public class TryFinally {
    int tryAgain() {
    	int a =10;
    	
    	try {
    		System.out.println("Try");
    		++a;
    	}
    	finally {
    		System.out.println("Finally");
    		a++; 
    	}
    	return a; 
    } 
    public static void main(String[] args) {
    	System.out.println(new TryFinally().tryAgain());
    }
}
