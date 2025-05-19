/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petpersonalitymatcher;

import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class PetPersonalityMatcher {

    public static void main(String[] args) {
      // Ask user about their activity level
        String activity = JOptionPane.showInputDialog("Are you active or lazy?");
        // Ask user about their environment preference
        String preference = JOptionPane.showInputDialog("Do you prefer indoor or outdoor?");

        // Create a Pet object
        Pet userPet = new Pet();

        // Use setRecommendation to determine the best pet
        userPet.setRecommendation(activity, preference);

        // Display the recommendation using a message dialog
        JOptionPane.showMessageDialog(null, userPet.getRecommendation());
    }
}