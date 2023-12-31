
public class Buildings {
	public String name;
	public int noOfFloors;
	public int noOfShoppingPlazas;
	public int capacity;
	public String timeOfClosure;
	
	private int id;
	
	public Buildings() {
		this.name = "";
		this.noOfFloors = 0;
		this.noOfShoppingPlazas = 0;
		this.capacity = 0;
		this.timeOfClosure = "";
		this.id = -1;
	}
	public Buildings(String name, int noOfFloors, int noOfShoppingPlazas, int capacity, String timeOfClosure) {
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.noOfShoppingPlazas = noOfShoppingPlazas;
		this.capacity = capacity;
		this.timeOfClosure = timeOfClosure;
		this.id = -1;
	}
	
	public void setBuildingId(int id) {
    	this.id = id;
    }
	
	public int getBuildingId() {
    	return this.id;
    }

}
