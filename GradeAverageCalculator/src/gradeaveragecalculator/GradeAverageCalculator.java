/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradeaveragecalculator;

/**
 *
 * @author FS
 */
import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input three subject scores
        System.out.print("Enter first subject score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter second subject score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter third subject score: ");
        double score3 = scanner.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Display the average
        System.out.println("Average score: " + average);

        scanner.close();
    }
}
