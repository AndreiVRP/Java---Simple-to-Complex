package com.learning.oop2.inheritance;

public class ElectricCar extends Auto {
    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String brand, String model, int batteryVolume, int passengersNumber) {
        super(brand, model, EngineType.ELECTRIC);
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
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
