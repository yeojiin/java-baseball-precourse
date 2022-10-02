package baseball.model;

import baseball.constant.CommonConstant;

public class Message {

    public Message (Baseball baseball) {
        StringBuilder message = new StringBuilder();

        message.append(appendBallResult(baseball));
        message.append(appendStrikeResult(baseball));
        message.append(appendNothing(baseball));
    }

    private String appendBallResult(Baseball baseball) {
        if(baseball.getBallCnt() > 0) {
            return baseball.getBallCnt() + CommonConstant.BALL;
        }
        return CommonConstant.NULL;
    }

    private String appendStrikeResult(Baseball baseball) {
        if(baseball.getStrikeCnt() > 0) {
            return baseball.getStrikeCnt() + CommonConstant.STRIKE;
        }
        return CommonConstant.NULL;
    }

    private String appendNothing(Baseball baseball) {
        if(baseball.isNothing()) {
            return CommonConstant.NOTHING;
        }
        return CommonConstant.NULL;
    }



}
