/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steptrackerapp;

import javax.swing.JOptionPane;

   // StepTracker class to manage and store total steps
   class StepTracker {
        // Private variable to keep track of the total steps
        private int totalSteps = 0;

        /**
         * trackSteps method uses a for loop to collect step counts for 7 days.
         * It prompts the user each day and adds the entered steps to totalSteps.
         * Assumes valid numeric input from the user.
         */
        public void trackSteps() {
            // Loop from day 1 to 7
            for (int day = 1; day <= 7; day++) {
                // Prompt the user to enter steps for the current day
                String input = JOptionPane.showInputDialog("Enter steps for Day " + day + ":");

                // Directly convert the input string to integer (assumes valid input)
                int steps = Integer.parseInt(input);

                // Add the steps to the total
                totalSteps += steps;
            }
        }

        /**
         * Returns the total number of steps collected over 7 days.
         *
         * @return total step count
         */
        public int getTotalSteps() {
            return totalSteps;
        }
    }