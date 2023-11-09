
public class CruiseShip extends Ship{
	
	private int passengers;
	
	public CruiseShip(String n, String y, int p) {
		this.setName(n);
		this.setYearBuilt(y);
		this.passengers = p;
	}
	
	public void setPassengers(int p) {
		this.passengers = p;
	}
	
	public int  getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		return "My name is "+this.getName()+" and I was built in "+this.getYearBuilt()+". I have " + this.passengers+ "passengers. ";
	}
    
}
