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
		status = "Open";
		System.out.println("Port Status: Open");
	}
	
	public void closePort() { // Method to close port
		status = "Closed";
		System.out.println("Port Status: Closed");
	}
	
	public void dockShip(Ship ship) { // Method  to dock a ship. Receives a ship object as a parameter
		for (int i = numberOfDockedShips; i < dockedShips.length;) {
			ship.setShipId(i);
			dockedShips[i] = ship;
			numberOfDockedShips ++;
			break;
		}
		System.out.println("Ship docked successfully.");
	}

	public void undockShip(Ship ship) { // Method to un-dock a ship. Receives a ship object as a parameter
		int shipId = ship.getShipId();
		int newId = 0;
		if(shipId == -1) {
			System.out.println("This ship is not docked.");
		}
		else {
			Ship[] tempArray = new Ship[dockedShips.length - 1];
			for(int i = 0; i < dockedShips.length; i++) {
				if(i == shipId) {
					continue;
				}
				else {
					tempArray[newId] = dockedShips[i];
				}
			}
			numberOfDockedShips = 0;
			for(int j = 0; j < tempArray.length; j++) {
				this.dockShip(tempArray[j]);
			}
			System.out.println(ship.name + " has been undocked.");
		}
		
	}
	
	public boolean checkCapacity(int currentPopulation) { // Method to check if Port is at capacity.
		if(currentPopulation >=  this.capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getAvailableDocks() { // Method to get the number of unoccupied docks
		return dockCount - numberOfDockedShips;
	}
}
