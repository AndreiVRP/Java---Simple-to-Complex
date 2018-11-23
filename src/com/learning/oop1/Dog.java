package com.learning.oop1;

public class Dog {
    private static int dogsCount;

    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public Dog(String name, String breed, String size) {
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

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {

        if (tail == 1) {
            this.tail = tail;
            System.out.println("Your dog has a tail!");
        } else if (tail > 1) {
            this.tail = 1;
            System.out.println("The value has been reset to 1. A dog can only have one tail");
        } else {
            System.out.println("Invalid input");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("The size should be one of these: Big. Average, or  Small");
        }
    }

    public void getInfo() {
        System.out.println("This is " + this.name + ", and its breed is " + this.breed);
    }

    public void bark() {
        switch (size) {
            case "Big":
                System.out.println("Woof! Woof!");
                break;
            case "Average":
                System.out.println("Raf! Raf!");
                break;
            case "Small":
                System.out.println("Yip! Yip!");
                break;
            default:
                System.out.println(".....");
                break;
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
