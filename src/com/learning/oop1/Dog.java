package com.learning.oop1;

public class Dog {
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
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

    public void getInfo() {
        System.out.println("This is " + this.name + ", and its breed is " + this.breed);
    }

}
