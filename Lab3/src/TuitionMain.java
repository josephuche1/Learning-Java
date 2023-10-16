
public class TuitionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new tuition object
		Tuition schoolTuition = new Tuition(16000.0);
		
	    double tuitionIn10Years = schoolTuition.getTuitionAfterTenYrs();
		
		System.out.println("The tuition fee after 10 years will be " + tuitionIn10Years);

	}

}
