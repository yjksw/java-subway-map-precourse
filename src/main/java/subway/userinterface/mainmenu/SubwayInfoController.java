package subway.userinterface.mainmenu;

import subway.userinterface.Menu;

public class SubwayInfoController implements Menu {

    private final static String MENU_NAME = "4. 지하철 노선도 출력";
    private final static String MENU_KEY = "4";


    private static SubwayInfoController subwayInfoController;

    private SubwayInfoController() {}

    @Override
    public String getMenuName() {
        return MENU_NAME;
    }

    @Override
    public String getMenuKey() {
        return MENU_KEY;
    }

    public static Menu getInstance() {
        if (subwayInfoController == null) {
            subwayInfoController = new SubwayInfoController();
        }

        return subwayInfoController;
    }
}