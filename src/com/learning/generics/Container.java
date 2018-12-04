package com.learning.generics;

public class Container<T> {
    private T object;

    public Container(T object) {
        this.object = object;
    }

    public void printObject() {
        System.out.println("The object belongs to " + object.getClass() + ", and its value is" + object);
    }
}
