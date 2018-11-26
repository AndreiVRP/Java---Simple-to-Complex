package com.learning.oop2.inheritance;

public class Auto {
    private String brand;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String brand, String model, EngineType engineType) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("The auto is starting!");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("The auto has stopped");
    }

    public void accelerate(int kph) {
        currentSpeed += kph;
        System.out.println("The current speed is " + currentSpeed + "kph");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
