public class UseVehicle {
    public static void main(String[] args) {
        Car car = new Car(30);
        MotorCycle motorCycle = new MotorCycle(50);

        System.out.println(car.toString());
        System.out.println(motorCycle.toString());
    }
}
// Output
// Number of wheels: 4. Average number of miles per gallon: 30.
// Number of wheels: 2. Average number of miles per gallon: 50.