
package pocketmoney;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class PocketMoney {
    public static void main(String[] args) {
        // Constant for weekly allowance
        final double WEEKLY_ALLOWANCE = 10.0;

        // Ask the user for the item price
        String itemPriceInput = JOptionPane.showInputDialog("Enter the price of the item you want to buy: R");
        double itemPrice = Double.parseDouble(itemPriceInput);

        // Calculate weeks needed to save for the item
        double weeksNeeded = itemPrice / WEEKLY_ALLOWANCE;

        // Display the result
        JOptionPane.showMessageDialog(null, 
            "With a weekly allowance of R" + WEEKLY_ALLOWANCE + ",\n" +
            "You'll need to save for approximately " +  weeksNeeded + " weeks\n" +
            "to buy an item that costs R" + itemPrice, 
            "Pocket Money Calculator", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}