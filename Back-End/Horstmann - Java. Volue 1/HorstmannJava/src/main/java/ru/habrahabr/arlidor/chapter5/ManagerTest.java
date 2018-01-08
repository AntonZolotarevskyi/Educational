package ru.habrahabr.arlidor.chapter5;

public class ManagerTest {

    public static void main(String args[]) {
        Manager boss = new Manager("Carrl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Haker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee emp : staff) {
            System.out.println("name = " + emp.getName() + ", salary = " + emp.getSalary()
                    + ", hireDay = " + emp.getHireDay());
        }
    }
}
