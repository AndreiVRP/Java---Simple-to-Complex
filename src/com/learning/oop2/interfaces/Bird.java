package com.learning.oop2.interfaces;

public class Bird implements CanWalk {
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void walk() {
        System.out.println(getSpecies() + " is walking!");
    }
}
