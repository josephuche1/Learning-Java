
public class GraduateStudent extends Student{
    public GraduateStudent(int studentID, String lastName) {
        super(studentID, lastName);
    }

    @Override
    public void setTuition() {
        this.setAnnualTuition(6000.0);
    }

    @Override
    public void additionalAbstractMethod1() {
        // Implementation for the first additional abstract method
    	System.out.println("This is additionalAbstractMethod1 in GraduateStudent");
    }

    @Override
    public void additionalAbstractMethod2() {
        // Implementation for the second additional abstract method
    	System.out.println("This is additionalAbstractMethod2 in GraduateStudent");
    }
}
