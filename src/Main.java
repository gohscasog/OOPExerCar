package src;

import src.Car.Color;

public class Main
{
    public static void main(String[] args)
    {
        Car f150 = new Gas("F-150", Color.Azul, 2015);
        Car s10 = new Gas("S-10", Color.Branco, 2000);
        Car ram = new Gas("RAM 1500", Color.Vermelho, 2024);

        Car modelT = new EV("Model T", Color.Preto, 2023);
        Car cybertruck = new EV("CyberTruck", Color.Prata, 2024);

        System.out.println(f150.model);
        System.out.println(s10.ipva);
        System.out.println(cybertruck.color);
    }
}