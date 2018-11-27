package com.learning.oop2.scope;

public class Main {
    public static void main(String[] args) {
        BiggerScope bs = new BiggerScope(5);
        BiggerScope.SmallerScope ss = bs.new SmallerScope(7);
        ss.printX(9);
    }
}
