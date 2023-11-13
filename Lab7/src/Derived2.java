public class Derived2 extends Derived1{
    protected void finalize(){
        System.out.println("Derived2.finalize()");
        super.finalize();
    }

    public static void main(String[] args) {
        new Derived2();
        System.gc();

        new Derived2();
        System.gc();

        new Derived2();
    }
}
