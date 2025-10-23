package FacadeImplementation;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightningSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import StrategyImplementation.HomeModeStrategy;

public class HomeManagerFacade {
    private LightningSystem lights;
    private HeatingSystem heating;
    private SecuritySystem security;

    public HomeManagerFacade(){
        this.lights = new LightningSystem();
        this.heating = new HeatingSystem();
        this.security = new SecuritySystem();
    }

    public void activateMode(HomeModeStrategy mode){
        mode.activate(lights, heating, security);
    }

    public void showStatus(){
        System.out.println(lights.getLightStatus());
        System.out.println(heating.getStatus());
        System.out.println(security.getStatus());
    }
}