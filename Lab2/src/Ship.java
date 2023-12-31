
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
    	cargoCapacity = 0;
    }
    
    public Ship(String name, String captain, int cargoCapacity) {
    	this.name = name;
    	this.captain = captain;
    	this.cargoCapacity = cargoCapacity;
    	this.shipId = -1;
    }
    
    // Methods/Behaviors
    public void setShipId(int id) {
    	shipId = id;
    }
    
    public int getShipId() {
    	return shipId;
    }
}
