
public class StudentAtLarge extends Student{
	
	public StudentAtLarge(String name, String studentID) {
		super(name, studentID);
	}
    public void setTuition() {
    	this.annualTuition = 2000 * 2;
    }
    
    public boolean isExcellent(boolean isAttentive, int numOfAs) {
    	if (isAttentive && numOfAs == StudentAtLarge.numOfAs) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
