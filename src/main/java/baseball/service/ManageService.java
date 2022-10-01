package baseball.service;

import baseball.constant.CommonConstant;
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
}
