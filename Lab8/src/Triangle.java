
public class Triangle extends GeometricFigure{
    public Triangle(double h, double w) {
   	 super(h, w, "Triangle");
    }
    public double determineArea() {
   	 this.area = 1/2*this.width*this.height;
   	 return this.area;
    }

}
