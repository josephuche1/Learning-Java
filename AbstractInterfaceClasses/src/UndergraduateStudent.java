
public class UndergraduateStudent extends Student{
	
	public UndergraduateStudent(String name, String studentID) {
		super(name, studentID);
	}
    public void setTuition() {
    	this.annualTuition = 4000 * 2;
    }
}
