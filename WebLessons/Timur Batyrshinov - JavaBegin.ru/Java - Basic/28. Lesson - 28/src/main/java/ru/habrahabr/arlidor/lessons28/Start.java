package ru.habrahabr.arlidor.lessons28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start {

    public static void main(String args[]) {
        // hashSetExample();
        // treeSetExample();
        linkedHashSet();
    }

    private static void hashSetExample() {
        Set cars = new HashSet();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        Iterator it = cars.iterator();
        while (it.hasNext()) {
            Car car = (Car) it.next();
            System.out.println(car.getName());
        }

    }

    private static void treeSetExample() {
        Set<Integer> inter = new TreeSet<>();
        inter.add(44);
        inter.add(22);
        inter.add(23);
        inter.add(62);
        inter.add(14);
        inter.add(2);
        inter.add(676);
        inter.add(24);
        inter.add(2324);
        inter.add(222);

        Iterator<Integer> it = inter.iterator();
        while (it.hasNext()) {
            Integer inn = it.next();
            System.out.println(inn);
        }
    }

    private static void linkedHashSet() {
        Set<Car> cars = new LinkedHashSet();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        MiniCar car4 = new MiniCar("Nissan","AAA");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        Iterator<Car> it = cars.iterator();
        while (it.hasNext()) {
            Car car = it.next();
            System.out.println(car.getName());
        }
    }
}
