import javax.swing.*;

public class Health extends Insurance{
     public Health() {
    	 super("Health");
    	 this.setCost();
     }
     
     public void setCost() {
    	 this.cost = 50.0;
     }
     
     public void display() {
    	 JOptionPane.showMessageDialog(null, " " + type +" insurance costs $" + cost + " per month.");
     }
}
