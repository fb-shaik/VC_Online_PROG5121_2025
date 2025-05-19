/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video_game_subscription_app;

/**
 *
 * @author FS
 */
public class Gamer {
    private String playerType;
    private int weeklyHours;

    // Parameterized constructor to initialize fields
    public Gamer(String playerType, int weeklyHours) {
        this.playerType = playerType;
        this.weeklyHours = weeklyHours;
    }

    // Getter for playerType
    public String getPlayerType() {
        return playerType;
    }

    // Setter for playerType
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    // Getter for weeklyHours
    public int getWeeklyHours() {
        return weeklyHours;
    }

    // Setter for weeklyHours
    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    // Method to calculate monthly subscription fee
    public double calculateFee() {
        double baseFee = 0;

        // Determine base fee based on player type
        switch (playerType.toLowerCase()) {
            case "casual":
                baseFee = 5;
                break;
            case "competitive":
                baseFee = 10;
                break;
            case "hardcore":
                baseFee = 15;
                break;
            default:
                return -1; // invalid player type
        }

        double additionalFee = 0;

        // Add additional fee based on weekly hours
        if (weeklyHours > 30 || weeklyHours < 0) {
            return -1; // invalid hours
        }

        if (weeklyHours > 15) {
            additionalFee += (weeklyHours - 15) * 2;
            additionalFee += 10 * 1; // 6–15 hours: 10 hours at $1
        } else if (weeklyHours > 5) {
            additionalFee += (weeklyHours - 5) * 1;
        }

        return baseFee + additionalFee;
    }
}