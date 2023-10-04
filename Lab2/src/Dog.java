
public class Dog {
    public String name;
    public int age;
    public String breed;
    public boolean shotStatus;
    
    public void sleeping(boolean isSleeping) {
        if(isSleeping) {
        	System.out.println("Snoooooooooore😴");
        }
    }
    public void bark(boolean isBarking) {
    	if(isBarking) {
    		System.out.println("Woof Woof!😊");
    	}
    }
}

