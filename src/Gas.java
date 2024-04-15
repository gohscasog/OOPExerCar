package src;

public class Gas extends Car
{
    Gas(String model, int year, Color color)
    {
        super(model, year, color);
        this.fuel = Fuel.Gasoline;
    }
    Gas(String make, String model, int year, Color color, String id, double msrp)
    {
        super(make, model, year, color, id, msrp);
    }

    @Override void Drive(){System.out.println("*vrum*");}
    @Override void Honk(){System.out.println("*honk*");}
}
