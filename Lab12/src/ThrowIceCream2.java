
public class ThrowIceCream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	IceCreamCone2[] iceCreams = new IceCreamCone2[5];
    	int[] scoops = {1,2,34,6,3,5};
    	String[] flavors = {"Strawberry", "Cocoa", "Chocolate", "Fish", "Peach"};
    	
		for(int i = 0; i < 5; i++) {
			iceCreams[i] = new IceCreamCone2(flavors[i], scoops[i]);
			System.out.println();
		}
    }

}
