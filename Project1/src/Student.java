// Student.java
public abstract class Student {
    private int studentID;
    private String lastName;
    private double annualTuition;

    protected String major; // Protected field
    protected int creditHours; // Protected field

    public Student(int studentID, String lastName) {
        this.studentID = studentID;
        this.lastName = lastName;
    }

    // Non-default constructors
    public Student(int studentID, String lastName, String major, int creditHours) {
        this(studentID, lastName);
        this.major = major;
        this.creditHours = creditHours;
    }

    // Abstract methods
    public abstract void setTuition();

    public abstract void additionalAbstractMethod1();

    public abstract void additionalAbstractMethod2();

    // Accessors and mutators
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualTuition() {
        return annualTuition;
    }

    public void setAnnualTuition(double Tuition) {
        this.annualTuition = Tuition * 2; // 2 for number of semesters in an academic  year
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
