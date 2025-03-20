/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dailyschedule;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class DailySchedule {
    public static void main(String[] args) {
        // Display header
        JOptionPane.showMessageDialog(null, "My Daily Schedule:\n", "Daily Schedule", JOptionPane.INFORMATION_MESSAGE);

        // Call methods for different parts of the day
        showMorningRoutine();
        showAfternoonActivities();
        showEveningActivities();
    }

    // Method for morning routine (no parameters, no return, displays directly)
    public static void showMorningRoutine() {
        JOptionPane.showMessageDialog(null, "--- Morning Routine ---\n" +
                "7:00 AM - Wake up\n" +
                "7:30 AM - Breakfast\n" +
                "8:30 AM - Study Java programming\n", 
                "Morning Routine", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method for afternoon activities (no parameters, no return, displays directly)
    public static void showAfternoonActivities() {
        JOptionPane.showMessageDialog(null, "--- Afternoon Activities ---\n" +
                "12:00 PM - Lunch\n" +
                "1:00 PM - Exercise\n" +
                "3:00 PM - Continue studying\n", 
                "Afternoon Activities", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method for evening activities (no parameters, no return, displays directly)
    public static void showEveningActivities() {
        JOptionPane.showMessageDialog(null, "--- Evening Activities ---\n" +
                "6:00 PM - Dinner\n" +
                "7:00 PM - Relaxation time\n" +
                "10:00 PM - Go to bed\n", 
                "Evening Activities", JOptionPane.INFORMATION_MESSAGE);
    }
}