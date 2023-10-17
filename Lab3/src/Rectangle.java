
public class Rectangle {
	// Parameters
     public double width;
     public double height;
     public String color;
     
     // Constructors
     public Rectangle() {
    	 width = 1;
    	 height = 1;
    	 color = "white";
     }
     
     public Rectangle(double width, double height) {
    	 this.width = width;
    	 this.height = height;
    	 this.color = "white";
     }
     
     // Methods 
     
     // Accessor
     public double getWidth() {
    	 return this.width;
     }
     
     public double getHeight() {
    	 return this.height;
     }
     
     public String getColor() {
    	 return this.color;
     }
     
     // Mutator
     public void setWidth(double width) {
    	 this.width = width;
     }
     
     public void setHeight(double height) {
    	 this.height = height;
     }
     
     public void setColor(String color) {
    	 this.color = color;
     }
     
     // Behavior
     public double getArea() {
    	 double area = this.height * this.width;
    	 return area;
     }
     
     public double getPerimeter() {
    	 double perimeter = (this.height + this.width) * 2;
    	 return perimeter;
     }
     
}
