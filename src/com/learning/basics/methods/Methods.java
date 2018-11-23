package com.learning.basics.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Alex");
        printMessage("John");
        printMessage("Mike");
        String first = calcRectSquare(5, 5);
        String second = calcRectSquare(9, 9);
        System.out.println(first);
        System.out.println(second);
        int a = calcSquare(5);
        int b = calcSquare(9);
        System.out.println("The sum is " + a + b + " - concatinated"); //everything is concatinated
        System.out.println("The sum is " + (a + b) + " - math"); // math operation first, conc second
        System.out.println("The sum is " + (calcSquare(7) + calcSquare(8)) + " - calling methods directly");

    }

    // methods to implement the DRY principle

    //returns nothing - void
    static void printMessage(String name) {
        System.out.println("Hi, " + name);
    }

    //returns a String value
    static String calcRectSquare(int x, int y) {
        int square = x * y;
        return "The square is " + square;
    }

    //returns an Int value
    static int calcSquare(int x) {
        return x * x;
    }
}
