package com.learning.oop2.nested2;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        System.out.println(phone.getMake());
        System.out.println(phone.getModel());
        System.out.println("Display" + phone.getDisplay());

        phone.turnOn();
        Display display = phone.getDisplay();
//        Display.Pixel pixel = new Display.Pixel(123, 123, Display.Color.GREEN); //this how we create a an instance of a NESTED STATIC class (to access it, the nested class should be public)
        //however, we should make this nested class private (non-static) to reduce the access to the Pixel class only to an instance of the Display class (no pixel exists outside of a display)

    }
}
