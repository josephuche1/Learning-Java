
public abstract class Building {
    // Abstract methods
    public abstract void buildFoundation();
    public abstract void constructFloors();

    // Concrete method
    public void openDoors() {
        System.out.println("Doors are open.");
    }
}
