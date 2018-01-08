package ru.habrahabr.arlidor.chapter4;

import java.time.LocalDate;

public class Employee {

    private static int nextId = 1;

    private int id;
    private double salary;
    private String name;
    private LocalDate hireDay;

    public Employee(String name, double salary) {
        this(name, salary, 2000, 12, 31);
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        id = 0;
    }

    public static void main(String args[]) {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public int detId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }
}
