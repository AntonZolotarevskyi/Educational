package ru.habrahabr.arlidor.lessons6;

public class Start {

    public static void main(String args[]) {
        int i = 5;
        int j = 6;
        System.out.println(i == j);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));

        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

        car2 = car1;
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

    }
}
