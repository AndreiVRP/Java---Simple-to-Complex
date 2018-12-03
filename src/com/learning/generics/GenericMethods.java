package com.learning.generics;

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
    }

    private static <T> void anyPrinter(T[] array) {
        for (T item : array) {
            System.out.println(item + " - instance of " + item.getClass());
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
}
