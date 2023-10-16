
public class UpperCaseToLowerCase {
	
	public static char upperCaseToLowerCase(char ch) {
		char lowerCasedCharacter = Character.toLowerCase(ch);
		return lowerCasedCharacter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    char lowerCase = upperCaseToLowerCase('D');
	    System.out.println("Lower case form: " +lowerCase);

	}

}
