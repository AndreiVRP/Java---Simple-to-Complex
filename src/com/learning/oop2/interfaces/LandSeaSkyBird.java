package com.learning.oop2.interfaces;

public class LandSeaSkyBird extends Bird implements CanSwim, CanFly {

    public LandSeaSkyBird(String species) {
        super(species);
    }

    @Override
    public void swim() {
        System.out.println(getSpecies() + " is swimming!");
    }

    @Override
    public void fly() {
        System.out.println(getSpecies() + " is flying!");
    }
}
