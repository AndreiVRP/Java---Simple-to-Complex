package com.learning.oop2.inheritance;

public class Bus extends FuelAuto {
    int passengersNumber;

    public Bus(String brand, String model, Engine engine, int availablePetrol, int tankVolume, int passengersNumber) {
        super(brand, model, engine, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
    }

    //method overloading
    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    //method overriding (Ctrl + O)

    @Override
    public void start() {
        //add the remaining lines
        System.out.println("The bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("The bus has stopped");
    }

    @Override
    public void fuelUp(int petrolVolume) {
        super.fuelUp(petrolVolume);
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
