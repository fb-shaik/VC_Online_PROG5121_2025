/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bugreportsystem;

/**
 *
 * @author FS
 */
class BugReport {
    String reporterName;
    String issueDescription;
    String severityLevel;

    // Constructor to initialize bug report
    public BugReport(String name, String description, String severity) {
        this.reporterName = name;
        this.issueDescription = description;
        this.severityLevel = severity;
    }

    // Returns a formatted bug report line
    public String getReportLine() {
        return reporterName + " - \"" + issueDescription + "\" [" + severityLevel + "]";
    }
}
