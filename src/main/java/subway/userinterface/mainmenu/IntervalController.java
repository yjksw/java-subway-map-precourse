package subway.userinterface.mainmenu;

import subway.userinterface.Menu;

import java.util.Scanner;

public class IntervalController implements Menu {

    private final static String MENU_NAME = "3. 구간 관리";
    private final static String MENU_KEY = "3";

    private static IntervalController intervalController;

    private IntervalController() {}

    @Override
    public String getMenuName() {
        return MENU_NAME;
    }

    @Override
    public String getMenuKey() {
        return MENU_KEY;
    }

    @Override
    public void run(Scanner scanner) {

    }

    public static Menu getInstance() {
        if (intervalController == null) {
            intervalController = new IntervalController();
        }

        return intervalController;
    }
}
