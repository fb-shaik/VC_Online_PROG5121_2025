/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timeconverter;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for time in hours
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        // Convert to minutes and seconds
        int minutes = hours * 60;
        int seconds = hours * 3600;

        // Display the converted values
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        scanner.close();
    }
}