package com.learning.oop2.abstraction;

public class SubClass2 extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("The abstractMethod has been implemented by SubClass2");
    }

    public void doSomethingNew() {
        doSomething();
        //or
        AbstractClass.doSomething();
        System.out.println("Nice to meet you!");
    }
}
