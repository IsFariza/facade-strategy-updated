package FacadeImplementation.ConcreteFacades;

import HandBook.HandBook;
import StrategyImplementation.HomeModeStrategy;
import StrategyImplementation.HomeModes.DayMode;
import StrategyImplementation.HomeModes.NightMode;

public class HeatingSystem {
    public void setDayTemperature(){
        HandBook.setDayTemperature();
    }
    public void setNightTemperature(){
        HandBook.setNightTemperature();
    }
    public void turnOn(){
        HandBook.setHeatingStatus(true);
    }
    public void turnOff(){
        HandBook.setHeatingStatus(false);
    }
    public String getStatus(){
        return "Heating system is " + (HandBook.isHeatingOn() ? "on":"off") +
                ", Temperature is " + HandBook.getTemperature() + "C";
    }
}