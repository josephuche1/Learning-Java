
public class Human {
   // Data Fields
   private String firstName;
   private String lastName;
   private String middleName;
   
   // Constructors
   public Human() {
	   this.firstName = "";
	   this.lastName = "";
	   this.middleName = "";
   }
   
   public Human(String first, String last, String middle) {
	    this.setFirstName(first);
	    this.setLastName(last);
	    this.setMiddleName(middle);
   }
   
   public Human(Human otherHuman) {
	   this.setFirstName(otherHuman.getFirstName());
	   this.setLastName(otherHuman.getLastName());
	   this.setMiddleName(otherHuman.getMiddleName());
   }
   
   
   // Set
   private void setFirstName(String first) {
	   this.firstName = first;
   }
   
   private void setLastName(String last) {
	   this.lastName = last;
   }
   
   private void setMiddleName(String middle) {
	   this.middleName = middle;
   }
   
   // Get
   public String getFirstName() {
	   return this.firstName;
   }
   
   public String getLastName() {
	   return this.lastName;
   }
   
   public String getMiddleName() {
	   return this.middleName;
   }
   
   // Other methods
   public boolean isFirstName(String first) {
	   if(this.firstName == first) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public boolean isMiddleName(String middle) {
	   if(this.middleName == middle) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public boolean isLastName(String last) {
	   if(this.lastName == last) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   
   
}
