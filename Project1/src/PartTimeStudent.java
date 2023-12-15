
public class PartTimeStudent extends Student{
    public PartTimeStudent(int studentID, String lastName) {
        super(studentID, lastName);
    }

    @Override
    public void setTuition() {
        this.setAnnualTuition(1500.0);
    }

    @Override
    public void additionalAbstractMethod1() {
        // Implementation for the first additional abstract method
    	System.out.println("This is additionalAbstractMethod1 in PartTimeStudent");
    }

    @Override
    public void additionalAbstractMethod2() {
        // Implementation for the second additional abstract method
    	System.out.println("This is additionalAbstractMethod2 in PartTimeStudent");
    }
}
