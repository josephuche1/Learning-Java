
public class GraduateStudent extends Student{
	
	public GraduateStudent(String name, String studentID) {
		super(name, studentID);
	}
    
    public void setTuition() {
    	this.annualTuition = 6000 * 2;
    }
    
    public boolean isExcellent(boolean isAttentive, int numOfAs) {
    	if (isAttentive && numOfAs == GraduateStudent.numOfAs) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
