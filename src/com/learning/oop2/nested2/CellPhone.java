package com.learning.oop2.nested2;

public class CellPhone {
    private String make;
    private String model;
    private Display display;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
    }

    private void initDisplay() {
        //don't create a new display variable
        //initialize the display property of the CellPhone instead
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }

}
