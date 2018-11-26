package com.learning.oop2.inheritance;

public class FuelAuto extends Auto {
    private int availablePetrol;
    private int tankVolume;

    public FuelAuto(String brand, String model, Engine engine, int availablePetrol, int tankVolume) {
        super(brand, model, engine);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int petrolVolume) {
        availablePetrol += petrolVolume;
        System.out.println("The available petrol volume is " + availablePetrol);
    }



    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
