
public class Employee {
    private String idNum;
    private double hourlyWage;
    
    public Employee(String idNum, double hourlyWage) throws EmployeeException{
    	 if (hourlyWage < 6.00 || hourlyWage > 50.00) {
             throw new EmployeeException("Invalid hourly wage for employee " + idNum + ": " + hourlyWage);
         }

         this.idNum = idNum;
         this.hourlyWage = hourlyWage;
         System.out.println("Employee " + idNum + " created successfully with hourly wage: $" + hourlyWage);
    }
}
