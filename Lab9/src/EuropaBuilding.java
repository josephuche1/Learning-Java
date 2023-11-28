
public class EuropaBuilding extends UniversityBuilding {
    @Override
    public void buildFoundation() {
        System.out.println("Europa Building's foundation is being constructed.");
    }

    @Override
    public void constructFloors() {
        System.out.println("Europa Building is getting its floors constructed.");
    }

    @Override
    public void enrollStudents() {
        System.out.println("Students are enrolling in Europa Building.");
    }

    @Override
    public void conductClasses() {
        System.out.println("Classes are being conducted in Europa Building.");
    }

    // Additional method specific to EuropaBuilding
    public void europeanConference() {
        System.out.println("Europa Building hosts a European conference.");
    }
}
