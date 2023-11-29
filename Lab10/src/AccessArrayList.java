import java.util.ArrayList;
public class AccessArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> myArrayList =  new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Four");
        myArrayList.add(2, "Three");
        
        for (String element: myArrayList) {
        	System.out.println(element);
        }
	}

}
