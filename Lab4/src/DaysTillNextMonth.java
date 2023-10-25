import java.time.*;
import java.util.Scanner;
public class DaysTillNextMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDate today = LocalDate.now();
        int day;
        int daysTillNextMo;
        System.out.println("Today is " + today);
        day = today.getDayOfMonth();
        daysTillNextMo = today.lengthOfMonth() - day;
        System.out.println("There are " + daysTillNextMo+ "days until "+ today.plusMonths(1).getMonth()+ " starts");
	}

}
