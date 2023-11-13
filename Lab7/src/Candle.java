
public class Candle {
    private String color;
    private double height;
    private double price;
    
    // Accessors
    public String getColor() {
    	return this.color;
    }
    public double getHeight() {
    	return this.height;
    }
    public double getPrice() {
    	return this.price;
    }
    
    // Mutators
    public void setColor(String color) {
    	this.color = color;
    }
    public void setHeight(double height) {
    	this.height = height;
    	this.price = 2 * height;
    }
}
