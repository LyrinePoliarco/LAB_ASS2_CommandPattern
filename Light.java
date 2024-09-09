// A Light device
public class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
    }

    public void adjustBrightness(int level) {
        System.out.println("Light brightness adjusted to " + level + ".");
    }
}

