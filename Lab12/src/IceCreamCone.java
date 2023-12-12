
public class IceCreamCone {
    private String flavor;
    private int scoops;
    
    public IceCreamCone(String flavor, int scoops) {
    	try {
    		this.setFlavor(flavor);
        	this.setScoops(scoops);
    	}catch(IceCreamConeException err) {
    		System.out.println("IceCreamConeException: " + err.getMessage());
    	}
    }
    
    public void setFlavor(String flavor){
    	this.flavor = flavor;
    }
    
    public void setScoops(int scoops) throws IceCreamConeException{
    	if(scoops > 3) {
    		throw (new IceCreamConeException(scoops+" is greater than 3"));
    	}
        this.scoops = scoops;
        System.out.println("Ice cream cone created successfully.");
    }
}
