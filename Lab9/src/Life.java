import javax.swing.*;
public class Life extends Insurance{
     public Life() {
    	 super("Life");
    	 this.setCost();
     }
     
     public void display() {
    	 JOptionPane.showMessageDialog(null, " " + type +" insurance costs $" + cost + " per month.");
     }
     
     public void setCost() {
    	 this.cost = 35.01;
     }
}
