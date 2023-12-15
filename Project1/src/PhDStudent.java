
public class PhDStudent extends Student{
    public PhDStudent(int studentID, String lastName) {
        super(studentID, lastName);
    }

    @Override
    public void setTuition() {
        this.setAnnualTuition(14000.0);
    }

    @Override
    public void additionalAbstractMethod1() {
        // Implementation for the first additional abstract method
    	System.out.println("This is additionalAbstractMethod1 in PhDStudent");
    }

    @Override
    public void additionalAbstractMethod2() {
        // Implementation for the second additional abstract method
    	System.out.println("This is additionalAbstractMethod2 in PhDStudent");
    }
}
