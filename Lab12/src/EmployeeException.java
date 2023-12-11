
public class EmployeeException extends Exception{
   private String id;
   private String payRate;
   public EmployeeException(String id, String payRate) {
	   super("Employee Exception: " + id +", "+ payRate+".");
	   this.id = id;
	   this.payRate = payRate;
   }
}
