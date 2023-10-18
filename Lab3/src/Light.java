
public class Light {
	
	private boolean on = false;
	private int brightness = 1;
	
	private void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean getOn() {
		return this.on;
	}
	
	public void setBrightness(int num) {
		this.brightness = num;
	}
	
	public int getBrightness() {
		return this.brightness;
	}
	
	private void setOn1(boolean on) {
		this.setOn(on);
	}
	
	private void setOn2(boolean on) {
		this.setOn1(on);
	}
	
	public void setOn3(boolean on) {
		this.setOn2(on);
	}
	
	private void setBrightness1(int num) {
		this.setBrightness(num);
	}
	
	private void setBrightness2(int mum) {
		this.setBrightness1(mum);
	}
	
	public void setBrightness3(int num) {
		this.setBrightness2(num);
	}
	

}
