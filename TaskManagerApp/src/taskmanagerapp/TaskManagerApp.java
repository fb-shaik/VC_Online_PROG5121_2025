/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskmanagerapp;

/**
 *
 * @author FS
 */
import javax.swing.JOptionPane;

public class TaskManagerApp {
    public static void main(String[] args) {
        String[] taskNames = new String[5];
        String[] taskStatuses = new String[5];
        int count = 0;

        // Collect up to 5 task names
        while (count < 5) {
            String task = JOptionPane.showInputDialog("Enter a task name (or type 'done' to finish):");

            if (task == null || task.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Task name cannot be empty.");
                continue;
            }

            if (task.equalsIgnoreCase("done")) {
                break;
            }

            taskNames[count] = task;
            taskStatuses[count] = "Pending"; // Initialize all tasks with "Pending" status
            count++;
        }

        // Allow user to mark a task as completed
        String markTask = JOptionPane.showInputDialog("Enter the name of a task to mark as completed:");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (taskNames[i].equalsIgnoreCase(markTask)) {
                taskStatuses[i] = "Completed";
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found in the list.");
        }

        // Display all tasks with their statuses
        StringBuilder report = new StringBuilder("Your Task List:\n");
        for (int i = 0; i < count; i++) {
            report.append((i + 1) + ". " + taskNames[i] + " - " + taskStatuses[i] + "\n");
        }

        JOptionPane.showMessageDialog(null, report.toString());
    }
}
