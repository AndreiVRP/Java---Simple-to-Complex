package com.learning.oop2.nested3;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        System.out.println(phone.getMake());
        System.out.println(phone.getModel());
        System.out.println("Display  - " + phone.getDisplay());

        phone.turnOn();
        phone.call("123456789");
        phone.call("0123456789");

    }
}
