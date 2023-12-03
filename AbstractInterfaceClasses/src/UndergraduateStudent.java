
public class UndergraduateStudent extends Student{
	
	public UndergraduateStudent(String name, String studentID) {
		super(studentID, name);
		this.setTuition();
	}
    public void setTuition() {
    	this.annualTuition = 4000 * 2;
    }
}
