package src;

public class Gas extends Car
{
    Gas(String model, Color color, int year)
    {
        super(model, color, year);
    }
    Gas(String make, String model, Color color, int year, String id, double msrp)
    {
        super(make, model, color, year, id, msrp);
    }

    @Override void Drive(){System.out.println("*vrum*");}
    @Override void Honk(){System.out.println("*honk*");}
}
