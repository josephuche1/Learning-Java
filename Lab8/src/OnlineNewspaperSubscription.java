
public class OnlineNewspaperSubscription extends NewspaperSubscription{
	public void setAddress(String address) {
		boolean found = false;
		for(int i = 0; i < address.length(); i++) {
			if(address.charAt(i) == '@') {
				found = true;
			}
		}
		
		if(found) {
            this.address = address;
            this.rate = 9.0;
		}else {
			System.out.println("Error: Address must contain an '@' sign. Subscription rate set to 0.");
            this.rate = 0.0;
		}
	}
      
}
