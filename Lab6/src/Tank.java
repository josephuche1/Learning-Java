public class Tank {
    static int counter;
    int id = counter++;
    boolean full = false;

    public Tank() {
        full = true;
        System.out.println("Tank " + id + " created");
    }

    public void empty() {
        full = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (full) {
            System.out.println("Error: Tank " + id + " must be empty at cleanup");
        } else {
            System.out.println("Tank " + id + " cleaned up");
        }
    }
}