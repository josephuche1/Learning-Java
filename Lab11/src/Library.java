
public interface Library {
   String name = "The Library";
   int libraryCapacity = 30000;
   double squareMeters = 3000;
   
   abstract String getName();
   abstract double getSquareMeters();
   abstract int getCapacity();
}
