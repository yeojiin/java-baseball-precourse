package baseball.service;

import baseball.model.Baseball;

public class AnswerService {
    public Baseball getAnswer(String playerNum, String randomNum) {
        int strikeCnt = answerStrike(playerNum, randomNum);
        int ballCnt = answerBall(playerNum, randomNum);

        return Baseball.getBaseballAnswer(ballCnt, strikeCnt);
    }

    private int answerStrike(String playerNums, String randomNums) {
        int strikeCnt = 0;
        for(int i = 0; i < playerNums.length(); i++) {
            char playerNum = playerNums.charAt(i);
            char randomNum = randomNums.charAt(i);

            strikeCnt += playerNum == randomNum ? 1 : 0;
        }
        return strikeCnt;
    }

    private int answerBall(String playerNums, String randomNums) {
        int ballCnt = 0;
        for(int j = 0; j < playerNums.length(); j++) {
            char playerNum = playerNums.charAt(j);
            char randomNum = randomNums.charAt(j);

            ballCnt += randomNums.contains(String.valueOf(playerNum)) && playerNum != randomNum ? 1 : 0;
        }

        return ballCnt;
    }
}
