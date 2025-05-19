/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video_game_subscription_app;

import javax.swing.JOptionPane;

public class Video_Game_Subscription_App {

     public static void main(String[] args) {
        boolean morePlayers = true;

        while (morePlayers) {
            // Prompt for player type
            String type = JOptionPane.showInputDialog("Enter player type (Casual, Competitive, Hardcore):");

            // Prompt for weekly hours
            String hoursInput = JOptionPane.showInputDialog("Enter average weekly play hours (0–30):");
            int hours = Integer.parseInt(hoursInput);

            // Validate hours
            if (hours < 0 || hours > 30) {
                JOptionPane.showMessageDialog(null, "Invalid hours. Must be between 0 and 30.");
                continue;
            }

            // Create Gamer object
            Gamer gamer = new Gamer(type, hours);

            // Calculate and display fee
            double fee = gamer.calculateFee();
            if (fee == -1) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please check player type and hours.");
            } else {
                JOptionPane.showMessageDialog(null, "Monthly subscription fee: $" + fee);
            }

            // Ask if user wants to enter another player
            String again = JOptionPane.showInputDialog("Do you want to enter another player? (yes/no)");
            morePlayers = again.equalsIgnoreCase("yes");
        }
    }
}