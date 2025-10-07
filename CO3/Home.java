// Abstract class - Abstraction
abstract class Appliance {
    private int powerRating; // Encapsulation

    // Constructor
    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    // Getter and Setter for powerRating - Encapsulation
    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void turnOn();
    public abstract void turnOff();

    // Display power usage
    public void showPowerUsage() {
        System.out.println("Power Rating: " + powerRating + "W");
    }
}

// Subclass - Fan
class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF.");
    }
}

// Subclass - Light
class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF.");
    }
}

// Subclass - AC
class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("AC is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is now OFF.");
    }
}

// Main class to test
public class Home {
    public static void main(String[] args) {
        Fan fan = new Fan(70);
        Light light = new Light(40);
        AC ac = new AC(1500);

        System.out.println("--- FAN ---");
        fan.turnOn();
        fan.showPowerUsage();
        fan.turnOff();

        System.out.println("\n--- LIGHT ---");
        light.turnOn();
        light.showPowerUsage();
        light.turnOff();

        System.out.println("\n--- AC ---");
        ac.turnOn();
        ac.showPowerUsage();
        ac.turnOff();
    }
}
