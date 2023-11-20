public class Triangle2 extends GeometricFigure2 {
    public Triangle2(double h, double w) {
   	    super(h, w, "Triangle");
    }
    public double determineArea() {
   	 this.area = 1/2*this.width*this.height;
   	 return this.area;
    }

    public void printSides() {
        System.out.println("This figure has 3 sides");
    }
}
