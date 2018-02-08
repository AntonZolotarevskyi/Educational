package ru.habrahabr.arlidor.lessons16;

public class Start {

    public static void main(String args[]) {

        Start start = new Start();
        Car car1 = new Car("BMW");
        start.test1(car1);

        System.out.println("car.getName() = " + car1.getName());

        int i = 2;
        start.test2(i);
        System.out.println("i = " + i);
        start.test3(car1);
        System.out.println("car = " + car1);

        Car car2 = new Car();
        start.test4(car1, car2);
    }

    private void test1(Car car1) {
        car1.setName("Toyota");
    }

    private void test2(int i) {
        i = 6;
    }

    private void test3(Car car1) {
        car1 = new Car("NIVA");
        test5(car1);
    }

    private void test4(Car... cars) {
        System.out.println("cars.length = " + cars.length);
    }

    private void test5(Car car1) {
        car1 = new Car("KIA");
    }
}
