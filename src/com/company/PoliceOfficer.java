package com.company;

public class PoliceOfficer {
    private String policeName;
    private String badgeNumber;
    private ParkingTicket ticket;

    public PoliceOfficer() {
    }

    public PoliceOfficer(String policeName, String badgeNumber) {
        this.policeName = policeName;
        this.badgeNumber = badgeNumber;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
    public void generateParkingTicket() {
        System.out.println("Car issued to: " + ticket.getCar());
        System.out.println("Issued by officer: " + ticket.getOfficer().getPoliceName()+", Badge Number: " + ticket.getOfficer().getBadgeNumber());
        System.out.println("Fine amount: " + ticket.getAmountFine());
    }
    public void examine(ParkedCar car, ParkingMeter meter) {
        if (car.getMinutesParked() > meter.getMinutesPurchased()) {
            ticket = new ParkingTicket(car, this);
            ticket.calculateFine(meter.getMinutesPurchased());
            System.out.println("\n-----------------" + "\n" + "Ticket Generated:" + "\n" + "-----------------");
            generateParkingTicket();
        }else {
            System.out.println("\n-----------------" + "\n" + "No Ticket Needed:" + "\n" + "-----------------");

        }
    }



}
