/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerfeedbackapp;

import javax.swing.JOptionPane;

public class FeedbackApp {
    private int entryCount = 1; // Keeps track of feedback entries

    public void run() {
        while (true) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to submit feedback?",
                    "Customer Feedback", JOptionPane.YES_NO_OPTION);

            if (choice != JOptionPane.YES_OPTION) {
                break; // Exit loop if user selects No
            }

            String department = getValidatedInput("Enter Department (e.g., Sales, Support):");
            String message = getValidatedInput("Enter Feedback (max 250 characters):");

            Feedback feedback = new Feedback(department, message, entryCount);
            JOptionPane.showMessageDialog(null, feedback.getFeedbackDetails());

            entryCount++; // Increment feedback count
        }

        JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
    }

    // Ensures user input is not empty
    private String getValidatedInput(String prompt) {
        String input;
        while (true) {
            input = JOptionPane.showInputDialog(null, prompt);
            if (input != null && !input.trim().isEmpty()) {
                return input.trim();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Input cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
