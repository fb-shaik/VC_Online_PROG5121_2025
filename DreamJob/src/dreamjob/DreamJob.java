/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dreamjob;

/**
 *
 * @author FS
 */

// Program: Dream Job App
// Objective: Encourage students to declare and display career-related variables

public class DreamJob {
    public static void main(String[] args) {
        // Declare string variables
        String jobTitle = "Software Engineer";
        String company = "Google";
        String jobLocation = "San Francisco, USA";

        // Declare integer variable for years of experience needed
        int yearsOfExperienceNeeded = 2;

        // Declare double variable for salary expectation
        double salaryExpectation = 120000.00;

        // Declare boolean variable to check if remote work is available
        boolean remoteJobAvailable = true;

        // Print dream job details
        System.out.println("Dream Job");
        System.out.println("---------");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Location: " + jobLocation);
        System.out.println("Years of Experience Needed: " + yearsOfExperienceNeeded);
        System.out.println("Salary Expectation: $" + salaryExpectation);
        System.out.println("Remote Work Available? " + remoteJobAvailable);
    }
}
