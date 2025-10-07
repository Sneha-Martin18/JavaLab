// abstract class
abstract class Appliances
{
    int powerrating;

    public Appliances(int powerrating) {
        this.powerrating = powerrating;
    }
    //encapsulation
    public int getPowerRating() {
        return powerrating;
    }

    public void setPowerRating(int powerrating)
    {
        this.powerrating = powerrating;
    }
    //abstract method
    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan extends Appliances
{  
    public Fan(int powerrating)
    {
        super(powerrating);

    }

    public void turnOn()
    {
        System.out.println("Fan is turned on. Powerating :" +getPowerRating() +"W");
    }

    public void turnOff()
    {
        System.out.println("Fan is turned off. Powerrating:" + getPowerRating() + "W");
    }
}

//inheritance
class Light extends Appliances
{
    //constructor inheriting super
    public Light(int powerrating)
    {
        super(powerrating);
    }

    
    public void turnOn()
    {
        System.out.println("Light is turned On. Powerrating :" + getPowerRating() + "W");
    }

    
    public void turnOff()
    {
        System.out.println("Light is off. Powerrating: ");
    }
}

class AC extends Appliances {
    public AC(int powerRating) {
        super(powerRating);
    }

    
    public void turnOn() {
        System.out.println("AC is ON. Power rating: " + getPowerRating() + "W");
    }


    public void turnOff() {
        System.out.println("AC is OFF.");
    }
}

// main class
class Mains
{
    public static void main(String[] args)
    {
        Appliances a1 = new Fan(87);
        Appliances a2 = new Light(60);
        Appliances a3 = new AC(1500);

        a1.turnOn();
        a2.turnOn();
        a3.turnOn();

        a1.turnOff();
        a2.turnOff();
        a3.turnOff();
    }

}