
public abstract class UniversityBuilding extends Building {
    // Additional methods
    public abstract void enrollStudents();
    public abstract void conductClasses();

    // Inherited abstract methods from Building
    @Override
    public abstract void buildFoundation();

    @Override
    public abstract void constructFloors();
}
