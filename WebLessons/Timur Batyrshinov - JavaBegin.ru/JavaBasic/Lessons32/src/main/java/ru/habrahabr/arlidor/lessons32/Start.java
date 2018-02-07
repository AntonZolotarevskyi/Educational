package ru.habrahabr.arlidor.lessons32;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class Start {

    public static void main(String args[]) {

        HashMap<String, Car> cars = new HashMap<>();

        Car car1 = new Car(1999, "BMW");
        Car car2 = new Car(1990, "Opel");
        Car car3 = new Car(2004, "Niva");
        Car car4 = new Car(2013, "Nissan");
        Car car5 = new Car(2013, "KIA");
        Car car6 = new Car(2013, "Lexus");

        cars.put("test", car1);
        cars.put("key", car2);
        cars.put("niva", car3);
        cars.put("car", car4);
        cars.put("test", car5);
        cars.put("test2", car6);
        iterateMap(cars);

        TreeMap<String, Car> treeMap = new TreeMap<>();
        treeMap.put("test", car1);
        treeMap.put("key", car2);
        treeMap.put("niva", car3);
        treeMap.put("car", car4);
        treeMap.put("test", car5);
        treeMap.put("test2", car6);
        iterateMap(treeMap);

        LinkedHashMap<String, Car> linkedMap = new LinkedHashMap<>();

        linkedMap.put("test", car1);
        linkedMap.put("key", car2);
        linkedMap.put("niva", car3);
        linkedMap.put("car", car4);
        linkedMap.put("test", car5);
        linkedMap.put("test2", car6);
        iterateMap(linkedMap);
    }

    private static void iterateMap(Map<String, Car> cars) {
        System.out.println();
        Iterator<Map.Entry<String, Car>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }

}
