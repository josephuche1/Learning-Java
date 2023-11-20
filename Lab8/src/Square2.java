public class Square2 extends GeometricFigure2 {
    public Square2(double h) {
    	 super(h, h, "Square");
    }
     
    public double determineArea() {
    	 this.area = this.height *  this.height;
    	 return this.area;
    }

    public void printSides() {
        System.out.println("This figure has 4 sides");
    }
}
