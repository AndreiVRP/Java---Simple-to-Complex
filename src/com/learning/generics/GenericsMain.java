package com.learning.generics;

import java.util.*;

public class GenericsMain {
    public static void main(String[] args) {
        Container<String> stringObject = new Container<>("text");
        Container<Integer> intObject = new Container<>(12345);

        stringObject.printObject();
        intObject.printObject();

        List<Container> list = new ArrayList<>();
        list.add(stringObject);
        list.add(intObject);
        list.size();
    }
}
