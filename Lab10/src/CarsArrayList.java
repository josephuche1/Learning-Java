import java.util.ArrayList;
import java.util.Collections;
public class CarsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        enum cars {BMW, Ford, Volvo, Mazda};
        
        ArrayList<cars> carsArrayList = new ArrayList<>();
        
        carsArrayList.add(cars.Volvo);
        carsArrayList.add(cars.BMW);
        carsArrayList.add(cars.Ford);
        carsArrayList.add(cars.Mazda);
        
     // sort ArrayList
        Collections.sort(carsArrayList);
        
        for(cars element: carsArrayList) {
        	System.out.println(element);
        }
        
    }

}
