
public class Circle {
	
	public double radius = 1.0;
	
	public Circle() {
		
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
		
	}
	
	double getArea() {
		return radius * radius * 3.14159;
	}
	
	double circumference() {
		return 2 * 3.14159 * radius;
	}
}
