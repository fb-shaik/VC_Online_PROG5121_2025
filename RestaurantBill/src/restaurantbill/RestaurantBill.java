/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantbill;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class RestaurantBill {
    public static void main(String[] args) {
        // Get the meal cost from the user
        String mealCostInput = JOptionPane.showInputDialog("Enter the cost of your meal: R");
        double mealCost = Double.parseDouble(mealCostInput);

        // Get the tip percentage from the user
        String tipPercentInput = JOptionPane.showInputDialog("Enter the tip percentage (e.g., 15 for 15%):");
        double tipPercent = Double.parseDouble(tipPercentInput);

        // Calculate the tip and total bill
        double tipAmount = mealCost * (tipPercent / 100);
        double totalBill = mealCost + tipAmount;

        // Display the result
JOptionPane.showMessageDialog(null,
            "Meal Cost: R " + mealCost + "\n" +
            "Tip Amount (" + tipPercent + "%): R " + tipAmount + "\n" +
            "Total Bill: R " + totalBill,
            "Restaurant Bill",
            JOptionPane.INFORMATION_MESSAGE);
    }
}