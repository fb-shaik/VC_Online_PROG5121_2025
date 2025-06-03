/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprogresstracker;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class StudentProgressTracker {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] scores = new int[5];

        // Collect student names and scores
        getStudentData(names, scores);

        // Calculate average score
        double average = calculateAverage(scores);

        // Find top scorer
        String topStudent = findTopScorer(names, scores);

        // Build summary
        StringBuilder summary = new StringBuilder("Student Scores:\n");
        for (int i = 0; i < names.length; i++) {
            summary.append(names[i]).append(": ").append(scores[i]).append("\n");
        }
        summary.append("\nClass Average: ").append(average);
        summary.append("\nTop Scorer: ").append(topStudent);

        // Display summary
        JOptionPane.showMessageDialog(null, summary.toString());
    }

    // Method to get student names and scores
    public static void getStudentData(String[] names, int[] scores) {
        for (int i = 0; i < names.length; i++) {
            String name;
            do {
                name = JOptionPane.showInputDialog("Enter name for student " + (i + 1) + ":");
            } while (name == null || name.trim().isEmpty());

            names[i] = name;

            String input;
            int score;
            while (true) {
                input = JOptionPane.showInputDialog("Enter score for " + name + ":");
                try {
                    score = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
            scores[i] = score;
        }
    }

    // Method to calculate average score
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / (double) scores.length;
    }

    // Method to find top scorer
    public static String findTopScorer(String[] names, int[] scores) {
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }
}
