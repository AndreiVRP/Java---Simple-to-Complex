package com.learning.oop2.abstraction;

public abstract class AbstractionMain {
    public static void main(String[] args) {
//        AbstractClass abstractObject = new AbstractClass();
        SubClass1 first = new SubClass1();
        SubClass2 second = new SubClass2();
        callAbstractMethod(first);
        callAbstractMethod(second);
        AbstractClass.doSomething();
        System.out.println();
        first.doSomethingNew();
        second.doSomethingNew();
    }

    public static void callAbstractMethod(AbstractClass abstractClass) {
        abstractClass.abstractMethod();
        // different implementation which each subclass inheriting from an abstract class
        // the system can define the sub-type of the argument passed (the parameter is the parent class) at runtime and execute the appropriate functionality
        // this is called dynamic binding (динамическое связывание)
    }

    // !!!!!
    /*
    Abstract classes:
    - cannot be instantiated
    - don't require abstract methods
    - require constructors to initialize fields
    - allow static methods (with at least an empty body, however)
    - don't allow static abstract methods (that's nonsense because static methods cannot be overriden?)
    - static methods of an abstract class cannot be overriden by they can be called separately or inside other methods of a sub-class
    */
}
