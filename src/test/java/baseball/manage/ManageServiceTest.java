package baseball.manage;

import baseball.constant.CommonConstant;
import baseball.model.Baseball;
import baseball.model.Config;
import baseball.model.Message;
import baseball.service.ManageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManageServiceTest {
    private ManageService manageService;

    @BeforeEach
    public void setService() {
        Config config = new Config();
        manageService = config.manageService();
    }

    @DisplayName("야구게임 결과 출력")
    @ParameterizedTest
    @CsvSource(value = {"615:1볼"}, delimiter = ':')
    public void compareTest(String playerNum, String expectedAnswer) {
        String randomNum = "831";
        Baseball baseball = manageService.getAnswer(playerNum, randomNum);
        String result = new Message(baseball).getResultMeesage();

        assertEquals(expectedAnswer, result);
    }

}
