package com.learning.basics.conditionalStatements;

public class ControlStatements {
    public static void main(String[] args) {

        // scope
        int x = 10;
        {
//            int x = 5; // this variable is already defined in the broader scope
            int y = 20;
            System.out.println(x);
            System.out.println(y);
        }
//        System.out.println(y); // does't work for variable y since it's out of this scope and therefore isn't seen

        // if-else
        String day = "Saturday";
        if (day == "Saturday" || day == "Sunday") {
            System.out.println("I'm enjoying the weekend");
        } else if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday") {
            System.out.println("It's time to work");
        } else {
            System.out.println("Please enter a valid value!");
        }

        // switch (the best practice is to combine switch statements with enums)
        day = "Friday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("It's " + day + "! Still working");
            case "Friday":
                System.out.println("It's " + day + "! Still working, but looking forward to the weekend!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("I'm enjoying the weekend");
                break;
            default:
                System.out.println("Please enter a valid value!");
        }
    }
}
