package com.learning.oop1;

import com.learning.hello.test.Test;

public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();

        Dog lab = new Dog("Rex", "Lab", Size.UNDEFINED);
        lab.getInfo();
        lab.setName("Charlie");
        lab.getInfo();
        System.out.println(lab.getName());
        lab.bark();

        Dog.getDogsCount();

        Dog shepherd = new Dog("Mike", "Shepherd", Size.BIG);
        shepherd.getInfo();
        System.out.println("The dog named " + shepherd.getName() + " has " + shepherd.TAIL + " tail");
        shepherd.bark();

        Dog.getDogsCount();

        Size s = Size.AVERAGE;
        System.out.println(s.getAbbreviation());
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.toString().toLowerCase());
        Size s1 = s.valueOf("AVERAGE");
        System.out.println(s1);

        System.out.println();
        Size[] sizes = Size.values();
        for (Size size: sizes) {
            System.out.println(size.toString());
        }

        // testing class import
        Test.testMethod();

    }

}
