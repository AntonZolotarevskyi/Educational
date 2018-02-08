package ru.habrahabr.arlidor.lessons21;

public enum GameLevel {
    BEGINNER(0, "Начинающий"),
    PROFESSIONAL(1, "Профессиональный"),
    HARD(2, "Cложный");

    private int index;
    private String name;

    GameLevel(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

}
