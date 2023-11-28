
public class TestInterfaceFields {
     public static void main(String[] main) {
    	// Accessing interface fields directly using interface name
         System.out.println("FIELD ONE: " + InterfaceExample.fieldOne);
         System.out.println("FIELD TWO: " + InterfaceExample.fieldTwo);
         System.out.println("FIELD THREE: " + InterfaceExample.fieldThree);

         // Creating an instance of ImplementingClass
         ImplementingClass implementingClass = new ImplementingClass();

         // Accessing interface fields through the implementing class
         implementingClass.displayFields();
     }
}
