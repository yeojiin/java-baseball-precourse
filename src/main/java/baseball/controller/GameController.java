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
        initGame();

        while(baseball.isAvailableStart()) {
            gameStart();
            askRestart();
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

    private void askRestart() {
        InputView.askRestart();
        String inputStr = manageService.getReadLine();
        manageService.checkRestartGameNumber(inputStr);

        boolean isRestart = inputStr.equals(CommonConstant.AGREE_RESTART);
        if (isRestart) {
            initGame();
        }
    }

    private void initGame() {
        baseball = Baseball.initBaseBall();
        number = Number.initNumber(manageService.setRandomNumber(commonConstant.NUMBER_LENGTH));
    }



}

