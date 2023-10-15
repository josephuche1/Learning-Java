public class Port {
	// Parameters
	
	//public 
	public String name;  // The name of the port.
	public String location; // The geographic location of the port.
	public int capacity;  // The maximum capacity of the port in terms of cargo or ships
	public String status; // The current operational status of the port (e.g., "Open," "Closed," "Under maintenance").
	public int dockCount; // The number of docks available at the port.
	public Ship[] dockedShips = new Ship[dockCount]; // A array of docked ships
	
	//private
	private String[] statusTypes = {"Open", "Closed", "Under Maintenance"}; // An array of all the operational status' that the port can be in.
	private int numberOfDockedShips = 0;
	// Constructors
	
	public Port() { // Constructor without parameters
		name = "";
		location = "";
		capacity = 0;
		status = "Closed";
		dockCount = 0;
		for (int i = 0; i < dockedShips.length; i++) {
		    dockedShips[i] = null;
		}
	}
	
	public Port(String name, String location, int capacity, String status, int dockCount) { // Constructor with parameters
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.status = status;
		this.dockCount = dockCount;
	}
	
	// Methods/Behaviors
	
	public void openPort() { // Method to open port
		status = statusTypes[0];
		System.out.println("Port Status: Open");
	}
	
	public void closePort() {
		status = statusTypes[1];
		System.out.println("Port Status: Closed");
	}
	
	public void dockShip(Ship ship) {
		for (int i = numberOfDockedShips; i < dockedShips.length;) {
			ship.setShipId(i);
			dockedShips[i] = ship;
			numberOfDockedShips ++;
			break;
		}
		System.out.println("Ship docked successfully.");
	}
	
	
}
