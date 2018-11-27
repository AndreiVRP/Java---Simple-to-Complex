package com.learning.oop2.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "VNL 300", new Engine(), 300, 500, 10000);
        System.out.println(truck.getBrand());
        truck.start();
        truck.accelerate(50);
        truck.stop();
        truck.fuelUp(100);
        truck.load();
        truck.unload();
        System.out.println();

        Bus bus = new Bus("Mersedez", "Sprinter", new Engine(), 20, 75, 12);
        bus.fuelUp();
        bus.pickUpPassengers(10);
        bus.start();
        bus.accelerate(50);
        bus.stop();
        bus.releaseUpPassengers(10);
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 100, 4);
        electricCar.start();
        electricCar.accelerate(90);
        electricCar.stop();
        electricCar.charge();
    }
}
