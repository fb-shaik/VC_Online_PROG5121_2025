/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dreamtraveldestination;

/**
 *
 * @author FS
 */

// Program: Dream Travel Destination App
// Objective: Declare and display travel details using multiple variable types

public class DreamTravelDestination {
    public static void main(String[] args) {
        // Declare string variables
        String destination = "Japan";
        String attraction = "Mount Fuji";
        String reason = "I love the culture, food, and beautiful landscapes.";

        // Declare double variable for estimated travel cost
        double travelCost = 2500.50;

        // Declare boolean to check if the person has visited before
        boolean hasVisitedBefore = false;

        // Print travel details
        System.out.println("Dream Travel Destination");
        System.out.println("------------------------");
        System.out.println("I would love to visit " + destination + ".");
        System.out.println("One of the main attractions I want to see is " + attraction + ".");
        System.out.println("Why? " + reason);
        System.out.println("Estimated Travel Cost: $" + travelCost);
        System.out.println("Have I visited before? " + hasVisitedBefore);
    }
}
