package ru.habrahabr.arlidor.lessons32;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class Start {

    public static void main(String args[]) {

        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car(1999, "BMW");
        Car car2 = new Car(1990, "Opel");
        Car car3 = new Car(2004, "Niva");
        Car car4 = new Car(2013, "Nissan");
        Car car5 = new Car(2013, "KIA");
        Car car6 = new Car(2013, "Lexus");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println("ArrayDeque.element() = " + cars.element());
        System.out.println("ArrayDeque.remove() = " + cars.remove());
        Queue lifoQueue = Collections.asLifoQueue(cars);
        lifoQueue.add(car1);
        lifoQueue.add(car2);
        lifoQueue.add(car3);
        lifoQueue.add(car4);
        lifoQueue.add(car5);
        lifoQueue.add(car6);
        System.out.println("lifoQueue.element() = " + lifoQueue.element());
        System.out.println("lifoQueue.remove() = " + lifoQueue.remove());

        Stack<Car> stack = new Stack();
        stack.add(car1);
        stack.add(car2);
        stack.add(car3);
        stack.add(car4);
        stack.add(car5);
        stack.add(car6);

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("lifoQueue.pop() = " + stack.pop());
        System.out.println("lifoQueue.pop() = " + stack.pop());
    }

}
