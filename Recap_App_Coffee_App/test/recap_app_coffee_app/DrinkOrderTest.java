/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package recap_app_coffee_app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FS
 */
public class DrinkOrderTest {
    
    public DrinkOrderTest() {
    }

    @Test
    public void testCalculateTotal() {
        DrinkOrder order = new DrinkOrder("coffee", 2);
        assertEquals(60.00, order.calculateTotal(), 0.001);
        
    }

    @Test
    public void testIsValidDrink() {
            assertTrue(DrinkOrder.isValidDrink("coffee"));
        assertTrue(DrinkOrder.isValidDrink("TEA"));
        assertTrue(DrinkOrder.isValidDrink("Latte"));
        assertFalse(DrinkOrder.isValidDrink("cola"));
        assertFalse(DrinkOrder.isValidDrink(""));
        assertFalse(DrinkOrder.isValidDrink(null));
        
    }

    @Test
    public void testIsValidQuantity() {
        assertTrue(DrinkOrder.isValidQuantity(1));
        assertTrue(DrinkOrder.isValidQuantity(100));
        assertFalse(DrinkOrder.isValidQuantity(0));
        assertFalse(DrinkOrder.isValidQuantity(-5));
        
    }

    @Test
    public void testGetDrink() {
    }

    @Test
    public void testGetQuantity() {
    }

    @Test
    public void testGetPricePerUnit() {
    }
    
}
/*
    Stackoverflow example
    Author/Username (Year) Title of the post (or question). [Online] Stack Overflow. Available at: URL (Accessed: date).

    Jon Skeet (2021) How to compare two objects in C#. [Online] Stack Overflow. Available at: https://stackoverflow.com/questions/1234567 (Accessed: 22 April 2025).

    Github example
    Author/Username (Year) Title or description of code. [Source code] Available at: URL (Accessed: date).
    
    torvalds (2020) Linux kernel source code. [Source code] Available at: https://github.com/torvalds/linux (Accessed: 22 April 2025).


*/
