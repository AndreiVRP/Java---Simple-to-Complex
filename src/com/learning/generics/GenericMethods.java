package com.learning.generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vfr", "rtw", "ert"};

        anyPrinter(intArray);
        anyPrinter(doubleArray);
        anyPrinter(stringArray);

        System.out.println("Int Array Max: " + findMax(intArray));
        System.out.println("Double Array Max: " + findMax(doubleArray));
//        System.out.println("String Array Max (latest - A to Z): " + findMax(stringArray));

        //lesson 80 - inheritance and type inference
        Number n = Integer.valueOf(20); //exhaustive boxing since Integer is a sub-class of Number
        List<Number> intList = new ArrayList<>();
        intList.add(1);
        intList.add(23);
        intList.add(55);
        intList.add(79);
        intList.add(99);
        printNumbers(intList);

        printNumbers(Arrays.asList(intArray)); //another variation of type inference


        MyBox<Integer> intBox = new MyBox<>("testing T", 12345);
        System.out.println(intBox.getSomeField());
        MyBox<String> stringBox = new MyBox<>("testing T", "testing X");
        System.out.println(stringBox.getSomeField());

//        Double doubleValue = MyBox.<Double>returnValue(0.5); //<Double> is not needed the second time since type inference handles that
        Double doubleValue = MyBox.returnValue(0.5);

    }

    private static <T> void anyPrinter(T[] array) {
        for (T item : array) {
            System.out.println(item + " - instance of " + item.getClass().getSimpleName());
        }
    }

    // we can narrow the T down to Number (class), which will exclude String
    // in this case Number comes first
    private static <T extends Number & Comparable> T findMax(T[] array) {
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    private static void printNumbers(List<Number> list) {
        for(Number n : list) {
            System.out.println(n);
        }
    }
}
