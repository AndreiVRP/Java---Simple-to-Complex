package com.learning.oop1;
import com.learning.oop1.Dog;

public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();

        Dog lab = new Dog("Rex", "Lab", "Average ");
        lab.getInfo();
        lab.setName("Charlie");
        lab.getInfo();
        System.out.println(lab.getName());
        lab.bark();

        Dog.getDogsCount();

        Dog shepherd = new Dog("Mike", "Shepherd", "Almost Big");
        shepherd.getInfo();
        shepherd.setTail(2);
        shepherd.setTail(0);
        shepherd.setTail(-1);
        shepherd.setTail(1);
        System.out.println("The dog named " + shepherd.getName() + " has " + shepherd.getTail() + " tail");
        shepherd.bark();
        shepherd.setSize("Big");
        shepherd.bark();

        Dog.getDogsCount();


    }
}
