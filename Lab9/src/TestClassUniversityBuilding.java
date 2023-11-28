
public class TestClassUniversityBuilding {
    public static void main(String[] args) {
        // Creating instances of EuropaBuilding and MainBuilding and upcasting to UniversityBuilding
        UniversityBuilding europaBuilding = new EuropaBuilding();
        UniversityBuilding mainBuilding = new MainBuilding();

        // Demonstrating methods
        europaBuilding.buildFoundation();
        europaBuilding.constructFloors();
        europaBuilding.enrollStudents();
        europaBuilding.conductClasses();
        europaBuilding.openDoors();  // Inherited from Building
        // europaBuilding.europeanConference();  // This won't work because europeanConference() is not in UniversityBuilding

        mainBuilding.buildFoundation();
        mainBuilding.constructFloors();
        mainBuilding.enrollStudents();
        mainBuilding.conductClasses();
        mainBuilding.openDoors();  // Inherited from Building
        // mainBuilding.mainLibrary();  // This won't work because mainLibrary() is not in UniversityBuilding

        // Creating an array of UniversityBuilding and upcasting it to EuropaBuilding and MainBuilding
        UniversityBuilding[] universityBuildings = new UniversityBuilding[10];
        universityBuildings[0] = new EuropaBuilding();
        universityBuildings[1] = new MainBuilding();

        // Demonstrating methods for array elements
        universityBuildings[0].buildFoundation();
        universityBuildings[1].constructFloors();
        // universityBuildings[0].europeanConference();  // This won't work because europeanConference() is not in UniversityBuilding
        // universityBuildings[1].mainLibrary();  // This won't work because mainLibrary() is not in UniversityBuilding
    }
}
