package ru.habrahabr.arlidor.lessons29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Start {

    public static void main(String args[]) {
        arrayListExample();
        linkedListExample();
    }

    private static void arrayListExample() {
        List<Car> cars = new ArrayList();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.add(new Car("Toyota"));
        System.out.println("size " + cars.size());
        System.out.println("contains car2 ? " + cars.contains(car2));
        int index = cars.indexOf(car3);
        System.out.println("index car3 " + index);
        Car selectedCar = cars.get(3);
        System.out.println("sel car " + selectedCar);
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
        cars.clear();
    }

    private static void linkedListExample() {
        LinkedList<Car> cars = new LinkedList();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println("size " + cars.size());
        System.out.println("contains car2 ? " + cars.contains(car2));
        cars.addLast(new Car("Toyota"));
        Iterator<Car> iterator = cars.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

    }
}
