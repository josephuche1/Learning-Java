
public class Employee {
    private String idNum;
    private double hourlyWage;
    
    public Employee(String idNum, double hourlyWage) throws EmployeeException{
    	try {
    		this.idNum = idNum;
    		this.hourlyWage = hourlyWage;
    		
    		if(this.hourlyWage < 6 || this.hourlyWage > 50) {
    			throw(new EmployeeException("Employee Exception: ID Number: \t"+this.idNum+ ", hourlyWage: "+ this.hourlyWage));
    		}
    	}catch(EmployeeException err) {
    		System.out.println(err.getMessage());
    	}
    }
}
