package com.learning.hello;

public class HelloWorld {
    public static void main(String[] names) {
        sayHello(names);
    }

    public static void sayHello(String[] names) {
        for (String name : names)
        System.out.println("Hello, " + name);
    }
}
