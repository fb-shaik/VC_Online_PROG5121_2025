/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bugreportsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class BugReportSystem {
    public static void main(String[] args) {
        BugReport[] reports = new BugReport[3];
        int highSeverityCount = 0;

        // Collect 3 bug reports
        for (int i = 0; i < 3; i++) {
            String name, description, severity;

            // Validate reporter name
            do {
                name = JOptionPane.showInputDialog("Enter reporter name for bug " + (i + 1) + ":");
            } while (name == null || name.trim().isEmpty());

            // Validate issue description
            do {
                description = JOptionPane.showInputDialog("Enter issue description:");
            } while (description == null || description.trim().isEmpty());

            // Validate severity level
            while (true) {
                severity = JOptionPane.showInputDialog("Enter severity (Low, Medium, High):");
                if (severity != null && (severity.equalsIgnoreCase("Low") ||
                                         severity.equalsIgnoreCase("Medium") ||
                                         severity.equalsIgnoreCase("High"))) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid severity. Please enter Low, Medium, or High.");
                }
            }

            // Create and store the bug report
            BugReport report = new BugReport(name, description, severity);
            reports[i] = report;

            // Count high severity reports
            if (severity.equalsIgnoreCase("High")) {
                highSeverityCount++;
            }
        }

        // Build summary output
        StringBuilder summary = new StringBuilder("Bug Reports Summary:\n\n");
        for (int i = 0; i < reports.length; i++) {
            summary.append("Report ").append(i + 1).append(": ").append(reports[i].getReportLine()).append("\n");
        }

        summary.append("\nTotal Reports: ").append(reports.length);
        summary.append("\nHigh Severity Reports: ").append(highSeverityCount);

        if (highSeverityCount > 1) {
            summary.append("\nWARNING: Multiple high-severity issues detected.");
        }

        JOptionPane.showMessageDialog(null, summary.toString());
    }
}
