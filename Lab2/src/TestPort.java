
public class TestPort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Port newPort = new Port();
		Buildings newBuilding = new Buildings();
		
		
		// Port
		newPort.name = "Tatami Port";
		newPort.bld.name = "Building 1";
		newPort.bld.capacity = 1000;
		newPort.bld.noOfFloors = 20;
		newPort.noOfParkingSlots = 100;
		newPort.bld.timeOfClosure = "11:00PM";
		newPort.getNameOfBuildings();
		newPort.printPortName();
		newPort.timeForBuildingClosure();
		
		
		//Building
		Buildings newBld = new Buildings();
		newBld.name = "Zetten";
		newBld.noOfFloors = 50;
		newBld.noOfShoppingPlazas = 100;
		newBld.timeOfClosure = "12:00AM";
		newBld.getNoOfShoppingPlazas();
		newBld.printCapacity();
		newBld.printNoOfFloors();

	}

}