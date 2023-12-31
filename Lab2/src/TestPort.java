
public class TestPort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new Port
		Port newPort = new Port("Jujutsu Kaisen", "Japan", 1000, "Open", 100, 200);
		
		// Create new ships
		Ship newShip = new Ship("The best ship", "Jack Sparrow", 500);
		Ship newShip2 = new Ship("Bon Voyage", "James Bond", 1000);
		Ship newShip3 = new Ship("Megumi", "Joseph Uche", 3000);
		
		// create new Building
		Buildings newBuild = new Buildings("Mahoraga", 100, 13, 5000, "3:00PM");
		
		// Calling Port methods
		newPort.closePort();
		newPort.openPort();
		System.out.println();
		newPort.dockShip(newShip);
		newPort.dockShip(newShip2);
		newPort.dockShip(newShip3);
		System.out.println();
		newPort.undockShip(newShip2);
		System.out.println();
		boolean isAtCapacity  = newPort.checkCapacity(1001);
		if(isAtCapacity) {
			System.out.println(newPort.name + " is at capacity.");
		}
		else {
			System.out.println(newPort.name + " still has space for more people.");
		}
		
	    System.out.println("The number of available docks at " + newPort.name+ " is "+newPort.getAvailableDocks());
	    
	    newPort.addBuilding(newBuild);
	    newPort.removeBuilding(newBuild);
	}

}
