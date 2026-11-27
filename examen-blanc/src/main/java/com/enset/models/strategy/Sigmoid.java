package com.enset.models.strategy;

public class Sigmoid implements IFActivation {
    @Override
    public double activate(double x) {
        System.out.println("sigmoid");
        return 1.0 / (1.0 + Math.exp(-x));
    }
}
