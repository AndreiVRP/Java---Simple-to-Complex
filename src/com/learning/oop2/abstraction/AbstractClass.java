package com.learning.oop2.abstraction;

public abstract class AbstractClass {
    // abstract classes cannot (?????) be inherited from since they are considered incomplete
    public abstract void abstractMethod(); //abstract methods don't require a body
    // classes with abstract methods must be abstract  as well
    // sub-classes that extend an abstract class must decide on the implementation of the abstract functionality
    public static void doSomething() {
        System.out.println("Say hi!");
    }

}
