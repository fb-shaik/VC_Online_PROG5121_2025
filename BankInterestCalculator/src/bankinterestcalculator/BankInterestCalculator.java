/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankinterestcalculator;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display the interest earned
        System.out.println("Simple Interest: " + interest);

        scanner.close();
    }
}