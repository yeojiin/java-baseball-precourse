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
        randomNums = addUniqueNums(randomNums, length);

        StringBuilder stringRandomNums = new StringBuilder();
        for(Integer num : randomNums) {
            stringRandomNums.append(num);
        }
        return stringRandomNums.toString();
    }

    private Set<Integer> addUniqueNums(Set<Integer> randomNums, int length) {
        randomNums.add(getRandomNumber());
        if(randomNums.size() < length) {
            addUniqueNums(randomNums, length);
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



    public void checkPlayerNum(String playerNum) {
        checkEmpty(playerNum);
        checkLength(playerNum);
        checkType(playerNum);
        checkZeroNum(playerNum);
        checkDuplicateNum(playerNum);
    }

    public void checkRestartGameNumber(String str) {
        if (!(str.equals(CommonConstant.AGREE_RESTART) || str.equals(CommonConstant.DISAGREE_RESTART))) {
            throw new IllegalArgumentException(CommonConstant.COMMON_INVALID_ERROR);
        }
    }

    private void checkEmpty(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException(CommonConstant.NOT_AVAILABLE_EMPTY_NUM);
        }
    }

    private void checkLength(String str) {
        if (str.length() != CommonConstant.NUMBER_LENGTH) {
            throw new IllegalArgumentException(CommonConstant.WRONG_LENGTH);
        }
    }

    private void checkType(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException(CommonConstant.WRONG_TYPE);
        }
    }

    private void checkZeroNum(String str) {
        if (str.contains(CommonConstant.ZERO)) {
            throw new IllegalArgumentException(CommonConstant.COMMON_INVALID_ERROR);
        }
    }

    private void checkDuplicateNum(String str) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueNumbers.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        if (str.length() != uniqueNumbers.size()) {
            throw new IllegalArgumentException(CommonConstant.NOT_AVAILABLE_DUPLICATE_NUM);
        }
    }



}
