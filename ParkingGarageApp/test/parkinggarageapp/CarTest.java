/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package parkinggarageapp;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {

    // ---------- assertTrue: Valid hour input ----------
    @Test
    public void testValidHours() {
        int validHour = 10;
        assertTrue(validHour >= 1 && validHour <= 24);
    }

    // ---------- assertFalse: Invalid hour inputs ----------
    @Test
    public void testInvalidHoursLow() {
        int invalidHour = 0;
        assertFalse(invalidHour >= 1 && invalidHour <= 24);
    }

    @Test
    public void testInvalidHoursHigh() {
        int invalidHour = 25;
        assertFalse(invalidHour >= 1 && invalidHour <= 24);
    }

    // ---------- assertEquals: Fee calculation ----------
    @Test
    public void testFeeUpTo2Hours() {
        Car car = new Car(2); // Flat fee
        assertEquals(5.0, car.calculateFee(), 0.001);
    }

    @Test
    public void testFeeAt5Hours() {
        Car car = new Car(5); // 5 = $5 + (3 * $2) = $11
        assertEquals(11.0, car.calculateFee(), 0.001);
    }

    @Test
    public void testFeeAt24Hours() {
        Car car = new Car(24); // Max fee is $20
        assertEquals(20.0, car.calculateFee(), 0.001);
    }

    @Test
    public void testFeeEdgeCase3Hours() {
        Car car = new Car(3); // 3 = $5 + (1 * $2) = $7
        assertEquals(7.0, car.calculateFee(), 0.001);
    }
}
