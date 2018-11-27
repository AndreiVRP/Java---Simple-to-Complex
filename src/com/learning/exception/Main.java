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

        do {
            try {
                System.out.println("Please, enter a numerator");
                int numerator = sc.nextInt();
                System.out.println("Please, enter a denominator");
                int denominator = sc.nextInt();
                System.out.println("The result of dividing " + numerator + " by " + denominator + " is " + divide(numerator, denominator));
                saveToFile(divide(numerator,denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                sc.nextLine();
                System.out.println("Integer non-zero params only");
                // do not need to set continueLoop to true in catch blocks since it's initially true upon init
            } catch (IOException e) {
                System.out.println("Unable to open the file");
                e.printStackTrace();
            }
        } while (continueLoop);
        System.out.println("The try-catch block is finished"); // termination model of exception handling
    }

    private static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    private static void saveToFile(double res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("The result is " + res);
        writer.close();
    }
}
