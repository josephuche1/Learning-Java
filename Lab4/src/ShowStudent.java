
public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student newStudent = new Student();
        newStudent.setStudentID("U221N1068");
        newStudent.setPoints(12);
        newStudent.setCreditHours(3);
        
        System.out.println("Student ID: " + newStudent.getStudentID());
        System.out.println("Points: " + newStudent.getPoints());
        System.out.println("Credit Hours: " + newStudent.getCreditHours());
        System.out.println("GPA: " + newStudent.getcGradePointAverage());
	}

}
