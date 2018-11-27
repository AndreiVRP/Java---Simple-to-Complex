package com.learning.exception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("IIPE");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            // try with resources - writer was moved here and it will close the resources automatically
            // so we don't need to check it for null and call writer.close() in finally {} anymore
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt")); BufferedReader reader = new BufferedReader(new FileReader("12345.txt"))) {
                System.out.println("Please, enter a numerator");
                int numerator = sc.nextInt();
                System.out.println("Please, enter a denominator");
                int denominator = sc.nextInt();
//                int[] intArray = new int[1];
//                int i = intArray[2];

                //FOR SOME REASON CANNOT LOCATE THE WRITER initialized in try with resources
                writer.println("The result is " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                sc.nextLine();
                System.out.println("Integer non-zero params only");
                // do not need to set continueLoop to true in catch blocks since it's initially true upon init
            } catch (IOException e) {
                System.out.println("Unable to open the file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All other exceptions");
//                e.printStackTrace();
                //all specific exceptions should get caught before this one
                throw new InvalidInputParamException("Custom Extension: index out of bounds (example thrown by doEverything())");
            } finally {
                //executed always, even if there's an exception
                System.out.println("Finally called");
                // can close only of there is something opened
            }
        } while (continueLoop);
        System.out.println("The try-catch block is finished"); // termination model of exception handling
    }

    private static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
