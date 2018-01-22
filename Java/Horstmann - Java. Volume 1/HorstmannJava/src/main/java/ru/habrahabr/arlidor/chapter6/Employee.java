package ru.habrahabr.arlidor.chapter6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person implements Comparable<Employee>, Cloneable {

    private static int nextId = 1;

    private int id;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        hireDay = new Date();
        id = 0;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
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

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 43 * hash + (this.hireDay != null ? this.hireDay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (this.hireDay != other.hireDay && (this.hireDay == null || !this.hireDay.equals(other.hireDay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", hireDay=" + hireDay + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        this.hireDay.setTime(newHireDay.getTime());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

}
