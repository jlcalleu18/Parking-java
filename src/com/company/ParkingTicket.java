package com.company;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double amountFine;

    final int finePerHour = 25;
    final int additionalHourFine = 10;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer) {
        this.car = car;
        this.officer = officer;
        amountFine = 0;
    }

    public void calculateFine(int minsPurchased) {

        int hours = (car.getMinutesParked() - minsPurchased) / 60;
        if ((car.getMinutesParked() - minsPurchased) % 60 > 0)
            hours++;
        amountFine = finePerHour + (hours - 1) * additionalHourFine;
    }


    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }


    public PoliceOfficer getOfficer() {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public double getAmountFine() {
        return amountFine;
    }

    public void setAmountFine(double amountFine) {
        this.amountFine = amountFine;
    }

}
