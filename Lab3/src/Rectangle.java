
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
}
