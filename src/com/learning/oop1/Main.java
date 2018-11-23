package com.learning.oop1;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog("Rex", "Lab");
        lab.getInfo();
        lab.setName("Charlie");
        lab.getInfo();
        System.out.println(lab.getName());

        Dog shepherd = new Dog("Mike", "Shepherd");
        shepherd.getInfo();
        shepherd.setTail(2);
        shepherd.setTail(0);
        shepherd.setTail(-1);
        shepherd.setTail(1);
        System.out.println("The dog named " + shepherd.getName() + " has " + shepherd.getTail() + " tail");
    }
}
