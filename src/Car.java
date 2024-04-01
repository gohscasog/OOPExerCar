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

    String make;
    String model;
    String id;
    Color color;
    int year;
    double msrp;
    boolean ipva;

    void Park(){};
    void Reverse(){};
    void Neutral(){};
    void Drive(){};
}
