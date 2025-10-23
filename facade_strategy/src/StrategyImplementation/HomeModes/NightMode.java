package StrategyImplementation.HomeModes;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightningSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import StrategyImplementation.HomeModeStrategy;

public class NightMode implements HomeModeStrategy {
    @Override
    public void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOff();
        heating.turnOn();
        heating.setNightTemperature();
        security.activateAlarm();
        security.lockDoors();
    }


}
