// " - " : private
// " + " : public
// " # " : protected
public class Distance {
	// private
    private double speed;
    private int hours;
    
    // methods
    //public 
    public Distance(double s, int h) {
    	this.speed = s;
    	this.hours = h;
    }
    
    public void setSpeed(double s) {
    	this.speed = s;
    }
    
    public void setHours(int h) {
    	this.hours = h;
    }
    
    public double getSpeed() {
    	return this.speed;
    }
    
    public double getHours() {
    	return this.hours;
    }
    
    public double getDistance() {
    	double distance = this.speed * this.hours;
    	return distance;
    }
    
}
