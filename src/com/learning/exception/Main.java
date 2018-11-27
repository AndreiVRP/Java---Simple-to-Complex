package com.learning.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Please, enter a numerator");
                int numerator = sc.nextInt();
                System.out.println("Please, enter a denominator");
                int denominator = sc.nextInt();
                System.out.println("The result of dividing " + numerator + " by " + denominator + " is " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
                sc.nextLine();
                System.out.println("Non-zero params only");
                // do not need to set continueLoop to true in catch blocks since it's initially true upon init
            } catch (InputMismatchException e) {
                System.out.println("Exception: " + e);
                sc.nextLine();
                System.out.println("Integer params only");
            }
        } while (continueLoop);
        System.out.println("The try-catch block is finished"); // termination model of exception handling
    }

    private static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
