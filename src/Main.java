package src;

import src.Car.Color;

public class Main
{
    public static void main(String[] args)
    {
        Car f150 = new Gas("Ford", "F-150", 2015, Color.Azul, "ABC-4F69", 40000.0);
        Car s10 = new Gas("S-10", 2000, Color.Branco);
        Car ram = new Gas("RAM 1500", 2024, Color.Vermelho);
        Car modelT = new EV("Model T", 2023, Color.Preto);
        Car cybertruck = new EV("CyberTruck", 2024, Color.Prata);

        System.out.println(f150.toString());
        System.out.println(s10.ipva);
        System.out.println(cybertruck.color);
        System.out.println(cybertruck.fuel);
        System.out.println(s10.fuel);

        ram.Drive();
        modelT.Drive();
    }
}