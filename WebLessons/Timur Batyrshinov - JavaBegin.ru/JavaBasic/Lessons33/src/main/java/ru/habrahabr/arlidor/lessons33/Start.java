package ru.habrahabr.arlidor.lessons33;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        EnumSet<DayWeek> holidays = EnumSet.of(DayWeek.SATURDAY, DayWeek.SUNDAY);
        List<Car> miniCar = new ArrayList<>();
        miniCar.add(new Car("Toyota"));
        miniCar.add(new Car("BMW"));
        List<Car> sportCar = new ArrayList<>();
        sportCar.add(new Car("Toyota"));
        sportCar.add(new Car("BMW"));
        EnumMap<CarType, List<Car>> enumMap = new EnumMap(CarType.class);
        enumMap.put(CarType.SPORT, miniCar);
        enumMap.put(CarType.MINIVAN, sportCar);
    }

}
