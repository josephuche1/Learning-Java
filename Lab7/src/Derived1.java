public class Derived1 extends BaseClass {
    protected void finalize(){
        System.out.println("Derived1.finalize()");
        super.finalize();
    }
}
