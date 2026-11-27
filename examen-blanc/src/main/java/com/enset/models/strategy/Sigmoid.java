package com.enset.models.strategy;

public class Sigmoid implements IFActivation {
    @Override
    public double activate(double x) {
        System.out.println("sigmoid");
        return 0.2;
    }
}
