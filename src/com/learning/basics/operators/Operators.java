package com.learning.basics.operators;

public class Operators {
    public static void main(String[] args) {

        int a = 1;
        a += 5;
        System.out.println("A: " + a); // 6
        int b = 2 * ++a; // incrementing first, passing the incremented value second
        System.out.println("A: " + a); // 7
        System.out.println("B: " + b); // 14
        b = 2 * a++; // passing the initial value first, incrementing second
        System.out.println("A: " + a); // 8
        System.out.println("B: " + b); // 14

        b = b++; // the value won't change because it passes the value to itself first and only then increments
        b = b++; // as you can see the incrementation is ignored
        System.out.println("Tricky: " + b); // 14



        int x = 5;
        int y = 5;
        int z = 7;

        boolean bool1 = x == y;
        System.out.println(bool1);
        boolean bool2 = x != y;
        System.out.println(bool2);

        boolean resultingBool = bool1 && bool2;
        System.out.println("AND : " + resultingBool);
        resultingBool = bool1 || bool2;
        System.out.println("OR : " + resultingBool);

        bool2 = x != z;
        resultingBool = bool1 && bool2;
        System.out.println("result: " + resultingBool); // changes to true because both are now true
        System.out.println("display result: " + !resultingBool); // the value stored in the variable doesn't change, it's only the displayed value that is reverted
        resultingBool = !resultingBool; // this time we have actually flipped the value to the opposite one (from true to false)
        System.out.println("result flipped; " + resultingBool);
        System.out.println("display result flipped: " + !resultingBool); // the actual value is false but the displayed value is flipped again

        //ternary operator
        int first = 5;
        int second = 3;

        int theBiggerOne = first > second ? first : second;
        System.out.println("Comparing " + first + " to " + second + ", the bigger one is " + theBiggerOne);
    }
}
