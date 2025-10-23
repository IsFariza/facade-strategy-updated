package FacadeImplementation.ConcreteFacades;

import HandBook.HandBook;
public class SecuritySystem {


    public void lockDoors(){
        HandBook.setDoorsLocked(true);
    }
    public void unLockDoors(){
        HandBook.setDoorsLocked(false);
    }

    public void activateAlarm(){
        HandBook.setSecurityAlarm(true);
    }
    public void deactivateAlarm(){
        HandBook.setSecurityAlarm(false);
    }
    public String getStatus(){
        return "Guard system is " + (HandBook.isSecurityAlarmOn() ? "on" : "off") +
                ", Doors are " + (HandBook.isDoorsLocked() ? "locked" : "unlocked");
    }
}
