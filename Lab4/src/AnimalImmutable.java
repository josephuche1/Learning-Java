
public class AnimalImmutable {
	// Variables
	private String name;
	private int age;
	private double weight;
	
	// Constructors
	public AnimalImmutable(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
    
    // Accessors
    public String getName() {
    	return this.name;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public double getWeight() {
    	return this.weight;
    }
}


