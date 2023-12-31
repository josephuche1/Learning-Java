public class Port {
	// Parameters
	
	//public 
	public String name;  // The name of the port.
	public String location; // The geographic location of the port.
	public int capacity;  // The maximum capacity of the port in terms of cargo or ships
	public String status; // The current operational status of the port (e.g., "Open," "Closed," "Under maintenance").
	public int dockCount; // The number of docks available at the port.
	public Ship[] dockedShips; // An array of docked ships
	public Buildings[] buildings; // An array of buildings
	
	// private
	private int numberOfDockedShips; // number of docked ships
	private int numberOfBuildings;  // number of buildings
	private int maxBuildingCapacity; // the max number of buildings that can fit into the port
	
	// Constructors
	public Port() { // Constructor without parameters
		name = "";
		location = "";
		capacity = 0;
		status = "Closed";
		dockCount = 0;
		dockedShips = new Ship[dockCount];
		buildings = new Buildings[maxBuildingCapacity];
		numberOfDockedShips = 0;
		numberOfBuildings = 0;
		maxBuildingCapacity = 0;
	} 
	
	public Port(String name, String location, int capacity, String status, int dockCount, int maxBuildingCapacity) { // Constructor with parameters
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.status = status;
		this.dockCount = dockCount;
		this.maxBuildingCapacity = maxBuildingCapacity;
		this.dockedShips = new Ship[dockCount];
		this.buildings  = new Buildings[maxBuildingCapacity];
		this.numberOfDockedShips = 0;
		this.numberOfBuildings = 0;
		
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
		for (int i = this.numberOfDockedShips; i < dockCount;) {
			ship.setShipId(i);
			dockedShips[i] = ship;
			this.numberOfDockedShips++;
			break;
		}
		System.out.println(ship.name + " docked successfully.");
	}

	public void undockShip(Ship ship) { // Method to un-dock a ship. Receives a ship object as a parameter
		int shipId = ship.getShipId();
		int newId = 0;
		if(shipId == -1) {
			System.out.println("This ship is not docked.");
		}
		else {
			Ship[] tempArray = new Ship[dockCount];
			for(int i = 0; i < dockCount; i++) {
				if(i == shipId) {
					continue;
				}
				else {
					tempArray[newId] = dockedShips[i];
				}
				newId++;
			}
			numberOfDockedShips = 0;
			for(int j = 0; j < tempArray.length; j++) {
				if(tempArray[j] != null) {
					this.dockShip(tempArray[j]);
				}
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
		
		int available = dockCount - numberOfDockedShips;
		return available;
	}
	
	public void addBuilding(Buildings newBuild) { // method to add a building to port
		for (int i = this.numberOfDockedShips; i < dockCount;) {
			newBuild.setBuildingId(i);
			buildings[i] = newBuild;
			this.numberOfBuildings++;
			break;
		}
		System.out.println(newBuild.name + " built successfully.");
	}
	
	public  void removeBuilding(Buildings building) {
		int id = building.getBuildingId();
		int newId = 0;
		if(id == -1) {
			System.out.println("This building is has not been built here.");
		}
		else {
			Buildings[] tempArray = new Buildings[maxBuildingCapacity];
			for(int i = 0; i < maxBuildingCapacity; i++) {
				if(i == id) {
					continue;
				}
				else {
					tempArray[newId] = buildings[i];
				}
				newId++;
			}
			numberOfBuildings = 0;
			for(int j = 0; j < tempArray.length; j++) {
				if(tempArray[j] != null) {
					this.addBuilding(tempArray[j]);
				}
			}
			System.out.println(building.name + " has been demolished.");
		}
	}
}
