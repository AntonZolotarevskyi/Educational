package ru.habrahabr.arlidor.lessons21;

public class Start {

    public static void main(String args[]) {
        for (GameLevel value : GameLevel.values()) {
            System.out.println(value.getName());
        }

        Game game = new Game();
        game.setGameLevel(GameLevel.BEGINNER);
        System.out.println("game.getGameLevel " + game.getGameLevel());

        if (game.getGameLevel() == GameLevel.BEGINNER) {
            System.out.println("beginner");
        }
    }
}
