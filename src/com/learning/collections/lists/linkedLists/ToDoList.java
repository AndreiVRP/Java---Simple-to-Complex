package com.learning.collections.lists.linkedLists;

import java.util.*;

public class ToDoList {

    private LinkedList<String> toDoList = new LinkedList<>();

    public void addTask(String task) {
//        toDoList.add(task);
//        toDoList.addFirst(task); // that's the option if you wanna add each new task to the top of the list
        addTaskAlphabetically(task);
        System.out.println("Task added \n");
    }

    public boolean addTaskAlphabetically(String task) {
        ListIterator<String> listIterator = toDoList.listIterator();
        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareTo(task);
            if (compared == 0) {
                System.out.println("The task has already been added to the TO DO list");
                return true;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(task);
                return true;
            }
        }
        toDoList.add(task); // required for the initial task because if the list is empty, the while loop won't work
        return true;
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
        System.out.println("----- TO DO - A to Z -----");

        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Task " + (toDoList.indexOf(item) + 1) + " - " + item);
            //so, we can use iterator instead of for each
        }
//        for (String item : toDoList) {
//            System.out.println("Task " + (toDoList.indexOf(item) + 1) + " - " + item);
//        }
        System.out.println("------------------");
        System.out.println(toDoList.size() + " items to do \n");
    }
}
