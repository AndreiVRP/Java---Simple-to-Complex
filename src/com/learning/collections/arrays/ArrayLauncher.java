package com.learning.collections.arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLauncher {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray1 = new int[5];
        intArray1[0] = 0;
        intArray1[1] = 100;
        intArray1[2] = 200;
        intArray1[3] = 300;
        intArray1[4] = 400;
//        intArray1[5] = 500; // out-of-bounds exception
        printIntArray(intArray1);

        int[] intArray2 = {1, 2, 3, 4, 5};
        printIntArray(intArray2);

        int[] newArray = printIntArrayFromConsole(5);
        printIntArray(newArray);

        System.out.println("Sorted");
        int[] sortedArray = sort(newArray);
        printIntArray(sortedArray);

    }

    public static void printIntArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
        System.out.println("----------");
    }

    public static int[] printIntArrayFromConsole(int arrayLength) {

        System.out.println("Please enter " + arrayLength + " int numbers");
        boolean continueLoop = true;
        int[] array = new int[arrayLength];

        do {
            try {
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                    System.out.println("Item Entered: " + array[i]);
                }
                continueLoop = false; // we set it to false to break out of the do-while loop when whe have finally iterated over the entire array (which is fixed in size)
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer value");
                scanner.nextLine();
            }
        } while (continueLoop);
        return array;
    }

    public static int[] sort(int[] array) {
        //inefficient way of sorting
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
