package com.learning.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("The result is " + divide(numerator, denominator));
//                if (continueLoop) {
//                    throw new RuntimeException("Runtime Exception");
//                }
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                sc.nextLine();
                System.out.println("Integer non-zero params only");
                // do not need to set continueLoop to true in catch blocks since it's initially true upon init
            } catch (IOException e) {
                System.out.println("Unable to open the file");
                e.printStackTrace();
            } finally {
                //executed always, even if there's an exception
                System.out.println("Finally called");
//                writer.close();
            }
        } while (continueLoop);
        System.out.println("The try-catch block is finished"); // termination model of exception handling
    }

    private static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
