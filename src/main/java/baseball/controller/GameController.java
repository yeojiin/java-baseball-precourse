package baseball.controller;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import baseball.model.Message;
import baseball.model.Number;
import baseball.service.AnswerService;
import baseball.service.ManageService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private Baseball baseball;
    private Number number;
    private AnswerService answerService;
    private ManageService manageService;
    private CommonConstant commonConstant;


    public void gameSetting() {
        baseball = Baseball.initBaseBall();
        manageService.setRandomNumber(commonConstant.NUMBER_LENGTH);

        while(baseball.isAvailableStart()) {
            gameStart();
        }


    }

    public void gameStart() {
      while(!baseball.isEnd()) {
          InputView.inputNumber();
          number.setPlayerNum(manageService.getReadLine());

          manageService.checkPlayerNum(number.getPlayerNum());

          baseball = answerService.getAnswer(number.getPlayerNum(), number.getRandomNum());
          Message message = new Message(baseball);

          OutputView.printResult(message.getResultMeesage());
          if(baseball.isEnd()) {
              OutputView.printEnd();
          }

      }
    }
}

