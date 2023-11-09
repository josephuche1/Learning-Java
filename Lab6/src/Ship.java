
public class Ship {
    private String name;
    private String yearBuilt;
    
    public Ship() {
    	System.out.println("I am the Ship - parent class");
    }
    
    public Ship(String n, String y) {
    	this.name = n;
    	this.yearBuilt = y;
    }
    
    public void setName(String n) {
    	this.name = n;
    }
    
    public void setYearBuilt(String y) {
    	this.yearBuilt = y;
    }
    
    public String getName() {
    	return this.name;
    }
    public String getYearBuilt() {
    	return this.yearBuilt;
    }
    
    public String toString() {
    	return "My name is "+this.name+" and I was built in "+this.yearBuilt+"."; 
    }
}
