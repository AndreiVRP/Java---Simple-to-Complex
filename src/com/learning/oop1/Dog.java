package com.learning.oop1;

public class Dog {
    private static int dogsCount;

    // constants can be made public since no one can change it anyways, but it can be set to private if this info is confidential
    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog(String name, String breed, Size size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        //increases the amount of dogs each time a new instance is created
        dogsCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {

    }

    public void getInfo() {
        System.out.println("This is " + this.name + ", and its breed is " + this.breed);
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Woof! Woof!");
                break;
            case AVERAGE:
                System.out.println("Raf! Raf!");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Yip! Yip!");
                break;
            default:
                System.out.println("Undefined");
                break;
            // if you don't use default but forget to include an ENUM case, calling the method with this ENUM value will do nothing (no exception thrown)
            // if there is a default case, calling the method with the ENUM value will trigger the default case
        }


    }

    public static void getDogsCount() {
        if (dogsCount <= 0) {
            System.out.println("Currently, there are no dogs out there!");
        } else if (dogsCount == 1) {
            System.out.println("Currently, there is only one dog out there!");
        } else {
            System.out.println("Currently, there are " + dogsCount + " dogs out there!");
        }
        System.out.println();

    }


}
