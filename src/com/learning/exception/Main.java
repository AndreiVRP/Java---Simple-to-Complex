package com.learning.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            doEverything();
        } catch (NullPointerException e) {
            System.out.println("NPE");
//            e.printStackTrace();
            System.out.println("-----");
            Throwable[] suppressed = e.getSuppressed();
            System.out.println(suppressed[0]);
//            for (Throwable s : suppressed) {
//                System.out.println(s);
//            }
            // to avoid this thing, check writer.close() for null
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    private static void doEverything() {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null; // is null for now but defined here to broaden the scope and call writer.close() in the finally block
        //need to be initialized with null because otherwise writer.close() generates an error

        do {
            try {
                System.out.println("Please, enter a numerator");
                int numerator = sc.nextInt();
                System.out.println("Please, enter a denominator");
                int denominator = sc.nextInt();
//                System.out.println("The result of dividing " + numerator + " by " + denominator + " is " + divide(numerator, denominator));
                int [] intArray = new int[1];
                int i = intArray[2];

                writer = new PrintWriter(new FileWriter("out.txt"));
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
            } catch (Exception e){
                System.out.println("All other exceptions");
                e.printStackTrace();
                //all specific exceptions should get caught before this one
            } finally {
                //executed always, even if there's an exception
                System.out.println("Finally called");
                // can close only of there is something opened
                if (writer != null) {
                    writer.close();
                }
            }
        } while (continueLoop);
        System.out.println("The try-catch block is finished"); // termination model of exception handling
    }

    private static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
