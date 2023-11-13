public class TwoMethods {
    public String name = "TwoMethods";
    public void m1() {
        m2();
    }

    public void m2() {
        System.out.println("Method m2 from TwoMethods");
    }

    
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
