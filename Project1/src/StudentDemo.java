// StudentDemo.java
public class StudentDemo {
    public static void main(String[] args) {
        // Create an array of Student objects (upcasted)
        Student[] students = new Student[6];

        students[0] = new UndergraduateStudent(1, "Smith");
        students[1] = new GraduateStudent(2, "Johnson");
        students[2] = new PhDStudent(3, "Williams");
        students[3] = new PartTimeStudent(4, "Jones");
        students[4] = new StudentAtLarge(5, "Brown");
        students[5] = new UndergraduateStudent(6, "Davis");

        // Demonstrate polymorphism and upcasting
        for (Student student : students) {
            student.setTuition();
            System.out.println(student.getLastName() + "'s Tuition: $" + student.getAnnualTuition());
        }
    }
}
