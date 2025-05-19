/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steptrackerapp;

import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class StepTrackerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a StepTracker object
        StepTracker tracker = new StepTracker();

        // Start tracking steps for 7 days
        tracker.trackSteps();

        // Show the total steps after collecting all inputs
        JOptionPane.showMessageDialog(null, "Total steps for the week: " + tracker.getTotalSteps());
    }
}