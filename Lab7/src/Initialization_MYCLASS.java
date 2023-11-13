public class Initialization_MYCLASS {
    public static void main(String[] args) {
        DerivedWithPrint  newDerivedWithPrint = new DerivedWithPrint();
        newDerivedWithPrint.print();
    }
}

/* Explanation
- When new DerivedWithPrint() is called, it first calls the constructor of its superclass BaseWithPrint.
  - Inside the BaseWithPrint constructor, it calls the print() method. Since print() is overridden in DerivedWithPrint, the print() in DerivedWithPrint is called, not the one in BaseWithPrint. Hence, "i = 47" is printed.
  - After the DerivedWithPrint object is created, dp.print() is called. Since dp is an instance of DerivedWithPrint, it calls the print() method in DerivedWithPrint, printing "i = 47" again. 
*/
