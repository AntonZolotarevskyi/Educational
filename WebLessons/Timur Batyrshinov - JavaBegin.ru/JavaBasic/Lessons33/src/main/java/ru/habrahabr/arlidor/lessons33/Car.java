package ru.habrahabr.arlidor.lessons33;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private int year;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Car{" + "year=" + year + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.year;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
