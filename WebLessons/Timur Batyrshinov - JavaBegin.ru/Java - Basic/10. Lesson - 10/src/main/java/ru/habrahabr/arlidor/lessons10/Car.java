package ru.habrahabr.arlidor.lessons10;

public class Car {

    public static final String TEXT_ID = "123";
    public static final int MAX_SIZE = 5;
    int i = 2;
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    private void test() {
        int height = MAX_SIZE / i;
    }
}
