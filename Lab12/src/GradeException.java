
public class GradeException extends Exception{
     static public char[] grades = {'A', 'B', 'C', 'D', 'F', 'I'};
     
     public GradeException(String message) {
    	 super(message);
     }
}
