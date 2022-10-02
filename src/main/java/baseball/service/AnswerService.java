package baseball.service;

import baseball.model.Baseball;

public class AnswerService {
    public Baseball getAnswer(String playerNum, String randomNum) {
        int strikeCnt = answerStrike(playerNum, randomNum);
        int ballCnt = answerBall(playerNum, randomNum);

        return Baseball.getBaseballAnswer(ballCnt, strikeCnt);
    }

    public int answerStrike(String playerNums, String randomNums) {
        int strikeCnt = 0;
        for(int i = 0; i < playerNums.length(); i++) {
            char playerNum = playerNums.charAt(i);
            char randomNum = randomNums.charAt(i);

            strikeCnt += playerNum == randomNum ? 1 : 0;
        }
        return strikeCnt;
    }

    public int answerBall(String playerNums, String randomNums) {
        int ballCnt = 0;
        for(int i=0; i < playerNums.length(); i++) {
            char playerNum = playerNums.charAt(i);
            char randomNum = randomNums.charAt(i);

            ballCnt += randomNums.contains(String.valueOf(playerNum)) && randomNum != playerNum ? 1 : 0;
        }

        return ballCnt;
    }
}
