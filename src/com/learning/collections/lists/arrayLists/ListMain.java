package com.learning.collections.lists.arrayLists;

public class ListMain {
    public static void main(String[] args) {
        ToDoList list1 = new ToDoList();
        list1.addTask("test task 1");
        list1.addTask("test task 2");
        list1.addTask("test task 3");
        list1.printToDoList();

        ToDoList list2 = new ToDoList();
        list2.addTask("to learn the Collections framework");
        list2.addTask("to learn Generics");
        list2.addTask("to revise everything");
        list2.addTask("to move on to Selenium");
        list2.printToDoList();
        list2.addTask("test task");
        list2.printToDoList();
        list2.changeTask(5, "test task changed");
        list2.printToDoList();
        list2.addTask("to complete the Selenium course by Dec 25");
        list2.printToDoList();
        list2.removeTask(5);
        list2.printToDoList();


    }
}
