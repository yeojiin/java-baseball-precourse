package baseball.model;

import baseball.constant.CommonConstant;

public class Baseball {
    private int ballCnt;
    private int strikeCnt;
    private boolean isNothing;
    private boolean isEnd;
    private boolean availableStart;


    public Baseball(int ballCnt, int strikeCnt, boolean isNothing, boolean isEnd, boolean availableStart) {
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
        this.isNothing = isNothing;
        this.isEnd = isEnd;
        this.availableStart = availableStart;
    }

    public Baseball(int ballCnt, int strikeCnt, boolean isNothing, boolean isEnd) {
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
        this.isNothing = isNothing;
        this.isEnd = isEnd;
    }

    public static Baseball initBaseBall() {
        return new Baseball(0, 0, false, false, true);
    }

    public static Baseball getBaseballAnswer(int ballCnt, int strikeCnt) {
        return new Baseball(ballCnt, strikeCnt, ballCnt == 0 && strikeCnt == 0, strikeCnt == CommonConstant.NUMBER_LENGTH);
    }


    public int getBallCnt() {
        return ballCnt;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public boolean isNothing() {
        return isNothing;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public boolean isAvailableStart() {
        return availableStart;
    }


}
