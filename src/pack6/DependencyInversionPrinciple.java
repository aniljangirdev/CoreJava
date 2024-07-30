package pack6;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

    }
}

interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Logic to turn on the light
    }

    @Override
    public void turnOff() {
        // Logic to turn off the light
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}