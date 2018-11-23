package com.learning.basics.string;

public class Strings {
    public static void main(String[] args) {
        String s1 = "I Like Coffee";
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String s2 = s1;
        String s3 = "I Like Coffee!!!";
        printComparisonResult(s1, s2, "*****");
        printComparisonResult(s1, s2, "==");
        printComparisonResult(s1, s3, "==");
        printComparisonResult(s1, s3.substring(0, 13), "=="); // false because it checks if this is the same object
        printComparisonResult(s1, s3, "equals"); // true because it checks if the 2 object's values match
        printComparisonResult(s1, s3.substring(0, 13), "equals"); // true because it checks if the 2 object's values match

        System.out.println(s1.toLowerCase().startsWith("i like"));
        System.out.println(s1.toLowerCase().startsWith("like"));
        System.out.println(s1.toLowerCase().startsWith("like",2));
        System.out.println(s3.endsWith("!!!"));

        String s4 = "Hi";
        System.out.println(s4);
        String s5 = s4.replace("i","ello");
        System.out.println(s5);

        System.out.println(s3.indexOf("!!!"));
        System.out.println(s3.indexOf("!!!!"));
        System.out.println(s3.toLowerCase().indexOf("like"));
    }

    public static void printComparisonResult(String str1, String str2, String operator) {
        if (operator == "==") {
            String result = (str1 == str2) ? "This is one and the same object" : "These are 2 different objects";
            System.out.println(result);
        } else if (operator == "equals") {
            String result = (str1.equals(str2)) ? "The compared values match" : "The compared values don't match";
            System.out.println(result);
        } else {
            System.out.println("Please, enter == or equals as a comparison argument");
        }
    }
}