package src;

public class EV extends Car
{
    EV(String model, int year, Color color)
    {
        super(model, year, color);
        this.fuel = Fuel.Electric;
    }
    EV(String make, String model, int year, Color color, String id, double msrp)
    {
        super(make, model, year, color, id, msrp);
    }

    @Override void Drive(){System.out.println("*zzzz*");}
    @Override void Honk(){System.out.println("*beep*");}
}
