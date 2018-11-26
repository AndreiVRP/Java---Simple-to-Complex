package com.learning.oop2.composition;
import com.learning.oop2.inheritance.*;

public class CompositionMain {
    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900, 12);
        System.out.println(truckEngine.toString());
        System.out.println("The amount of pistons is " + truckEngine.getPistonsAmount());

        // using the newly-created Engine instance as an argument when creating a new Truck instance is a case of COMPOSITION as well

        Truck truck = new Truck("MAN", "TGS", truckEngine, 300, 500, 10000);
        System.out.println(truck.getBrand());
        System.out.println("The amount of pistons is " + truck.getEngine().getPistonsAmount());
        truck.start();
        truck.accelerate(50);
        truck.stop();
        truck.fuelUp(100);
        truck.load();
        truck.unload();
        System.out.println();
    }
}
