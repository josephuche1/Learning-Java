import javax.swing.*;
public class useInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int insurance;
		String input = JOptionPane.showInputDialog(null, "Enter 1 for Life Insurance and 2 for Health Insurance");
		insurance = Integer.parseInt(input);
		
		if(insurance == 1) {
			insuranceLife();
		}
		else {
			insuranceHealth();
		}
        
	}
	
	public static void insuranceLife() {
		Life life = new Life();
		life.display();
	}
	
	public static void insuranceHealth() {
		Health health = new Health();
		health.display();
	}

}
