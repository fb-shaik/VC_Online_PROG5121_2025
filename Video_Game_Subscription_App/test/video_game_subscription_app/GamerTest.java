/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package video_game_subscription_app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FS
 */
public class GamerTest {
    
    @Test
    public void testCasualNoExtraHours() {
        Gamer g = new Gamer("Casual", 5);
        assertEquals(5, g.calculateFee(), 0.01);
    }

    @Test
    public void testCompetitiveWithExtraHours() {
        Gamer g = new Gamer("Competitive", 10);
        // Base = 10, extra = (10-5) * $1 = $5 → Total = 15
        assertEquals(15, g.calculateFee(), 0.01);
    }

    @Test
    public void testHardcoreMaxHours() {
        Gamer g = new Gamer("Hardcore", 30);
        // Base = 15, extra = (15-5)*1 + (30-15)*2 = 10 + 30 = 40 → Total = 55
        assertEquals(55, g.calculateFee(), 0.01);
    }

    @Test
    public void testInvalidPlayerType() {
        Gamer g = new Gamer("Beginner", 10);
        assertEquals(-1, g.calculateFee(), 0.01);
    }

    @Test
    public void testInvalidHours() {
        Gamer g = new Gamer("Casual", 40);
        assertEquals(-1, g.calculateFee(), 0.01);
    }

    @Test
    public void testSetterGetter() {
        Gamer g = new Gamer("Casual", 10);
        g.setPlayerType("Hardcore");
        g.setWeeklyHours(20);
        assertEquals("Hardcore", g.getPlayerType());
        assertEquals(20, g.getWeeklyHours());
    }
}

