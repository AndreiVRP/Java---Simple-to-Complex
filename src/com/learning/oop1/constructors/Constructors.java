package com.learning.oop1.constructors;
import com.learning.oop1.Employee; //imported because it's not in the same package
import java.util.*;
import static java.lang.Math.*;

public class Constructors {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "Senior Dveloper", 10000);
        System.out.println(employee1.getEmployeeId());
        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.toString());

        Employee employee2 = new Employee("Jim Doe", "Middle Developer", 5000);

        System.out.println(employee2.toString());

        Date date = new Date();
        System.out.println(date.toString());

        double square1 = sqrt(25); //Alt + Enter > on-demand static import
        double square2 = sqrt(81);
        System.out.println(square1);
        System.out.println(square2);
    }
}
