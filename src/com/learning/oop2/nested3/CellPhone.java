package com.learning.oop2.nested3;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    public  interface AbstractPhoneButton {
        //used here just for the sake of showing how to use anonymous classes
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton() {
        button = new AbstractPhoneButton() { // we cannot created an instance of an interface -> this is just an anonymous class implementing the interface
            @Override
            public void click() {
                System.out.println("CLICK");
            }
        }; //the semicolon is used here since this is an expression

    }

    public void call(String number) {
        button.click();
        gsm.call(number);
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
