package ru.habrahabr.arlidor.chapter6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CloneTest {

    public static void main(String args[]) {

        try {
            Employee origin = new Employee("John Q. Public", 50000);
            origin.setHireDay(2000, 1, 1);
            Employee copy = origin.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("origin = " + origin);
            System.out.println("copy = " + copy);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CloneTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
