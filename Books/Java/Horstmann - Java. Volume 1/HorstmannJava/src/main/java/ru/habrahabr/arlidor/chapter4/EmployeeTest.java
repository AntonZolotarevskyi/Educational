package ru.habrahabr.arlidor.chapter4;

public class EmployeeTest {

    public static void main(String args[]) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Haker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }
        for (Employee emp : staff) {
            System.out.println("name = " + emp.getName() + ", salary= " + emp.getSalary()
                    + ", hireDay= " + emp.getHireDay());

        }

    }
}
