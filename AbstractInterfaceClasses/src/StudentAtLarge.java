
public class StudentAtLarge extends Student{
	
	public StudentAtLarge(String name, String studentID) {
		super(studentID, name);
		this.setTuition();
	}
    public void setTuition() {
    	this.annualTuition = 2000 * 2;
    }

}
