package com.learning.oop2.inheritance;
import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double volume;
    private EngineType engineType; // composition
    private int power;
    private int pistonsAmount;
    private List<Piston> pistons  = new ArrayList<>(); // composition

    public Engine() {
    }

    public Engine(double volume, EngineType engineType, int power, int pistonsAmount) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        this.pistonsAmount = pistonsAmount;
        for(int i = 1; i <= this.pistonsAmount; i++) {
            this.pistons.add(new Piston(0.5, i));
        }
    }

    public double getVolume() {
        return volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    public int getPistonsAmount() {
        return pistonsAmount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", engineType=" + engineType +
                ", power=" + power +
                ", pistonsAmount=" + pistonsAmount +
//                ", pistons=" + pistons +
                '}';
    }
}
