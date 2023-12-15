
public class Blanket {
    private String size;
    private String color;
    private String material;
    private double price;
    private String brand;
    private String pattern;
    private int inventoryCount;
    private String careInstructions;
    
    
    // Constructors
    public Blanket() {
    	this.size = "Twin";
    	this.color = "white";
    	this.material = "cotton";
    	this.price = 30.00;
    }
    public Blanket(String size, String color, String material, double price, String brand) {
    	this.size = size;
    	this.color = color;
    	this.material = material;
    	this.price = price;
    	this.brand = brand;
    	this.pattern = "floral";
    	this.inventoryCount = 200;
    	this.careInstructions = "Store in cool, dry places";
    }
    public Blanket(String size, String color, String material, double price, String brand, String pattern) {
    	this.size = size;
    	this.color = color;
    	this.material = material;
    	this.price = price;
    	this.brand = brand;
    	this.pattern = pattern;
    	this.inventoryCount = 200;
    	this.careInstructions = "Store in cool, dry places";
    }
    public Blanket(String size, String color, String material, double price, String brand, String pattern, int invCount) {
    	this.size = size;
    	this.color = color;
    	this.material = material;
    	this.price = price;
    	this.brand = brand;
    	this.pattern = pattern;
    	this.inventoryCount = invCount;
    	this.careInstructions = "Store in cool, dry places";
    }
    public Blanket(String size, String color, String material, double price, String brand, String pattern, int invCount, String careInstructions) {
    	this.size = size;
    	this.color = color;
    	this.material = material;
    	this.price = price;
    	this.brand = brand;
    	this.pattern = pattern;
    	this.inventoryCount = invCount;
    	this.careInstructions = careInstructions;
    }
    
    // Set methods
    public void setSize(String size) {
    	this.size=size;
    	if(this.size == "double") {
    		this.price += 10;
    	} else if(this.size == "queen") {
    		this.price += 25;
    	} else if(this.size == "king") {
    		this.price += 40;
    	} else {
        	this.size = "Twin";
        	this.price = 30.00;
    	}
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public void setMaterial(String material) {
    	this.material = material;
    	if(this.material == "wool") {
    		this.price += 20;
    	} else if(this.material == "cashmere") {
    		this.price += 45;
    	} else {
        	this.material = "cotton";
        	this.price = 30.00;
    	}
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    public void setPattern(String pattern) {
    	this.pattern = pattern;
    }
    public void setInventoryCount(int invCount) {
    	this.inventoryCount = invCount;
    }
    public void setCareInstructions(String careInstructions) {
    	this.careInstructions = careInstructions;
    }
    
    // toString Method
    public String toString() {
    	 String message = this.size+"-sized blanket: "
    	 		+ "\t\tMaterial: "+this.material
    	 		+"\t\tColor: " +this.color
    	 		+"\t\tPrice: "+this.price
    	 		+"\t\tBrand: "+this.brand
    	 		+"\t\tPattern: "+this.pattern
    	 		+"\t\tNumber in Stock: "+this.inventoryCount
    	 		+"\t\tCare Instructions: "+this.careInstructions;
    	 return message;
    }
    
    // Final methods
    public final String getSize() {
    	return this.size;
    }
    public final double getPrice() {
    	return this.price;
    }
    public final String getMaterial() {
    	return this.material;
    }
    public final String getColor() {
    	return this.color;
    }
    public final String getBrand() {
    	return this.brand;
    }
    public final String getPattern() {
    	return this.pattern;
    }
    public final int getInvCount() {
    	return this.inventoryCount;
    }
    public final String getCareInstructions() {
    	return this.careInstructions;
    }
    
    //Protected methods
    protected String announceSelf() {
    	return "Blanket";
    }
    protected String describe() {
    	return this.size+"-sized "+this.material+" blanket is worth $"+this.price;
    }
    
    public String announceSelfL1() {
    	return this.announceSelf();
    }
    public String describeL1() {
    	return describe();
    }
    
}
