package com.company;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNum;
    private int minutesParked;

    public ParkedCar(String make, String model, String color, String licenseNum, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNum = licenseNum;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    @Override
    public String toString() {
        return "ParkedCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                ", minutesParked=" + minutesParked +
                '}';
    }
}
