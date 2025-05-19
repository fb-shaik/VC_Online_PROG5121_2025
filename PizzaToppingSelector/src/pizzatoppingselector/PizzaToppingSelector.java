/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzatoppingselector;

import javax.swing.JOptionPane;

public class PizzaToppingSelector {

    public static void main(String[] args) {
      // Ask the user to select a topping with number input
        String input = JOptionPane.showInputDialog(
            "Choose a topping:\n1 - Pepperoni\n2 - Mushroom\n3 - Pineapple\n4 - Cheese"
        );

        // Initialize variable for user input
        int choice = 0;

        try {
            // Convert the input string to an integer
            choice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number from 1 to 4.");
            return; // Exit the program if invalid input is detected
        }

        // Create a Pizza object
        Pizza myPizza = new Pizza();

        // Set topping based on user's choice
        myPizza.setTopping(choice);

        // Display the selected topping using a message dialog
        JOptionPane.showMessageDialog(null, "You selected: " + myPizza.getTopping());
    }
}