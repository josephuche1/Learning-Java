
public class ScentedCandle extends Candle{
	private double price;
	public void setHeight(double height) {
		super.setHeight(height);
		this.price = 3*this.getHeight();
	}
    public double getPrice() {
    	return this.price;
    }
}
