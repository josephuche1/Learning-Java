
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AnimalImmutable newAnimal = new AnimalImmutable("Doggy", 12, 35.6);
        System.out.println("Age: "+ newAnimal.getAge());
        System.out.println("Name: "+ newAnimal.getName());
        System.out.println("Weight: "+newAnimal.getWeight());
	}

}
