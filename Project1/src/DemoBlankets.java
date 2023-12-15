import javax.swing.*;

public class DemoBlankets {
    public static void main(String[] args) {
        // Creating a regular blanket
        Blanket regularBlanket = new Blanket("Twin", "white", "cotton", 30.00, "Cozy Comfort");
        regularBlanket.setPattern("plain");
        regularBlanket.setInventoryCount(150);
        regularBlanket.setCareInstructions("Machine wash cold, tumble dry low");

        // Creating an electric blanket
        ElectricBlanket electricBlanket = new ElectricBlanket();
        electricBlanket.setSize("Queen");
        electricBlanket.setColor("blue");
        electricBlanket.setMaterial("polyester");
        electricBlanket.setPrice(75.00);
        electricBlanket.setBrand("Warm & Toasty");
        electricBlanket.setPattern("striped");
        electricBlanket.setInventoryCount(100);
        electricBlanket.setCareInstructions("Spot clean only");

        // Upcasting and downcasting
        Blanket upcastedBlanket = electricBlanket; // Upcasting
        ElectricBlanket downcastedBlanket = (ElectricBlanket) upcastedBlanket; // Downcasting

        // Aggregation
        Blanket[] blankets = {regularBlanket, electricBlanket};

        // User interface (UI menu) using javax.swing
        String[] options = {"Regular Blanket", "Electric Blanket"};
        int choice = JOptionPane.showOptionDialog(null, "Select a type of blanket to create", "Blanket Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            JOptionPane.showMessageDialog(null, regularBlanket.toString(), "Regular Blanket Details", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, electricBlanket.toString(), "Electric Blanket Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}