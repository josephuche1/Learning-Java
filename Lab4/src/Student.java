
public class Student {
   private String studentID;
   private int numOfCreditHours;
   private int numberOfPoints;
   private double gradePointAverage;
   
   
   // Constructors
   public Student() {
	   this.studentID = "9999";
	   this.numberOfPoints = 12;
	   this.numOfCreditHours = 3;
   }
   
   public Student(String sID, int creditHours, int points) {
	   this.studentID = sID;
	   this.numOfCreditHours = creditHours;
	   this.numberOfPoints = points;
   }
   
   
   // Methods
   // Mutators
   public void setStudentID(String sID) {
	   this.studentID = sID;
   }
   
   public void setCreditHours(int creditHours) {
	   this.numOfCreditHours = creditHours;
   }
   
   public void setPoints(int points) {
	   this.numberOfPoints = points;
   }
   
   // Accessors
   public String getStudentID() {
	   return this.studentID;
   }
   
   public int getCreditHours() {
	   return this.numOfCreditHours;
   }
   
   public int getPoints() {
	   return this.numberOfPoints;
   }
   
   
   public double getcGradePointAverage() {
	   this.gradePointAverage  = this.numberOfPoints/this.numOfCreditHours;
	   return this.gradePointAverage;
   }
}
