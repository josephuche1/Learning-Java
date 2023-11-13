public class Derived extends TwoMethods {
    @Override
    public void m2() {
        System.out.println("Method m2 from Derived");
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.m1();
        System.out.println(d.toString());
    }
}

// Output
// Method m2 from Derived
// Derived