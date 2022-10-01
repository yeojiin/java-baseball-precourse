package baseball.model;

public class Number {
    private String playerNum;
    private String randomNum;

    public Number(String playerNum, String randomNum) {
        this.playerNum = playerNum;
        this.randomNum = randomNum;
    }

    public String getPlayerNum() {
        return playerNum;
    }

    public String getRandomNum() {
        return randomNum;
    }
}
