
public class Animal {
	private String name;
	private int age;
	private double weight;
	
	// Constructors
	public Animal(int age) {
		this.setAge(age);
	}
	
	public Animal(double weight) {
		this.setWeight(weight);
	}
	
	public Animal(String name) {
		this.setName(name);
	}
	
	public Animal() {
		this(12.0);
	}
	
	// Mutators
	// Set age
    private void setAge(int age) {
    	this.age = age;
    }
    private void setAgeLevel2(int age) {
    	this.setAge(age);
    }
    public void setAgeLevel3(int age) {
    	this.setAgeLevel2(age);
    }
    
    // Set weight
    private void setWeight(double weight) {
    	this.weight = weight;
    }
    private void setWeightLevel2(double weight) {
    	this.setWeight(weight);
    }
    
    public void setWeightLevel3(double weight) {
    	this.setWeightLevel2(weight);
    }
    
    // Set name
    private void setName(String name) {
    	this.name =name;
    }
    
    private void setNameLevel2(String name) {
    	this.setName(name);
    }
    
    public void setNameLevel3(String name) {
    	this.setNameLevel2(name);
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
