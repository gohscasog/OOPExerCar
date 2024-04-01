package src;

import java.time.LocalDate;

public class Car
{
    public static enum Color
    {
        Branco,
        Preto,
        Prata,
        Vermelho,
        Verde,
        Azul
    }

    Car(String model, Color color, int year)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        ipva = (LocalDate.now().getYear() - year) > 20;
    }
    Car(String make, String model, Color color, int year, String id, double msrp)
    {
        this(model, color, year);
        this.make = make;
        this.id = id;
        this.msrp = msrp;
    }

    public String toString()
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
    Color color;
    int year;
    double msrp;
    boolean ipva;
}
