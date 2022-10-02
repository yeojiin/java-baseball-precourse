package baseball.model;

import baseball.constant.CommonConstant;

public class Message {

    private String blankString = CommonConstant.NULL;

    public Message (Baseball baseball) {
        StringBuilder message = new StringBuilder();

        message.append(appendBallResult(baseball));
        message.append(appendSpace(baseball));
        message.append(appendStrikeResult(baseball));
        message.append(appendNothing(baseball));
    }

    private String appendBallResult(Baseball baseball) {
        if(baseball.getBallCnt() > 0) {
            return baseball.getBallCnt() + CommonConstant.BALL;
        }
        return blankString;
    }

    private String appendStrikeResult(Baseball baseball) {
        if(baseball.getStrikeCnt() > 0) {
            return baseball.getStrikeCnt() + CommonConstant.STRIKE;
        }
        return blankString;
    }

    private String appendSpace(Baseball baseball) {
        if(baseball.getBallCnt() > 0 && baseball.getStrikeCnt() > 0) {
            return CommonConstant.SPACE;
        }
        return blankString;
    }

    private String appendNothing(Baseball baseball) {
        if(baseball.isNothing()) {
            return CommonConstant.NOTHING;
        }
        return blankString;
    }



}
