package com.pluralsight.finance;

public class Asset implements Valuable {
    private String name;
    private double marketValue;

    public Asset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue() {
        return this.marketValue;
    }
}
