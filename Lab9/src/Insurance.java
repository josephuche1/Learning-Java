
public abstract class Insurance {
    protected String type;
    protected double cost;
    
    public Insurance(String lh) {
    	
    }
    
    public String getType() {
    	return this.type;
    }
    
    public double getCost() {
    	return this.cost;
    }
    
    public abstract void setCost();
    public abstract void display();
}
