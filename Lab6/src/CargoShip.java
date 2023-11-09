
public class CargoShip extends Ship{
    private int tonnage;
    
    public CargoShip(String y, String n, int t) {
    	this.setName(n);
    	this.setYearBuilt(y);
    	this.tonnage = t;
    }
   

	public void setTonnage(int t) {
    	this.tonnage = t;
    }
    
    public int getTonnage() {
    	return this.tonnage;
    }
    
    public String toString() {
    	return "My name is "+this.getName()+". I have a  tonnage of " + this.tonnage+".";
    }
}
