/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventpasscodegenerator;


import java.util.Random;
import javax.swing.JOptionPane;

public class Attendee {
    private String fullName;
    private String eventTitle;

    // Parameterized constructor
    public Attendee(String fullName, String eventTitle) {
        this.fullName = fullName.trim(); // Remove leading/trailing spaces
        this.eventTitle = eventTitle.trim();
    }

    // Getter and Setter for fullName
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName.trim();
    }

    // Getter and Setter for eventTitle
    public String getEventTitle() {
        return eventTitle;
    }
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle.trim();
    }

    // Method to generate passcode
    public String generatePassCode() {
        // Remove internal spaces
        String cleanedName = fullName.replace(" ", "");
        String cleanedEvent = eventTitle.replace(" ", "");

        // Extract first 2 letters of name and last 2 of event title
        String namePart = cleanedName.length() >= 2 ? cleanedName.substring(0, 2) : cleanedName;
        String eventPart = cleanedEvent.length() >= 2 ? 
                           cleanedEvent.substring(cleanedEvent.length() - 2) : cleanedEvent;

        // Generate random number between 10–99
        Random rand = new Random();
        int randomNum = rand.nextInt(90) + 10;

        // Combine and convert to uppercase
        String passcode = (namePart + eventPart + randomNum).toUpperCase();
        return passcode;
    }
    
    // Static method to run the input/output interaction
    public static void run() {
        int option;
        do {
            String name = JOptionPane.showInputDialog("Enter your full name:");
            String event = JOptionPane.showInputDialog("Enter the event title:");

            Attendee attendee = new Attendee(name, event);
            String code = attendee.generatePassCode();

            JOptionPane.showMessageDialog(null, 
                "Welcome, " + attendee.getFullName() + "!\nYour event passcode is: " + code);

            option = JOptionPane.showConfirmDialog(null, "Generate another passcode?", "Continue", JOptionPane.YES_NO_OPTION);
        } while (option == JOptionPane.YES_OPTION);
    }
}
