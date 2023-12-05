// Interface A
interface A {
    void methodA1();
    void methodA2();
}

// Interface B
interface B {
    void methodB1();
    void methodB2();
}

// Interface C
interface C {
    void methodC1();
    void methodC2();
}

// Inherited Interface D from A, B, C
interface D extends A, B, C {
    void methodD1();
    void methodD2();
}

// Abstract class E implementing D
abstract class E implements D {
    abstract void abstractMethod1();
    abstract void abstractMethod2();
}

// Concrete class F extending E
class F extends E {
    @Override
    public void methodA1() {
        System.out.println("F - Implementing methodA1");
    }

    @Override
    public void methodA2() {
        System.out.println("F - Implementing methodA2");
    }

    @Override
    public void methodB1() {
        System.out.println("F - Implementing methodB1");
    }

    @Override
    public void methodB2() {
        System.out.println("F - Implementing methodB2");
    }

    @Override
    public void methodC1() {
        System.out.println("F - Implementing methodC1");
    }

    @Override
    public void methodC2() {
        System.out.println("F - Implementing methodC2");
    }

    @Override
    public void methodD1() {
        System.out.println("F - Implementing methodD1");
    }

    @Override
    public void methodD2() {
        System.out.println("F - Implementing methodD2");
    }

    @Override
    void abstractMethod1() {
        System.out.println("F - Implementing abstractMethod1");
    }

    @Override
    void abstractMethod2() {
        System.out.println("F - Implementing abstractMethod2");
    }
}

public class Main {
    public static void main(String[] args) {
        F objectF = new F();

        // Pass the object to each method
        invokeMethodA(objectF);
        invokeMethodB(objectF);
        invokeMethodC(objectF);
        invokeMethodD(objectF);
        invokeAbstractMethods(objectF);
    }

    // Example method accepting objects implementing Interface A
    private static void invokeMethodA(A object) {
        object.methodA1();
        object.methodA2();
    }

    // Example method accepting objects implementing Interface B
    private static void invokeMethodB(B object) {
        object.methodB1();
        object.methodB2();
    }

    // Example method accepting objects implementing Interface C
    private static void invokeMethodC(C object) {
        object.methodC1();
        object.methodC2();
    }

    // Example method accepting objects implementing Interface D
    private static void invokeMethodD(D object) {
        object.methodD1();
        object.methodD2();
    }

    // Example method accepting objects implementing Abstract class E
    private static void invokeAbstractMethods(E object) {
        object.abstractMethod1();
        object.abstractMethod2();
    }
}
