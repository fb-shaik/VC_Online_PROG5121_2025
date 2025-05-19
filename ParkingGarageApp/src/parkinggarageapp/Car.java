/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkinggarageapp;



// ----------------------------
// Car class with fee logic
// ----------------------------
class Car {
    private int hoursParked;

    // Constructor to set parked hours
    public Car(int hoursParked) {
        this.hoursParked = hoursParked;
    }

    // Getter
    public int getHoursParked() {
        return hoursParked;
    }

    // Setter
    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }

    // Fee calculation
    public double calculateFee() {
        double fee = 5.0;
        if (hoursParked > 2) {
            fee += (hoursParked - 2) * 2.0;
        }
        if (fee > 20.0) {
            fee = 20.0;
        }
        return fee;
    }
}