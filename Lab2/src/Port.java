
public class Port {
	public String name;
	public int noOfParkingSlots;
	
	Buildings bld = new Buildings();
	
	public Port() {
		System.out.println("This is a new port.");
	}
	
	public void getNameOfBuildings() {
		System.out.println("Building name is " + bld.name +".");
	}
	
	public void timeForBuildingClosure() {
		System.out.println("Building closes at "+bld.timeOfClosure+".");
	}
	
	public void printPortName() {
		System.out.println("The name of this port is "+ name+".");
	}

}
