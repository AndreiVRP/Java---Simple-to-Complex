package com.learning.generics;

public class MyBox<X> {
    private X someField;

    public <T> MyBox(T param, X param2) {
        System.out.println(param.getClass().getSimpleName());
        someField = param2;
    }

    public X getSomeField() {
        return someField;
    }

    public static <U> U returnValue(U param) {
        return param;
    }
}
