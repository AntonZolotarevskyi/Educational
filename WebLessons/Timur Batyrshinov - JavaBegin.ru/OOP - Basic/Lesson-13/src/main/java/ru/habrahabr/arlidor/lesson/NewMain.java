package ru.habrahabr.arlidor.lesson;

import ru.habrahabr.arlidor.objects.Car;
import ru.habrahabr.arlidor.objects.Door;

public class NewMain {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");
        System.out.println(car.getName());
        
        Door door = new Door();
        door.setLenght(12);
        door.setWidth(11);
        door.setHeight(11);
    }
    
}
