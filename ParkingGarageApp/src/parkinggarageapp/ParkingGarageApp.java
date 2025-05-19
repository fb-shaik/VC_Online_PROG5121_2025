/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkinggarageapp;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class ParkingGarageApp {

    public static void main(String[] args) {
        int numberOfCars = 0;

        // Ask for number of cars (must be a number > 0)
        while (numberOfCars <= 0) {
            String input = JOptionPane.showInputDialog("Enter number of cars to process:");
            if (input != null && isDigitsOnly(input)) {
                numberOfCars = Integer.parseInt(input);
            }
            if (numberOfCars <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
            }
        }

        // Process each car
        int count = 1;
        while (count <= numberOfCars) {
            int hours = 0;

            // Ask for parked hours (1 to 24 only)
            while (hours < 1 || hours > 24) {
                String input = JOptionPane.showInputDialog("Car " + count + ": Enter hours parked (1–24):");
                if (input != null && isDigitsOnly(input)) {
                    hours = Integer.parseInt(input);
                }
                if (hours < 1 || hours > 24) {
                    JOptionPane.showMessageDialog(null, "Hours must be between 1 and 24.");
                }
            }

            // Create car object with parked hours
            Car car = new Car(hours);

            // Calculate and display the fee
            double fee = car.calculateFee();
            JOptionPane.showMessageDialog(null,
                "Car " + count + " parked for " + car.getHoursParked() + " hour(s).\nTotal Fee: $" + fee);

            count++;
        }
    }

    // Simple digit check (no trim, no arrays)
    public static boolean isDigitsOnly(String s) {
        if (s == null || s.equals("")) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
}