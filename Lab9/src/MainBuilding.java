
public class MainBuilding extends UniversityBuilding {
    @Override
    public void buildFoundation() {
        System.out.println("Main Building's foundation is being constructed.");
    }

    @Override
    public void constructFloors() {
        System.out.println("Main Building is getting its floors constructed.");
    }

    @Override
    public void enrollStudents() {
        System.out.println("Students are enrolling in Main Building.");
    }

    @Override
    public void conductClasses() {
        System.out.println("Classes are being conducted in Main Building.");
    }

    // Additional method specific to MainBuilding
    public void mainLibrary() {
        System.out.println("Main Building houses the main university library.");
    }
}
