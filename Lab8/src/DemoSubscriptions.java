public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalSub = new PhysicalNewspaperSubscription();
        physicalSub.setSubscriberName("John Doe");
        physicalSub.setAddress("123 Main St");
        
        OnlineNewspaperSubscription onlineSub = new OnlineNewspaperSubscription();
        onlineSub.setSubscriberName("Jane Smith");
        onlineSub.setAddress("jane@example.com");
        
        // Displaying data fields
        System.out.println("Physical Subscription - Name: " + physicalSub.getSubscriberName() + ", Address: " + physicalSub.getAddress() + ", Rate: $" + physicalSub.getRate());
        System.out.println("Online Subscription - Name: " + onlineSub.getSubscriberName() + ", Address: " + onlineSub.getAddress() + ", Rate: $" + onlineSub.getRate());
    }
}