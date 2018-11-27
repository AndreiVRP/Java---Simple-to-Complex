package com.learning.oop2.nested3;

public class RadioModule {
    public RadioModule() {
        System.out.println("Radio module initialized");
    }

    public void call(String number) {
        //local class - inside a method
        int length = 10;

        //use the default modifier when creating a class inside a method (a local class)
        class GSMModule {
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != length) {
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            public void dialIn() {
                if (isValid()) {
                    System.out.println("Calling number " + validNumber);
                } else {
                    System.out.println("Invalid number. Please correct it.");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();
    }
}
