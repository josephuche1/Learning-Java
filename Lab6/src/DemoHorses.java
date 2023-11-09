
public class DemoHorses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Horse newHorse = new Horse();
        RaceHorse newRaceHorse = new RaceHorse();
        
        newRaceHorse.methodHorse();
        newHorse.methodHorse();
        
        newHorse.setName("Jack");
        
        System.out.println(newHorse.getName()); // displays jack
        System.out.println(newRaceHorse.getName()); // displays null even though the name in the parent class has been set to "Jack"
        
        /* First Result
         * I am default constructor of the class Horse
           I am default constructor of the class Horse
           I am the default constructor of the class RaceHorse
           I am methodHorse in Horse class
           I am methodHorse in Horse class
           Jack
           null*/
        
        /* Second Result after over riding method Horse
         * I am default constructor of the class Horse
           I am default constructor of the class Horse
           I am the default constructor of the class RaceHorse
           I am methodHorse in RaceHorse class
           I am methodHorse in Horse class
           Jack
           null*/
	}

}
