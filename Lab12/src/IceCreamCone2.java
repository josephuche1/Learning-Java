
public class IceCreamCone2 {
    private String flavor;
    private int scoops;
    private String[] flavors = {"Strawberry", "Vanilla", "Chocolate", "Banana", "Peach"};
    
    public IceCreamCone2(String flavor, int scoops) {
    	try {
    		this.setFlavor(flavor);
        	this.setScoops(scoops);
        	System.out.println("Ice cream cone created successfully.");
    	}catch(IceCreamConeException err) {
    		System.out.println("IceCreamConeException: " + err.getMessage());
    	}
    }
    
    public void setFlavor(String flavor) throws IceCreamConeException{
    	boolean found = false;
    	for(String flavor1 : flavors) {
    		if(flavor1 == flavor) {
    			found = true;
    		}	
    	}
    	
    	if(found == false) {
    		throw(new IceCreamConeException(flavor + " is not a valid flavor."));
    	}
    	
    	this.flavor = flavor;
    	System.out.println("Flavor added successfully");
    }
    
    public void setScoops(int scoops) throws IceCreamConeException{
    	if(scoops > 3) {
    		throw (new IceCreamConeException(scoops+" is greater than 3"));
    	}
        this.scoops = scoops;
        System.out.println("Scoops added successfully");
    }
}
