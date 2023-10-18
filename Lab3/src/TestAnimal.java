
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal newAnimal = new Animal();
		System.out.println("Weight: " + newAnimal.getWeight());
		
		newAnimal.setAgeLevel3(12);
		newAnimal.setNameLevel3("Bachira");
		newAnimal.setWeightLevel3(34.5);
		
		System.out.println("Name: "+ newAnimal.getName());
		System.out.println("Age: " + newAnimal.getAge());
		System.out.println("Weight: "+  newAnimal.getWeight());

	}

}
