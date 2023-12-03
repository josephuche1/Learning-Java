
public class GraduateStudent extends Student{
	
	public GraduateStudent(String name, String studentID) {
		super(studentID, name);
		this.setTuition();
	}
    
    public void setTuition() {
    	this.annualTuition = 6000 * 2;
    }
    
}
