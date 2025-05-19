/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerfeedbackapp;
import javax.swing.JOptionPane;
import java.util.Random;

public class Feedback {
    private String feedbackID;
    private String message;
    private String department;
    private String feedbackHash;
    private int entryNumber;

    public Feedback(String department, String message, int entryNumber) {
        this.department = department;
        this.message = sanitizeMessage(message);
        this.entryNumber = entryNumber;
        this.feedbackID = generateFeedbackID();
        this.feedbackHash = generateFeedbackHash();
    }

    // Trims and limits message to 250 characters
    private String sanitizeMessage(String msg) {
        msg = msg.trim();
        if (msg.length() > 250) {
            msg = msg.substring(0, 250);
            JOptionPane.showMessageDialog(null,
                    "Message too long. Truncated to 250 characters.");
        }
        return msg;
    }

    // Creates a random 10-digit feedback ID
    private String generateFeedbackID() {
        Random rand = new Random();
        long num = 1000000000L + (long)(rand.nextDouble() * 9000000000L);
        return Long.toString(num);
    }

    // Constructs feedback hash
    private String generateFeedbackHash() {
        String trimmedMessage = message.trim();
        String firstWord, lastWord;

        int firstSpace = trimmedMessage.indexOf(" ");
        int lastSpace = trimmedMessage.lastIndexOf(" ");

        if (firstSpace == -1) {
            firstWord = lastWord = trimmedMessage.toUpperCase();
        } else {
            firstWord = trimmedMessage.substring(0, firstSpace).toUpperCase();
            lastWord = trimmedMessage.substring(lastSpace + 1).toUpperCase();
        }

        return feedbackID.substring(0, 2) + entryNumber + "-" + firstWord + "-" + lastWord;
    }

    // Returns formatted feedback details
    public String getFeedbackDetails() {
        return "Feedback ID: " + feedbackID +
               "\nDepartment: " + department +
               "\nMessage: " + message +
               "\nFeedback Hash: " + feedbackHash;
    }
}
