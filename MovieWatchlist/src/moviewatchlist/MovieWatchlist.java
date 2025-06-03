/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moviewatchlist;

import javax.swing.JOptionPane;

public class MovieWatchlist {
    public static void main(String[] args) {
        // Create an array to store up to 5 movie titles
        String[] movies = new String[5];
        int count = 0; // Counter to keep track of how many movies were added

        // Loop to prompt the user for movie titles
        while (count < 5) {
            String movie = JOptionPane.showInputDialog("Enter a movie title (or type 'done' to finish):");

            // Check for empty input
            if (movie == null || movie.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Movie title cannot be empty.");
                continue;
            }

            // Check if user wants to stop input
            if (movie.equalsIgnoreCase("done")) {
                break;
            }

            // Check for duplicate entry
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (movies[i].equalsIgnoreCase(movie)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                JOptionPane.showMessageDialog(null, "This movie is already in your watchlist.");
                continue;
            }

            // Store the movie title and increment the counter
            movies[count] = movie;
            count++;
        }

        // Build a formatted string to display the watchlist
        StringBuilder summary = new StringBuilder("You have " + count + " movie(s) in your watchlist:\n");
        for (int i = 0; i < count; i++) {
            summary.append((i + 1) + ". " + movies[i] + "\n");
        }

        // Display the summary to the user
        JOptionPane.showMessageDialog(null, summary.toString());
    }
}
