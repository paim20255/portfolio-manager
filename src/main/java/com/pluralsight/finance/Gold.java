package com.pluralsight.finance;

public class Gold {
    private double weight;

    public Gold(double weight) {
        super("gold", weight * 3500);

        this.weight = weight;
    }
}
