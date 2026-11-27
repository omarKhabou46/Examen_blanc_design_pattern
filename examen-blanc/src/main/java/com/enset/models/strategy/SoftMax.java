package com.enset.models.strategy;

public class SoftMax implements IFActivation {
    @Override
    public double activate(double x) {
        System.out.println("softmax");
        return 0.5;
    }
}
