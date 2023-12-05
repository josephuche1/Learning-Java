// Interface Building
interface Building {
    void buildFoundation();
    void installUtilities();
}

// Abstract class BuildingImplementation
abstract class BuildingImplementation {
    abstract void constructStructure();
    abstract void furnishInterior();

    // Concrete method
    void hireStaff() {
        System.out.println("Staff has been hired.");
    }
}

// Abstract class UniversityBuilding inheriting from BuildingImplementation and implementing Building
abstract class UniversityBuilding extends BuildingImplementation implements Building {
    // Concrete methods specific to UniversityBuilding
    void conductClasses() {
        System.out.println("Classes are being conducted.");
    }

    void hostEvents() {
        System.out.println("University events are being hosted.");
    }
}

// Concrete class EuropaBuilding inheriting from UniversityBuilding
class EuropaBuilding extends UniversityBuilding {
    @Override
    void constructStructure() {
        System.out.println("Europa Building structure is being constructed.");
    }

    @Override
    void furnishInterior() {
        System.out.println("Europa Building interior is being furnished.");
    }

    @Override
    public void buildFoundation() {
        System.out.println("Europa Building foundation is being built.");
    }

    @Override
    public void installUtilities() {
        System.out.println("Europa Building utilities are being installed.");
    }
}

// Concrete class MainBuilding inheriting from UniversityBuilding
class MainBuilding extends UniversityBuilding {
    @Override
    void constructStructure() {
        System.out.println("Main Building structure is being constructed.");
    }

    @Override
    void furnishInterior() {
        System.out.println("Main Building interior is being furnished.");
    }

    @Override
    public void buildFoundation() {
        System.out.println("Main Building foundation is being built.");
    }

    @Override
    public void installUtilities() {
        System.out.println("Main Building utilities are being installed.");
    }
}

// TestBuildingHierarchy class for testing the hierarchy
public class TestBuildingHierarchy {
    public static void main(String[] args) {
        EuropaBuilding europaBuilding = new EuropaBuilding();
        MainBuilding mainBuilding = new MainBuilding();

        // Demonstrate methods of concrete classes
        europaBuilding.constructStructure();
        europaBuilding.furnishInterior();
        europaBuilding.buildFoundation();
        europaBuilding.installUtilities();
        europaBuilding.hireStaff();
        europaBuilding.conductClasses();
        europaBuilding.hostEvents();

        System.out.println();

        mainBuilding.constructStructure();
        mainBuilding.furnishInterior();
        mainBuilding.buildFoundation();
        mainBuilding.installUtilities();
        mainBuilding.hireStaff();
        mainBuilding.conductClasses();
        mainBuilding.hostEvents();

        System.out.println();

        // Create an array of UniversityBuilding and upcast it to EuropaBuilding and MainBuilding
        UniversityBuilding[] universityBuildings = new UniversityBuilding[10];
        for (int i = 0; i < 5; i++) {
            universityBuildings[i] = new EuropaBuilding();
        }
        for (int i = 5; i < 10; i++) {
            universityBuildings[i] = new MainBuilding();
        }

        // Demonstrate methods of upcasted objects
        for (UniversityBuilding building : universityBuildings) {
            building.constructStructure();
            building.furnishInterior();
            building.buildFoundation();
            building.installUtilities();
            building.hireStaff();
            building.conductClasses();
            building.hostEvents();
            System.out.println();
        }
    }
}
