package ru.habrahabr.arlidor.lessons11;

public class Start {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");

        Start start = new Start();
        car.setName(start.getString(car.getName()));

        System.out.println("car.getName() = " + car.getName());

        car.setName("BMW");

        car = null;

    }

    public String getString(String name) {
        return name + "!!!";
    }

}
