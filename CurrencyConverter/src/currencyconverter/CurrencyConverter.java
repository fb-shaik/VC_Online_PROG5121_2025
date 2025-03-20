/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyconverter;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates
        final double USD_TO_EUR = 0.92;
        final double USD_TO_GBP = 0.75;

        // Ask the user for the amount in USD
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        // Convert to EUR and GBP
        double eur = usd * USD_TO_EUR;
        double gbp = usd * USD_TO_GBP;

        // Display the converted amounts
        System.out.println("Equivalent in EUR: " + eur);
        System.out.println("Equivalent in GBP: " + gbp);

        scanner.close();
    }
}