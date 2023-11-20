
public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    
	public void setAddress(String address) {
       if(address == "") {
    	   System.out.println("Error: Address must contain at least one digit. Subscription rate set to 0.");
    	   this.rate = 0.0;
       }
       else {
    	   this.address = address;
    	   this.rate = 15.0;
       }
    }
}
