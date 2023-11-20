public abstract class GeometricFigure2 implements SidedObject {
     public double height;
     public double width;
     public String figureType;
     public double area;
     
     public GeometricFigure2(double h, double w, String f) {
    	 this.height = h;
    	 this.width =w;
    	 this.figureType = f;
     }
     
     public abstract double determineArea();

    public void printSides() {
        System.out.println("This figure has 0 sides");
    }
}
