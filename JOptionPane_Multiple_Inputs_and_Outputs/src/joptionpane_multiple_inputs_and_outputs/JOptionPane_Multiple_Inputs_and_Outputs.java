
package joptionpane_multiple_inputs_and_outputs;

import javax.swing.JOptionPane; //import for the JOptionPane; 
public class JOptionPane_Multiple_Inputs_and_Outputs {

    public static void main(String[] args) 
    {
        // Get user name
        String name = JOptionPane.showInputDialog("Enter your name:");
        
        // Get item price and convert to double
         String priceString = JOptionPane.showInputDialog("Enter item price:");
         
         //convert the String prompt to the appropriate data-type
         double price = Double.parseDouble(priceString);
         
         // Get quantity and convert to int
          String quantityString = JOptionPane.showInputDialog("Enter quantity:");
          int quantity = Integer.parseInt(quantityString);
          
          // Calculate total cost
          double totalCost = price * quantity; 
          
          // Display total cost
        JOptionPane.showMessageDialog(null, name + ", your total cost is ZAR " + totalCost);
         
    
    }
    
}

/*
  This program asks the user for:
- Their name
- The price of an item
- The quantity
- Then it calculates the total cost and displays it.

*/
