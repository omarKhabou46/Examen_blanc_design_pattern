package com.enset.models;

import com.enset.models.strategy.IFActivation;
import com.enset.models.strategy.Sigmoid;

import java.util.List;

public class Neurone {
    private long id;
    private double biais;
    private double output;
    private IFActivation ifActivation; // default sigmoid
    private List<Connexion> connexions;

    public Neurone(double biais, long id) {
        this.biais = biais;
        this.id = id;
        this.ifActivation = new Sigmoid();
    }

    public double sum() {
        double s = biais;
        for (Connexion connexion : connexions) {
            s += connexion.getSource().getOutput() * connexion.getPoids();
        }
        return s;
    }

    public double activate() {
        output = ifActivation.activate(sum());
        return output;
    }

    public void setConnexions(List<Connexion> connexions) {
        this.connexions = connexions;
    }

    public double getOutput() {
        return output;
    }
}
