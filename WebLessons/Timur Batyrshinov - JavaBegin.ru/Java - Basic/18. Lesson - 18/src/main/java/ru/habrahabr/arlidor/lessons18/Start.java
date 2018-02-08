package ru.habrahabr.arlidor.lessons18;

public class Start {

    private static Car car;

    public static void main(String args[]) {
        test1();
    }

    private static void test1() {
        test2();
    }

    private static void test2() {
        test3();
    }

    private static void test3() {
        System.out.println("test3");
        car.getName();
    }
}
