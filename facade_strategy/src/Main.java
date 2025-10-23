import FacadeImplementation.HomeManagerFacade;
import StrategyImplementation.HomeModeStrategy;
import StrategyImplementation.HomeModes.DayMode;

public class Main {
    public static void main(String[] args){
        HomeManagerFacade home = new HomeManagerFacade();

        HomeModeStrategy mode = new DayMode();
        home.activateMode(mode);
        home.showStatus();

    }
}