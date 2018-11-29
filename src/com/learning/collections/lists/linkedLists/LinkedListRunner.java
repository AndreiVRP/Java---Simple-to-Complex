package com.learning.collections.lists.linkedLists;

import java.util.Scanner;

public class LinkedListRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        showOptions();
        boolean continueLoop = true;
        String input;

        do {
            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "A":
                    System.out.println("A pressed: Waiting for the task...");
                    list.addTask(scanner.nextLine());
                    break;
                case "L":
                    System.out.println("L pressed");
                    list.printToDoList();
                    break;
                case "U":
                    System.out.println("U pressed. Please enter the task number...");
                    int index = scanner.nextInt(); // TO DO - handle exceptions to avoid non-int non-numeric values
                    System.out.println("...and now the task itself...");
                    scanner.nextLine(); // this is to avoid skipping the next input
                    String task = scanner.nextLine();
                    list.changeTask(index, task);
                    break;
                case "R":
                    System.out.println("R pressed. Which task are you going to remove?");
                    list.removeTask(scanner.nextInt()); // TO DO - handle out of bounds task number
                    System.out.println("...");
                    break;
                // TO DO = to figure out why it's moving to the default case after breaking
                case "Q":
                    System.out.println("Q pressed");
                    continueLoop = false;
                    System.out.println("Quitting the app");
                    break;
                default:
                    System.out.println("Undefined");
                    break;
            }
            // TO DO - to consider an option of cancelling a command (C)
            // TO DO - to consider a separate command for showing the options (M or O)

        } while (continueLoop);
    }

    private static void showOptions() {
        String options = "Please, choose an action. Press:\n" +
                "A to add a new item\n" +
                "L to list the items\n" +
                "U and the item number to update it\n" +
                "R and the item number to remove it\n" +
                "Q to quit\n";
        System.out.println(options);
    }
}
