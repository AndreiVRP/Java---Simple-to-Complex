package com.learning.basics.loops;

public class Loops {
    public static void main(String[] args) {

        //while

        int finalBalance = 100_000;
        double currentBalance = 0; //if we set it to more than 100_000, the while loop won't run the code at all because it checks the condition before running
        int annualDeposit = 5000;
        int fullYears = 0;
        double interestRate = 0.1; // 10%

        while (currentBalance < finalBalance) {
            currentBalance += annualDeposit;
            currentBalance = currentBalance + currentBalance * interestRate;
            ++fullYears;
        }

        System.out.println(fullYears + " full years is required to accumulate " + finalBalance + "$ on your savings account");

        // do while is guaranteed to run at least once even if the condition is false
        // that's why do while isn't suitable for this purpose

        do {
            currentBalance += annualDeposit;
            currentBalance = currentBalance + currentBalance * interestRate;
            ++fullYears;
        } while (currentBalance < finalBalance);

        System.out.println(fullYears + " full years is required to accumulate " + finalBalance + "$ on your savings account");

        int x = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(x * i);
        }

    }
}
