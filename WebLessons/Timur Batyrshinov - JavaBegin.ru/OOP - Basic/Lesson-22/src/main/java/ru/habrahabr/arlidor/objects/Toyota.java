package ru.habrahabr.arlidor.objects;

public class Toyota {

    private double volume;
    private String name;

    public Toyota(double volume) {
        this.volume = volume;
    }

    public Toyota(String name) {
        this.name = name;
    }

    public Toyota(double volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
