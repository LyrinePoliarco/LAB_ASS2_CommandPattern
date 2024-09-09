public class Thermostat implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Thermostat is set to heating mode.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off.");
    }
    
    public void increaseTemperature() {
        System.out.println("Increasing thermostat temperature.");
    }
}
