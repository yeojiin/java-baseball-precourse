package baseball.controller;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import baseball.service.ManageService;

public class GameController {

    private Baseball baseball;
    private Number number;
    private ManageService manageService;
    private CommonConstant commonConstant;


    public void gameSetting() {
        manageService.setRandomNumber(commonConstant.NUMBER_LENGTH);
        gameStart();

    }

    public void gameStart() {
      while(!baseball.isEnd()) {

      }

    }
}
