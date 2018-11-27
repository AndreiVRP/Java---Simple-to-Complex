package com.learning.oop2.inheritance;

public class ElectricCar extends Auto {
    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String brand, String model, int batteryVolume, int passengersNumber) {
        super(brand, model, new Engine()); // empty engine created, to be replaced with an electric engine class
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public void start() {
        //add the remaining lines
        System.out.println("The electric car is starting");
    }

    @Override
    public void stop() {
        System.out.println("The electric car has stopped");
    }

    public void charge() {
        System.out.println("The battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
