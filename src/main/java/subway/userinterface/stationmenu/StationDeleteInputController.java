package subway.userinterface.stationmenu;

import subway.domain.Station;
import subway.userinterface.InputController;
import subway.util.InputValidator;

import java.util.Scanner;

public class StationDeleteInputController extends InputController {

    public StationDeleteInputController() {
        this.INPUT_INTRO = "\n## 삭제할 역 이름을 입력하세요.";
    }

    @Override
    protected void validateInput(Scanner scanner) throws IllegalArgumentException {
        InputValidator.validateExistence(userInput);
    }
}
