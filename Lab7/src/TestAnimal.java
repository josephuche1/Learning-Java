public class TestAnimal {
    public static void main(String[] args) {
        Animal newAnimal =  new Animal();
        Dog newDog = new Dog();

        newAnimal.method_Animal();
        newAnimal.method_Animal(true);
        newAnimal.method_Animal("animal");
        newAnimal.toString();
        

        newDog.bark();
        newDog.bark(1);
        newDog.bark("Dog");
        newDog.method_Animal();
        newDog.method_Animal("Dog");
        newDog.toString();
    }
}
