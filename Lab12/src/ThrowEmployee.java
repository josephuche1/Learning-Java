
public class ThrowEmployee {
     public static void main(String[] args){
    	 Employee[] employees = new Employee[3];
    	 
    	 double[] hourlyWages = {100.00, 5.00, 45.00 };
    	 String[] idNums = {"1","12", "123" };
    	 
         try {
        	 for(int i = 0; i <3; i++) {
        		 employees[i] = new Employee(idNums[i], hourlyWages[i]);
        	 }
         } catch(EmployeeException err) {
        	 System.out.println("Error creating Employee: "+ err.getMessage());
         }
     }
}
