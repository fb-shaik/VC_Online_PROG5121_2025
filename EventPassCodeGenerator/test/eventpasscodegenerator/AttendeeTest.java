/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eventpasscodegenerator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AttendeeTest {

    @Test
    public void testGeneratePassCodeFormat() {
        Attendee a = new Attendee("Alice", "TechFest");
        String code = a.generatePassCode();

        // Test that code is uppercase
        assertEquals(code, code.toUpperCase());

        // Test that code length is at least 6 (2 from name + 2 from title + 2 digits)
        assertTrue(code.length() >= 6);
    }

    @Test
    public void testEdgeShortName() {
        Attendee a = new Attendee("A", "Go");
        String code = a.generatePassCode();
        assertTrue(code.startsWith("AGO") || code.startsWith("AGO")); // Since "A" + "Go" (last 2)
    }
}
