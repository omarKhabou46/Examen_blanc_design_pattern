package com.enset.models;

import com.enset.models.strategy.IFActivation;
import com.enset.models.strategy.Sigmoid;

public class Neurone {
    private long id;
    private double biais;
    private double output;
    private IFActivation ifActivation; // default sigmoid

    public Neurone(double biais, long id, IFActivation ifActivation) {
        this.biais = biais;
        this.id = id;
        this.ifActivation = new Sigmoid();
    }

    public double sum() {
        return 0.0;
    }

    public double activate() {
        return ifActivation.activate(output);
    }
}
