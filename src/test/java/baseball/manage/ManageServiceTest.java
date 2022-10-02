package baseball.manage;

import baseball.model.Baseball;
import baseball.model.Message;
import baseball.service.AnswerService;
import baseball.service.ManageService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManageServiceTest {
    private ManageService manageService;
    private AnswerService answerService;

    @DisplayName("야구게임 결과 출력")
    @ParameterizedTest
    @CsvSource(value = {"539:1볼", "356:1스트라이크", "527:2볼 1스트라이크", "375:2볼", "138:낫싱", "257:3스트라이크"}, delimiter = ':')
    public void compareTest(String playerNum, String expectedAnswer) {
        String givenNum = "257";
        Baseball baseball = answerService.getAnswer(playerNum, givenNum);
        String result = new Message(baseball).getResultMeesage();

        assertEquals(expectedAnswer, result);
    }

}
