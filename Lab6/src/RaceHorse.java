
public class RaceHorse extends Horse {
    private int numberOfRaces;
    
    public RaceHorse() {
    	System.out.println("I am the default constructor of the class RaceHorse");
    }
    
    // Setters
    public void setNumberOfRaces(int number) {
    	this.numberOfRaces = number;
    }
    
    // Getters
    public int getNumberOfRaces() {
    	return this.numberOfRaces;
    }
    
    // methods
    
    public void methodHorse(){
    	System.out.println("I am methodHorse in RaceHorse class");
    }
}
