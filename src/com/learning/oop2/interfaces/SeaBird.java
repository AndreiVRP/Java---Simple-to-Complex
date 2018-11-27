package com.learning.oop2.interfaces;

public class SeaBird extends Bird implements CanSwim {

    public SeaBird(String species) {
        super(species);
    }

    @Override
    public void swim() {
        System.out.println(getSpecies() + " is swimming!");
    }
}
