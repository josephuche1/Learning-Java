
public class ReverseInteger {
	
	public static String reverse(int number) {
		String reversedNumber = "";
		while(number/10 != 0) {
		   int lastNum = number % 10;
		   reversedNumber += lastNum;
		   number /= 10;
		}
		reversedNumber += number;
		return  reversedNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversedNumber = reverse(245361);
		
		System.out.println("The number displayed in reverse is " + reversedNumber);
	}

}
