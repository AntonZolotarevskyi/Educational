package ru.habrahabr.arlidor.chapter6;

import java.util.Arrays;

public class EmployeeSortTest {

    public static void main(String args[]) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Craker", 75000);
        staff[1] = new Employee("Harry Haker", 50000);
        staff[2] = new Employee("Tony Tester", 40000);

        Arrays.sort(staff);
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
