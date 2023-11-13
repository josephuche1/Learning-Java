public class DemoPoems {
    public static void main(String[] args) {
        Poem newPoem = new Poem("Ai", 23);
        Couplet newCouplet = new Couplet("Hoshino");
        Limerick newLimerick = new Limerick("Aqua");
        Haiku newHaiku = new Haiku("ruby");

        System.out.println("Poem: " + newPoem.getName()+", "+newPoem.getNumOfLines());
        System.out.println("Poem: " + newCouplet.getName()+", "+newCouplet.getNumOfLines());
        System.out.println("Poem: " + newLimerick.getName()+", "+newLimerick.getNumOfLines());
        System.out.println("Poem: " + newHaiku.getName()+", "+newHaiku.getNumOfLines());
    }
}
