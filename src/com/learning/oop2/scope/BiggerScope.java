package com.learning.oop2.scope;

public class BiggerScope {
    int x;

    public BiggerScope(int x) {
        this.x = x;
    }

    public class SmallerScope {
        int x;

        public SmallerScope(int x) {
            this.x = x;
        }

        public void printX(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("BiggerScope.this.x = " + BiggerScope.this.x);
        }
    }

}
