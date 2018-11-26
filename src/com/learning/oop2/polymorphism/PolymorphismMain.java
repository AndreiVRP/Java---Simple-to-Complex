package com.learning.oop2.polymorphism;

import com.learning.oop2.inheritance.*;

public class PolymorphismMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900, 12);
        Engine busEngine = new Engine(3.0, EngineType.DIESEL, 450, 12);
        Engine carEngine = new Engine(2.0, EngineType.DIESEL, 150, 6);


        Auto truck = new Truck("MAN", "TGS", truckEngine, 300, 500, 10000);
        Auto bus1 = new Bus("Mersedez", "Sprinter", busEngine, 20, 75, 12);
        Bus bus2 = new Bus("Mersedez", "Sprinter", busEngine, 20, 75, 12);
        FuelAuto bus3 = new Bus("Mersedez", "Sprinter", busEngine, 20, 75, 12);
        Auto electricCar = new ElectricCar("Tesla", "Model S", 100, 4);
        Auto auto = new Auto("WV", "Polo", carEngine);

        bus1.start();
        bus1.stop();
//        ((Bus) bus1).fuelUp(); // in this case, the fuelUp method is available only through type casing - if you cast Auto down to Bus
        // the fuelUp method was declared only in FuelAuto and that's why it's not available for Auto

        bus2.start();
        bus2.stop();
        bus2.fuelUp();

        bus3.start();
        bus3.stop();
        bus3.fuelUp(150); // the fuelUp method was declared in FuelAuto and that's why it's available here

        useTextDivider();

        runAuto(truck);
        runAuto(bus1);
        runAuto(bus2);
        runAuto(bus3);
        runAuto(electricCar);
        runAuto(auto);
        // the stop / start method will be chosen depending on the type of object passed to the runAuto method as an argument
        // the parameter of the method is a parent class
        // the argument can be an instance of either the parent class or one of its sub-classes
        // that's polymorphism

    }

    public static void runAuto(Auto auto) {
        auto.start();
        auto.stop();
        //we cannot call a method of a sub-class if it's not defined in the parent class
        //however, we can use type casing to circumvent this restriction safely
        if (auto instanceof FuelAuto) {
            FuelAuto fuelAuto = (FuelAuto) auto;
            fuelAuto.fuelUp(100);
        }
    }

    public static void useTextDivider() {
        System.out.println();
        System.out.println("-----*****-----");
        System.out.println();
    }
}
