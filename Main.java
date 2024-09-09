public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        
        // Create devices
        SmartDevice light = new Light();
        Thermostat thermostat = new Thermostat();
        
        // Create commands
        Command turnOnLight = new TurnOnCommand(light);
        Command increaseTemp = new IncreaseTemperatureCommand(thermostat);
        
        // Send commands via the hub
        hub.sendCommand(turnOnLight);
        hub.sendCommand(increaseTemp);
    }
}
