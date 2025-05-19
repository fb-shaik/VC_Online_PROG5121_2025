
package recap_app_coffee_app;

import javax.swing.JOptionPane;


public class Recap_App_Coffee_App {

  
    public static void main(String[] args) {
        //flag to keep track of whether the user wants to continue ordering
        boolean keepOrdering = true;
        
        double grandTotal = 0.0;   // Total amount for all orders combined
        
        // Main loop: runs until user decides to stop ordering
        while (keepOrdering)
        {
             // Ask the user to enter a drink name
            String drinkInput = JOptionPane.showInputDialog("enter a drink (coffee, tea, latte): ");
            
             // If the user clicks "Cancel", exit the loop
             if (drinkInput == null) break;
             
             // Validate the drink input using the DrinkOrder class method
             if(!DrinkOrder.isValidDrink(drinkInput))
             {
                 // Show error message if input is invalid
                 JOptionPane.showMessageDialog(null, "Invalid drink selected. Please choose coffee, tea, or latte.");
                 continue; // Skip to next iteration of the loop
             }
             
             // Ask the user to enter quantity
             String qtyInput = JOptionPane.showInputDialog("Enter quantity (positive number):");
             // If the user clicks "Cancel", exit the loop
            if (qtyInput == null) break;
            
            // Convert the quantity from String to int
             int qty = Integer.parseInt(qtyInput);
             
              // Validate that quantity is greater than 0
            if (!DrinkOrder.isValidQuantity(qty)) {
                // Show error message if quantity is invalid
                JOptionPane.showMessageDialog(null, "Quantity must be greater than 0.");
                continue; // Skip to next iteration
            }
            
            // Create a DrinkOrder object with the user's drink and quantity
            DrinkOrder order = new DrinkOrder(drinkInput, qty);
            
            // Calculate the total cost for this specific order
             double total = order.calculateTotal();
             
              // Build a text summary of the order using string concatenation
               String summary = "Order Summary:\n";
               summary += "Drink: " + order.getDrink() + "\n";
               summary += "Quantity: " + order.getQuantity() + "\n";
               summary += "Price per Unit: $" + order.getPricePerUnit() + "\n";
               summary += "Total: $" + total;
            
               // Show the order summary to the user
                JOptionPane.showMessageDialog(null, summary);
                
                // Add this order's total to the overall grand total
                grandTotal += total;
                
                // Ask the user if they want to place another order
                String more = JOptionPane.showInputDialog("Do you want to order more? (yes/no):");
                // If user says anything other than "yes", stop ordering
            if (more == null || !more.equalsIgnoreCase("yes")) {
                keepOrdering = false;

        }
        }
        // After the loop ends, show the grand total for all orders
        JOptionPane.showMessageDialog(null, "Thank you! Your final total is: $" + grandTotal, "Order Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}