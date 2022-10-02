package baseball.service;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class ManageService {
    CommonConstant commonConstant;

    public String setRandomNumber(int length) {
        Set<Integer> randomNums = new HashSet<>();
        randomNums = addUniqueNumbers(randomNums, length);

        StringBuilder stringRandomNumbers = new StringBuilder();
        for(Integer num : randomNums) {
            stringRandomNumbers.append(num);
        }
        return stringRandomNumbers.toString();
    }

    private Set<Integer> addUniqueNumbers(Set<Integer> randomNums, int length) {
        randomNums.add(getRandomNumber());
        if(randomNums.size() < length) {
            addUniqueNumbers(randomNums, length);
        }
        return randomNums;
    }

    private int getRandomNumber() {
        int randomNumber = Randoms.pickNumberInRange(commonConstant.MIN_NUM, commonConstant.MAX_NUM);
        return randomNumber;
    }

    public String getReadLine() {
        return Console.readLine();
    }

    public Baseball getAnswer(String playerNum, String randomNum) {
        int strikeCnt = answerStrike(playerNum, randomNum);
        int ballCnt = answerBall(playerNum, randomNum);


        return new Baseball(ballCnt, strikeCnt, false, false);

    }

    private int answerStrike(String playerNums, String randomNums) {
        int strikeCnt = 0;
        for(int i = 0; i < randomNums.length(); i++) {
            char playerNum = playerNums.charAt(i);
            char randomNum = randomNums.charAt(i);

            strikeCnt += playerNum == randomNum ? 1 : 0;
        }
        return strikeCnt;
    }

    private int answerBall(String playerNums, String randomNums) {
        int ballCnt = 0;

        return ballCnt;
    }
}
