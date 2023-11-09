public class TankDemo {
    public static void main(String[] args) {
        // Scenario 1: Tank is emptied before cleanup
        Tank tank1 = new Tank();
        tank1.empty();
        tank1 = null;
        System.gc(); // Request garbage collection

        // Scenario 2: Tank is not emptied before cleanup
        Tank tank2 = new Tank();
        tank2 = null;
        System.gc(); // Request garbage collection
    }
}