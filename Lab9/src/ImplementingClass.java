
public class ImplementingClass implements InterfaceExample{
	
     public void someMethod(){
    	 System.out.println("Implementation of someMethod in ImplementingClass");
     }
     
     // Additional method specific to ImplementingClass
     public void displayFields() {
         // Accessing interface fields in the implementing class
         System.out.println("FIELD ONE: " + fieldOne);
         System.out.println("FIELD TWO: " + fieldTwo);
         System.out.println("FIELD THREE: " + fieldThree);
     }
}
