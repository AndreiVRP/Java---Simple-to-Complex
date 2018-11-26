package com.learning.oop2.inheritance;

public class Bus extends FuelAuto {
    int passengersNumber;

    public Bus(String brand, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengersNumber) {
        super(brand, model, engineType, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
    }

    //method overloading
    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    //method overriding


    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void pickUpPassengers(int passengers) {
        passengersNumber += passengers;
        System.out.println("Picking up " + passengers + " passengers");
    }

    public void releaseUpPassengers(int passengers) {
        if (isRunning) {
            stop();
        }
        passengersNumber -= passengers;
        System.out.println("Releasing " + passengers + " passengers");
    }
}
