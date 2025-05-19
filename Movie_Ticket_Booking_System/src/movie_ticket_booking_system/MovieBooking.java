/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_ticket_booking_system;

import javax.swing.*;

public class MovieBooking {
    private String fullName;
    private String movieTitle;
    private String seat;

    // Constructor
    public MovieBooking(String fullName, String movieTitle, String seat) {
        this.fullName = fullName.trim();
        this.movieTitle = movieTitle.trim();
        this.seat = seat.trim();
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName.trim();
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat.trim();
    }

    // Helper method to censor a word if it's inappropriate
    private String censorWord(String word) {
        if (word.equalsIgnoreCase("dumb")) {
            return "****";
        }
        return word;
    }

    // Method to convert a raw movie title into title case manually
    private String formatMovieTitle(String title) {
        String result = "";
        int i = 0;

        // Loop through characters manually
        while (i < title.length()) {
            // Skip leading spaces
            while (i < title.length() && title.charAt(i) == ' ') {
                i++;
            }

            // Extract one word
            String word = "";
            while (i < title.length() && title.charAt(i) != ' ') {
                word += title.charAt(i);
                i++;
            }

            if (!word.isEmpty()) {
                word = word.toLowerCase();         // lowercase entire word
                word = censorWord(word);           // filter inappropriate word

                // Capitalize first letter (if not censored)
                if (!word.equals("****")) {
                    char first = Character.toUpperCase(word.charAt(0));
                    String rest = word.length() > 1 ? word.substring(1) : "";
                    word = first + rest;
                }

                if (!result.isEmpty()) {
                    result += " ";
                }
                result += word;
            }
        }

        return result;
    }

    // Method to get initials without arrays
    private String getInitials(String name) {
        String initials = "";
        boolean newWord = true;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == ' ') {
                newWord = true;
            } else if (newWord) {
                initials += Character.toUpperCase(ch);
                newWord = false;
            }
        }

        return initials;
    }

    // Booking confirmation message generator
    public String generateConfirmation() {
        String titleFormatted = formatMovieTitle(movieTitle);
        String initials = getInitials(fullName);

        return "Booking confirmed for " + initials +
               "\nSeat: " + seat +
               "\nMovie: " + titleFormatted;
    }

    // Interactive user dialog runner
    public static void run() {
        int option;

        do {
            String name = JOptionPane.showInputDialog("Enter your full name:");
            String movie = JOptionPane.showInputDialog("Enter movie title:");
            String seat = JOptionPane.showInputDialog("Enter seat number:");

            MovieBooking booking = new MovieBooking(name, movie, seat);
            String message = booking.generateConfirmation();

            JOptionPane.showMessageDialog(null, message);

            option = JOptionPane.showConfirmDialog(null, "Book another ticket?", "Continue", JOptionPane.YES_NO_OPTION);
        } while (option == JOptionPane.YES_OPTION);
    }
}
