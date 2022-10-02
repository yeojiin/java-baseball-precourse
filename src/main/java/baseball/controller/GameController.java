package baseball.controller;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import baseball.model.Number;
import baseball.service.ManageService;
import baseball.view.InputView;

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
          InputView.inputNumber();
          number.setPlayerNum(manageService.getReadLine());
      }

    }
}

