package StrategyImplementation.HomeModes;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightningSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import StrategyImplementation.HomeModeStrategy;

public class DayMode implements HomeModeStrategy {
    @Override
    public void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOn();
        heating.turnOn();
        heating.setDayTemperature();
        security.deactivateAlarm();
        security.unLockDoors();

    }

}