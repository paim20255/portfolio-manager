package com.pluralsight.finance;

public class Jewelry extends Asset {
    private double Kart;
    public static  double pricePerKart = 10_000;

    public Jewelry(String name, double kart) {
        super(name, kart * pricePerKart);
        this.Kart = kart;
    }
}
