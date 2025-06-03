
package favoritefruits_array;

import javax.swing.JOptionPane;

public class FavoriteFruits_Array {

    public static void main(String[] args) {
        // Ask user how many favorite fruits they have
        String input = JOptionPane.showInputDialog("How many favorite fruits do you have?");
        int numFruits = Integer.parseInt(input);
        
        // Create an array to store the fruit names
        String[] fruits = new String[numFruits];
        
        // Collect the names of the fruits
        for (int i = 0; i < fruits.length; i++)
        {
            fruits[i] = JOptionPane.showInputDialog("Enter fruit #" + (i + 1) + ":");
        }
        
        // Build the output message
        String message = "Your favorite fruits are: \n";
        for (String fruit : fruits)
        {
            message +="-  " + fruit + "\n";
        }
        
                // Show the list of fruits
        JOptionPane.showMessageDialog(null, message);

    }
    
}
