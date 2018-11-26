package com.learning.oop2.interfaces;

public class SkyBird extends Bird implements CanFly {

    public SkyBird(String species) {
        super(species);
    }

    @Override
    public void fly() {
        System.out.println(getSpecies() + " is flying!");
    }

}