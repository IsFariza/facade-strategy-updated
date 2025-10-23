package StrategyImplementation;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightningSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;

public interface HomeModeStrategy {
    void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security);
}
