// MainClass.java
public class MainClass {

    // Method taking InterfaceOne as an argument
    public static void methodWithInterfaceOne(InterfaceOne obj) {
        obj.methodOne();
        obj.methodTwo();
    }

    // Method taking InterfaceTwo as an argument
    public static void methodWithInterfaceTwo(InterfaceTwo obj) {
        obj.methodThree();
        obj.methodFour();
    }

    // Method taking InterfaceThree as an argument
    public static void methodWithInterfaceThree(InterfaceThree obj) {
        obj.methodFive();
        obj.methodSix();
    }

    // Method taking NewInterface as an argument
    public static void methodWithNewInterface(NewInterface obj) {
        obj.newMethod();
    }

    public static void main(String[] args) {
        // Create an object of ConcreteClass
        ConcreteClass concreteObj = new ConcreteClass();

        // Pass the object to each of the four methods
        methodWithInterfaceOne(concreteObj);
        methodWithInterfaceTwo(concreteObj);
        methodWithInterfaceThree(concreteObj);
        methodWithNewInterface(concreteObj);
    }
}
