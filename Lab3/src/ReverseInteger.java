
public class ReverseInteger {
	
	public static void reverse(int number) {
		String reversedNumber = "";
		while(number/10 != 0) {
		   int lastNum = number % 10;
		   reversedNumber += lastNum;
		   number /= 10;
		}
		reversedNumber += number;
		System.out.println("The number displayed in reverse is " + reversedNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(245361);
		
		
	}

}
