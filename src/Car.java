package src;

import java.time.LocalDate;

public class Car
{
    public static enum Fuel
    {
        Diesel,
        Gasoline,
        NaturalGas,
        Ethanol,
        Electric
    }
    public static enum Color
    {
        Branco,
        Preto,
        Prata,
        Vermelho,
        Verde,
        Azul
    }

    Car(String model, int year, Color color)
    {
        this.model = model;
        this.year = year;
        this.color = color;
        ipva = (LocalDate.now().getYear() - year) > 20;
    }
    Car(String make, String model, int year, Color color, String id, double msrp)
    {
        this(model, year, color);
        this.make = make;
        this.id = id;
        this.msrp = msrp;
    }

    @Override public String toString()
    {
        return String.format("%s %s %s", year, make, model);
    }
    void Park(){}
    void Reverse(){}
    void Neutral(){}
    void Drive(){}
    void Honk(){}

    String make;
    String model;
    String id;
    int year;
    Color color;
    Fuel fuel;
    double msrp;
    boolean ipva;
}
