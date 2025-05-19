/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package movie_ticket_booking_system;
import static org.junit.Assert.*;
import org.junit.Test;

public class MovieBookingTest {

    @Test
    public void testCensoredTitle() {
        // The word "dumb" should be censored as "****"
        MovieBooking booking = new MovieBooking("Alice Smith", "the dumb knight", "B3");
        String result = booking.generateConfirmation();

        assertTrue("Censored word should be replaced", result.contains("****"));
    }

    @Test
    public void testTitleCaseFormatting() {
        // All words should be capitalized except censored ones
        MovieBooking booking = new MovieBooking("Bob", "silent hill", "D5");
        String result = booking.generateConfirmation();

        assertTrue("Title should contain 'Silent'", result.contains("Silent"));
        assertTrue("Title should contain 'Hill'", result.contains("Hill"));
    }

    @Test
    public void testInitialsNoArrays() {
        // Expect initials from each word in the name
        MovieBooking booking = new MovieBooking("charlie brown", "Any", "A1");
        String result = booking.generateConfirmation();

        assertTrue("Should contain initials CB", result.contains("CB"));
    }

    @Test
    public void testWhitespaceTrimming() {
        MovieBooking booking = new MovieBooking("   Dana Fox  ", "  the game  ", "  Z7  ");

        assertEquals("Dana Fox", booking.getFullName());
        assertEquals("the game", booking.getMovieTitle());
        assertEquals("Z7", booking.getSeat());
    }

    @Test
    public void testSingleWordName() {
        MovieBooking booking = new MovieBooking("Emily", "test", "A9");
        String result = booking.generateConfirmation();

        assertTrue("Should include initial E", result.contains("E"));
    }
}
