
public class Tuition {
     public double tuition;
     
     public Tuition() {
    	 tuition = 0.0;
     }
     
     public Tuition(double tuition) {
    	 this.tuition = tuition;
     }
     
     public double getTuition() {
    	 return tuition;
     }
     
     public void setTuition(double tuition) {
    	 this.tuition = tuition;
     }
     
     public double getTuitionAfterTenYrs() {
    	 double tempVariable = this.tuition;
    	 for(int i = 1; i <= 10; i++) {
    		 tempVariable = (0.05 * tempVariable) + tempVariable;
    	 }
    	 return tempVariable;
     }
}
