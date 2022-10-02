package baseball;

import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        System.out.println("런 ");
        GameController gameController = new GameController();
        gameController.gameSetting();

    }
}
