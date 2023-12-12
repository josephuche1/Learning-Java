
public class ThrowIceCream {
    public static void main(String[] args) {
    	IceCreamCone[] iceCreams = new IceCreamCone[5];
    	int[] scoops = {1,2,34,6,3,5};
    	String[] flavors = {"Strawberry", "Vanilla", "Chocolate", "Banana", "Peach"};
    	
		for(int i = 0; i < 5; i++) {
			iceCreams[i] = new IceCreamCone(flavors[i], scoops[i]);
		}
    }
}
