package com.learning.collections.lists.arrayLists;

import java.util.*;

public class ToDoList {

    private List<String> toDoList = new ArrayList<>();

    public void addTask(String task) {
        toDoList.add(task);
        System.out.println("Task added \n");
    }

    public void changeTask(int taskNumber, String task) {
        toDoList.set(taskNumber - 1, task);
        System.out.println("Task number " + (taskNumber) + " has been changed to:");
        System.out.println(task + "\n");
    }

    public void removeTask(int taskNumber) {
        toDoList.remove(taskNumber - 1);
        System.out.println("Task number " + (taskNumber) + " has been removed");
//        System.out.println("Task 6 has been moved to line 5 \n");
    }

    public void printToDoList() {
        System.out.println("----- TO DO -----");
        for (String item : toDoList) {
            System.out.println("Task " + (toDoList.indexOf(item) + 1) + " - " + item);
        }
        System.out.println("------------------");
        System.out.println(toDoList.size() + " items to do \n");
    }
}
