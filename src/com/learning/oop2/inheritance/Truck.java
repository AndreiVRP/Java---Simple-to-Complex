package com.learning.oop2.inheritance;

public class Truck extends FuelAuto {
    private int cargoWeight;

    public Truck(String brand, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
        super(brand, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
    }


    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load() {
        System.out.println("The cargo is loaded");
    }

    public void unload() {
        System.out.println("The cargo is unloaded");
    }
}
