
public class Buildings {
	public String name;
	public int noOfFloors;
	public int noOfShoppingPlazas;
	public int capacity;
	public String timeOfClosure;
	
	public Buildings() {
		System.out.println("This is a new building.");
	}
	
	public int getNoOfShoppingPlazas() {
		return noOfShoppingPlazas;
	}
	
	public void printNoOfFloors() {
		System.out.println("There are " +noOfFloors+" in this building. ");
	}
	
	public void printCapacity() {
		System.out.println("Population Capacity: " + capacity+".");
	}

}