package com.company;

public class ParkingTicket {
    private ParkedCar car;
    private ParkingMeter minutes;
    private PoliceOfficer officer;
    private double amountFine;


    public ParkingTicket(ParkedCar car, ParkingMeter minutes, PoliceOfficer officer) {
        this.car = car;
        this.minutes = minutes;
        this.officer = officer;
    }

    public void calculateFine(){

    }
}
