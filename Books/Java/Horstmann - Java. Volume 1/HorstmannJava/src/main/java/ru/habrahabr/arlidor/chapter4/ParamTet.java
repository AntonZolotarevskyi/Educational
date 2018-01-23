package ru.habrahabr.arlidor.chapter4;

public class ParamTet {

    public static void main(String args[]) {
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        System.out.println("Testing tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        System.out.println("Testing swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        swap(a, b);
        System.out.println("After a: " + a.getName());
        System.out.println("After b: " + b.getName());
    }

    private static void tripleValue(double percent) {
        percent = 3 * percent;
        System.out.println("End of method: percent = " + percent);
    }

    private static void tripleSalary(Employee harry) {
        harry.raiseSalary(200);
        System.out.println("End of method: salary = " + harry.getSalary());
    }

    private static void swap(Employee a, Employee b) {
        Employee temp = a;
        a = b;
        b = temp;
        System.out.println("End of method: a = " + a.getName());
        System.out.println("End of method: b = " + b.getName());
    }
}
