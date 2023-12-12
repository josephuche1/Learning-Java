import java.util.Scanner;

public class TestScore {
   public static void main(String[] args) throws ScoreException{
	   Scanner keyboard = new Scanner(System.in);
	   String[] studentIDs = {"U221N1068", "U312Y20933", "M231R2345", "K873B2687", "F784G8958"};
	   int score;
	   
       try {
    	   for(int i =0; i < 5; i++) {
    		   System.out.println("Student ID Number: "+ studentIDs[i]);
    		   System.out.print("Enter score: ");
    		   score = keyboard.nextInt();
    		   if(score > 100) {
    			   throw(new ScoreException(score + " is not less than or equal to 100"));
    		   }
    		   System.out.println();
    	   }
       }catch(ScoreException err) {
    	   System.out.println("ScoreException: "+ err.getMessage());
       }
   }
}
