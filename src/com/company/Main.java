package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ParkedCar car = new ParkedCar("BMW", "M850 Coupe", "White", "AC 123234", 120);
        ParkingMeter meter = new ParkingMeter(30);
        PoliceOfficer officer =  new PoliceOfficer("WILLIAMS SMITH","AB12345");
        officer.examine(car, meter);


    }

}
