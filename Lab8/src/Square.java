
public class Square extends GeometricFigure{
     public Square(double h) {
    	 super(h, h, "Square");
     }
     
     public double determineArea() {
    	 this.area = this.height *  this.height;
    	 return this.area;
     }
}
