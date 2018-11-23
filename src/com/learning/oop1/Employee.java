package com.learning.oop1;

public class Employee {
    public static int id; //not accessible in the constructor - needed to automatically generate a new id for each new instance by incrementing it and assigning it to the employeeID variable
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    //constructors should not be returning anything but should not use void either
    // the name of the constructor method should be identical to the class name

    private Employee(String name, String position, int salary, String department) {
        employeeId = ++id; //increment this way if you want your first instance id to equal 1
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
    }

    //now we don't have to create setters (only if we want to change the values later)
    //if we don't create a constructor method, the system will create a default empty one

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return "$" + salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
