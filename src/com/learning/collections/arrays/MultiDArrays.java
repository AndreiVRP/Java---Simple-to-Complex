package com.learning.collections.arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[3];
        int[][] multi1 = {a, b};
        int[][] multi2 = new int[2][];
        multi2[0] = a;
        multi2[1] = b;

        System.out.println(multi1.length);
        System.out.println(multi2.length);
        System.out.println("----------");

        int[][] multi3 = {{1, 2, 3, 4, 5}, {11, 22, 33, 44, 55}};
        printArray1(multi3);
        printArray2(multi3);

        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6};
        int[] z = {7, 8, 9};
        int[][] newMDA1 = createIntMDA(x, y);
        printArray2(newMDA1);
        String sum = summarize(newMDA1);
        System.out.println(sum);
        int[][] newMDA2 = createIntMDA(x, y, z);
        printArray2(newMDA2);
        sum = summarize(newMDA2);
        System.out.println(sum);
    }

    //with for loop
    public static void printArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("*****");
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("----------");

    }

    //with for-each loop
    public static void printArray2(int[][] array) {
        for (int[] i : array) {
            System.out.println("*****");
            for (int j : i) {
                System.out.println(j);
            }
        }
        System.out.println("----------");

    }

    //variadic parameters
    public static int[][] createIntMDA(int[]... intArrays) {
        return intArrays;
    }

    public static String summarize(int[][] mda) {
        int sum = 0;
        for (int i[] : mda) {
            for (int j : i) {
                sum += j;
            }
        }
        return "The sum is " + sum;
    }

}
