package src;

public class EV extends Car
{
    EV(String model, Color color, int year)
    {
        super(model, color, year);
    }

    EV(String make, String model, Color color, int year, String id, double msrp)
    {
        super(make, model, color, year, id, msrp);
    }

    @Override void Drive(){System.out.println("*zzzz*");}
    @Override void Honk(){System.out.println("*beep*");}
}
