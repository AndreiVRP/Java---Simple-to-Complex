package com.learning.oop2.abstraction;

public class SubClass1 extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("The abstractMethod has been implemented by SubClass1");
    }

    public void doSomethingNew() {
        doSomething();
        //or
        AbstractClass.doSomething();
        System.out.println("Say hi again");
    }



}
