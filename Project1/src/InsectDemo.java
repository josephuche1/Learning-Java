public class InsectDemo {
    public static void main(String[] args) {
        // Upcasted array of Insect objects
        Insect[] insects = new Insect[5];

        // Creating instances of each Insect type
        Insect grasshopper = new Grasshopper("Green", 2.5, "Leaves");
        Insect bubbleBee = new Bean(15, true, 100, 1.5, "Garden", true);
        Insect grasshopperBaby = new GrasshopperBaby("Brown", 1.0, "Insects", "Acrididae", true, 6, "Fields", false);

        // Assigning instances to the array
        insects[0] = grasshopper;
        insects[1] = bubbleBee;
        insects[2] = grasshopperBaby;

        // Demonstrating polymorphism and calling methods
        for (int i = 0; i < 3; i++) {
            System.out.println("=====================================");
            System.out.println("Type: " + insects[i].getClass().getSimpleName());
            System.out.println("Name: " + insects[i].getName());
            System.out.println("Legs: " + insects[i].getLegs());
            System.out.println("Can Fly? " + insects[i].canFly());
            System.out.println("Habitat: " + insects[i].habitat);
            System.out.println("Is Nocturnal? " + insects[i].isNocturnal);
            insects[i].makeSound();
            insects[i].sleep();
            insects[i].reproduce();
            insects[i].eat();

            // Checking specific methods based on the actual type
            if (insects[i] instanceof BubbleBee) {
                BubbleBee bee = (BubbleBee) insects[i];
                bee.gatherNectar();
            } else if (insects[i] instanceof GrasshopperBaby) {
                GrasshopperBaby baby = (GrasshopperBaby) insects[i];
                System.out.println("Family: " + baby.getFamily());
                System.out.println("Leg Count: " + baby.getLegCount());
            }
        }
    }
}
