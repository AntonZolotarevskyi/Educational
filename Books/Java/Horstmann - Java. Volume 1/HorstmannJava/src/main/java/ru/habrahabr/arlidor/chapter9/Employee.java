package ru.habrahabr.arlidor.chapter9;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
