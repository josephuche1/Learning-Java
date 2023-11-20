
public abstract class GeometricFigure {
	public double height;
     public double width;
     public String figureType;
     public double area;
     
     public GeometricFigure(double h, double w, String f) {
    	 this.height = h;
    	 this.width =w;
    	 this.figureType = f;
     }
     
     public abstract double determineArea();
}
