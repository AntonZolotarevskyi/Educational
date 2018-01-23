package ru.habrahabr.arlidor.chapter6;


public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

}
