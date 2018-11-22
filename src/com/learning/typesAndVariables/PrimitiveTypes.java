package com.learning.typesAndVariables;

public class PrimitiveTypes {

    public static void main(String[] args) {

        //primitives
        byte byteVar = Byte.MAX_VALUE; // 1 byte
        short shortVar = Short.MAX_VALUE; // 2 bytes
        int intVar = Integer.MAX_VALUE; // 4 bytes
        long longVar = Long.MAX_VALUE; // 8 bytes (mandatory L) 123_456_789
        float floatVar = Float.MAX_VALUE; // 4 bytes (mandatory F)
        double doubleVar = Double.MAX_VALUE; // 8 bytes (optional D)
        char charVar = Character.MAX_VALUE; // 2 bytes '' (single quotes)
        boolean booleanVar = true; // -

        System.out.println(intVar);

        // playing around with chars
        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n'; // new line
        char char4 = '^';
        char char5 = '\u00A9'; // copyright (from https://unicode-table.com)
        char char6 = '\u0026';

        System.out.println(char1 + char2 + char3 + char4 + char5 + char6); //summed as integers
        System.out.println("All chars: " + char1 + char2 + char3 + char4 + char5 + char6); //concatinated as a string

        //type casting
        byte a = 127;
        System.out.println(a);

        short b = a;
        System.out.println(b);

        int c = b;
        System.out.println(c);

        long d = c;
        System.out.println(d);

//        b = c; // won't work since int is bigger than short
        b = (short) c; // but you can downcast int to short
        System.out.println("casted:" + b);

        //however, be careful for data loss
        long money = 100_000_000_000_000L;
        System.out.println("Initial: " + money);
        int converted = (int) money;
        System.out.println("Converted: " + converted); // type casting ended up with incorrect conversion
    }
}
