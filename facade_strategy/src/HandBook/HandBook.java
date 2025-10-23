package HandBook;

public class HandBook {
    private static int temperature;
    private static int dayTemperature = 22;
    private static int nightTemperature = 25;
    private static boolean heatingStatus;
    private static boolean doorsLocked;
    private static boolean securityAlarm;
    private static boolean lightStatus;

    //for Heating System
    public static int getTemperature() {
        return temperature;
    }
    public static void setDayTemperature() {
        temperature = dayTemperature;
    }
    public static void setNightTemperature() {
        temperature = nightTemperature;
    }

    public static boolean isHeatingOn() {
        return heatingStatus;
    }

    public static void setHeatingStatus(boolean status) {
        heatingStatus = status;
    }

    //for Security System
    public static boolean isDoorsLocked() {
        return doorsLocked;
    }
    public static void setDoorsLocked(boolean status) {
        doorsLocked = status;
    }
    public static boolean isSecurityAlarmOn() {
        return securityAlarm;
    }
    public static void setSecurityAlarm(boolean status) {
        securityAlarm = status;
    }

    //for LightningSystem
    public static boolean isLightsOn() {
        return lightStatus;
    }

    public static void setLightStatus(boolean status) {
        lightStatus = status;
    }

    //Day Mode

}
