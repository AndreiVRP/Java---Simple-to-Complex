package com.learning.oop2.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfacesMain {
    public static void main(String[] args) {
        Bird ostrich = new Bird("Ostrich");
        System.out.println(ostrich.getSpecies());
        ostrich.walk();

        SeaBird penguin = new SeaBird("Penguin");
        System.out.println(penguin.getSpecies());
        penguin.swim();
        penguin.walk();

        SkyBird eagle = new SkyBird("Eagle");
        System.out.println(eagle.getSpecies());
        eagle.fly();
        eagle.walk();

        LandSeaSkyBird duck = new LandSeaSkyBird("Duck");
        System.out.println(duck.getSpecies());
        duck.swim();
        duck.walk();
        duck.fly();

        // creating and populating an array list based on an interface
        List<CanFly> skybirds = new ArrayList<>();
        skybirds.add(eagle);
        skybirds.add(duck);
//        skybirds.add(ostrich); //cannot add ostrich because this bird species cannot fly
        System.out.println();

        for (CanFly skybird : skybirds) {
            skybird.fly();
        }

        System.out.println();

        printLandBird(ostrich, penguin, eagle, duck);

        //static methods in interfaces
        StaticMethods.testStaticMethod();
    }

    public static void printLandBird(CanWalk... birds) {

        for (CanWalk bird : birds) {
            bird.walk();
            bird.layEggs();
        }

    }
}
