package ru.habrahabr.arlidor.lessons30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Start {

    private static List cars = new ArrayList<Car>();

    public static void main(String args[]) {
        Car car1 = new Car(1999, "BMW");
        Car car2 = new Car(1990, "Opel");
        Car car3 = new Car(2004, "Niva");
        Car car4 = new Car(2013, "Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print(cars);
        Collections.sort(cars, new CarYearComparator());
        print(cars);

        CarNameComparator compar = new CarNameComparator();
        TreeSet carSet = new TreeSet(compar);
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        print(carSet);
    }

    private static void print(Collection col) {
        System.out.println();
        Iterator<Car> carIter = col.iterator();
        while (carIter.hasNext()) {
            Car car = carIter.next();
            System.out.println(car.getName() + ", " + car.getYear());
        }
    }

}
