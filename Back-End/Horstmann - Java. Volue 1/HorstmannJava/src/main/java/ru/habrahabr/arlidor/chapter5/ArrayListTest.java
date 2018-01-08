package ru.habrahabr.arlidor.chapter5;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String args[]) {

        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Craker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Haker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }
        for (Employee emp : staff) {
            System.out.println("name = " + emp.getName() + ", salary = " + emp.getSalary()
                    + ", hireDay = " + emp.getHireDay());
        }

    }
}
