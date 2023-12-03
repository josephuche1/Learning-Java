import java.util.Random;
public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean[] trueAndFalse = {true, false};
		Student[] students = new Student[6];
		
		students[0] = new UndergraduateStudent("Siley", "N220B2103");
		students[1] = new GraduateStudent("Miles", "U3312Z1203");
		students[2] = new StudentAtLarge("Sophia", "U221N1068");
		students[3] = new UndergraduateStudent("Stiles", "N220A2103");
		students[4] = new GraduateStudent("Miley", "U0312Y1203");
		students[5] = new StudentAtLarge("Sonia", "U223M1068");
		
		
		System.out.println("Parker University");
		System.out.println("---------------------------------------");
		for(int i = 0; i < 6; i++) {
			System.out.println("Name: " + students[i].getLastName());
			System.out.println("Student ID: " +students[i].getStudentID());
			System.out.println("Tuition: $"+students[i].getTuition());
			
			int randomNumberOfAs = rand.nextInt(6)+1;
			boolean randomIndex = trueAndFalse[rand.nextInt(2)];
			
			if(students[i].isExcellent(randomIndex, randomNumberOfAs)) {
				System.out.println("Is " + students[i].getLastName()+" an excellent student?:  Yes!");
			}
			else {
				System.out.println("Is " + students[i].getLastName()+" an excellent student?:  No");
			}
			System.out.println("---------------------------------------");
		}
		
	}

}
