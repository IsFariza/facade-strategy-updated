package FacadeImplementation.ConcreteFacades;

import HandBook.HandBook;
public class LightningSystem {


    public void turnOn(){
        HandBook.setLightStatus(true);
    }
    public void turnOff(){
        HandBook.setLightStatus(false);
    }

    public String getLightStatus(){
        return "Lights are " + (HandBook.isLightsOn() ? "on" : "off");
    }
}