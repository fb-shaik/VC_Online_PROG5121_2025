/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for weight in kg
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        // Ask the user for height in meters
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI result
        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}