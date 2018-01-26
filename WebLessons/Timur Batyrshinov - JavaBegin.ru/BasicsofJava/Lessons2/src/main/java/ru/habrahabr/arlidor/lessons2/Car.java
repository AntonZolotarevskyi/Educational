package ru.habrahabr.arlidor.lessons2;

public class Car {

    private int i = 5, z = 6, x = 7, j = 3;
    private String name;

    public Car(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public void go() {
        int count = 0;
        count++;
        System.out.print(count);

        if (count > 8) {
            int j = 5;
        }
    }

    private void test() {
        i = 4;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
