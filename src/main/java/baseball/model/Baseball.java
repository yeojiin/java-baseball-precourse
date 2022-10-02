package baseball.model;

public class Baseball {
    private int ballCnt;
    private int strikeCnt;
    private boolean isNothing;
    private boolean isEnd;

    public Baseball(int ballCnt, int strikeCnt, boolean isNothing, boolean isEnd) {
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
        this.isNothing = isNothing;
        this.isEnd = isEnd;
    }

    public static Baseball getBaseballAnswer(int ballCnt, int strikeCnt) {
        return new Baseball(ballCnt, strikeCnt, ballCnt == 0 && strikeCnt == 0, strikeCnt == 3);
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





}
