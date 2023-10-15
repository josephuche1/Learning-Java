
public class Ship {
	//Public 
	public String name;
	public int cargoCapacity;
	public String captain;
	
	// Private
    private int shipId;
    
    // Constructors
    public Ship() {
    	shipId = -1;
    	name = "";
    	captain = "";
    }
    
    
    //Methods/ Behaviors
    public void setShipId(int id) {
    	shipId = id;
    }
    
    public int getShipId() {
    	return shipId;
    }
}
