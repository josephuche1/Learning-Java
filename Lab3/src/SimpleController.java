
public class SimpleController {
	 
     public SimpleController() {
    	 setTemperature(293.0);
     }
     
     private void setTemperature(double t) {
    	 this.temperature = t;
     }
     
     private void setTemperature1(double t) {
    	 this.setTemperature(t);
     }
     
     public void setTemperature2(double t) {
    	 this.setTemperature1(t);
     }
     private double temperature;
}
