
public abstract class NewspaperSubscription {
    private String subscriberName;
    protected String address;
    protected double  rate;
    
    public void setSubscriberName(String name) {
    	this.subscriberName = name;
    }
    
    public String getSubscriberName() {
    	return this.subscriberName;
    }
    
    public String getAddress() {
    	return this.address;
    }
    public double getRate() {
    	return this.rate;
    }
}
