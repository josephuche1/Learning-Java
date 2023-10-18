
public class A {
    private int a,b;
    private boolean c;
    
    public A() {
    	a = 0;
    	b = 0;
    	c = false;
    }
    
    public A(int a,int b, boolean c) {
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	
    }
    
    private void setA(int a) {
    	this.a = a;
    }
    
    public void accessA() {
    	setA(10);
    }
}
