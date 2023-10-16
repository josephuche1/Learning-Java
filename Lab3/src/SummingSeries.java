
public class SummingSeries {
	
	// parameters
	private double number;
	
	// constructors
	public SummingSeries() {
		number = 0;
	}
	
	public SummingSeries(double number) {
	     this.number = number;
	     this.summingSeries();
	}
	
	// Methods
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return this.number;
	}
	public void summingSeries() {
		double sum = 0;
		for(int i = 1; i <= this.number; i++) {
			double num = i+1;
			sum += i/num;
		}
		System.out.println("Result: "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SummingSeries newSum = new SummingSeries(5);
        
	}

}
