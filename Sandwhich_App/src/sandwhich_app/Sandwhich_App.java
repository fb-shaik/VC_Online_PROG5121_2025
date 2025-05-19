
package sandwhich_app;

import javax.swing.*;
public class Sandwhich_App {

    public static void main(String[] args) {
         // Create a new Sandwich instance to handle the sandwich logic
         Sandwich sandwich = new Sandwich();
         JOptionPane.showMessageDialog(null, "Welcome to the Sandwich Builder!");
         
         boolean keepGoing = true;
         
         while (keepGoing) {
            // Prompt user for input
            String input = JOptionPane.showInputDialog(null,
                "Choose an ingredient to add to your sandwich:\n" +
                "- Lettuce\n- Tomatoe\n- Cheese\n- Chicken\n- Mayo\n" +
                "- Done (to finish)",
                "Sandwich Ingredient", JOptionPane.QUESTION_MESSAGE);
            
            if (input == null) 
            {
                // Handle user clicking "Cancel"
                 int exitChoice = JOptionPane.showConfirmDialog(null, 
                         "Do you want to quit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                 if (exitChoice == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    return;
                  } else {
                    continue;
                }
            }
        
            // Normalize input
            input = input.trim().toLowerCase();

            if (input.equals("done")) {
                keepGoing = false;
            } else if (sandwich.addIngredient(input)) {
                // Ingredient added successfully
                JOptionPane.showMessageDialog(null, input + " added to your sandwich.");
            } else {
                // Invalid input
                JOptionPane.showMessageDialog(null, "Invalid ingredient. Please try again.");
            }
        }
         
 // Display final sandwich summary
        JOptionPane.showMessageDialog(null,
            sandwich.getSummary(),
            "Your Custom Sandwich",
            JOptionPane.INFORMATION_MESSAGE);
         }
         
    }
    

