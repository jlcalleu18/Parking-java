package com.company;

public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    @Override
    public String toString() {
        return "ParkingMeter{" +
                "minutesPurchased=" + minutesPurchased +
                '}';
    }
}