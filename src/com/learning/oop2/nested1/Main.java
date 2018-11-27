package com.learning.oop2.nested1;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        System.out.println(phone.getMake());
        System.out.println(phone.getModel());
        System.out.println("Display" + phone.getDisplay());

        phone.turnOn();
        Display display = phone.getDisplay();
        Display.Pixel pixel = display.new Pixel(100,100, Display.Color.RED);
    }
}
