
public abstract class Student implements ExcellentStudent{
   protected String studentID;
   protected String lastName;
   protected double annualTuition;
   
   //constructor
   public Student(String studentID, String name) {
	   this.lastName = name; 
	   this.studentID = studentID;
   }
   
   // set and get methods
   public void setLastName(String name) {
	   this.lastName = name;
   }
   public void setStudentID(String studentID) {
	   this.studentID = studentID;
   }
   
   public String getLastName() {
	   return this.lastName;
   }
   public String getStudentID() {
	   return this.studentID;
   }
   public double getTuition() {
	   return this.annualTuition;
   }
   
   //other methods
   public boolean isExcellent(boolean isAttentive, int numOfAs) {
	   	if (isAttentive && numOfAs == UndergraduateStudent.numOfAs) {
			return true;
		} else {
			return false;
		}
   }
   //abstract method
   public abstract void setTuition();


}
