package baseball.controller;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import baseball.model.Message;
import baseball.model.Number;
import baseball.service.ManageService;
import baseball.view.InputView;
import baseball.view.OutputView;

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

          baseball = manageService.getAnswer(number.getPlayerNum(), number.getRandomNum());
          Message message = new Message(baseball);

          OutputView.printResult(message.getResultMeesage());
          if(baseball.isEnd()) {
              OutputView.printEnd();
          }

      }
    }
}

