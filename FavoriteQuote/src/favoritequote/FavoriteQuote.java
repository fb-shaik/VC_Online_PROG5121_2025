package favoritequote;

/**
 *
 * @author FS
 */

// Program: Favorite Quote App
// Objective: Use constants and string variables to display a famous quote

public class FavoriteQuote {
    public static void main(String[] args) {
        // Declare a final constant for the author's name
        final String AUTHOR = "Albert Einstein";

        // Declare a string variable for the quote
        String quote = "Life is like riding a bicycle. To keep your balance, you must keep moving.";

        // Declare integer variable for the year of the quote
        int yearSaid = 1930;

        // Declare a boolean to indicate if it's a motivational quote
        boolean isMotivational = true;

        // Print the quote details
        System.out.println("Here is a famous quote:");
        System.out.println("\"" + quote + "\" - " + AUTHOR + " (" + yearSaid + ")");
        System.out.println("Is this a motivational quote? " + isMotivational);
    }
}
