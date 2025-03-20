/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalinfoform;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class PersonalInfoForm {
    public static void main(String[] args) {
        // Ask for user information
        String name = JOptionPane.showInputDialog("Enter your name:");
        String ageInput = JOptionPane.showInputDialog("Enter your age:");
        int age = Integer.parseInt(ageInput);
        
        String color = JOptionPane.showInputDialog("Enter your favorite color:");
        String heightInput = JOptionPane.showInputDialog("Enter your height in meters:");
        double height = Double.parseDouble(heightInput);

        // Display the information back to the user
        JOptionPane.showMessageDialog(null, 
            "----- Your Information -----\n" +
            "Name: " + name + "\n" +
            "Age: " + age + "\n" +
            "Favorite Color: " + color + "\n" +
            "Height: " + height + " meters",
            "Personal Information", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}