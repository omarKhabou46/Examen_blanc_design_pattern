package com.enset.models;

public class Connexion {
    private double poids;
    private Neurone source;
    private Neurone destination;

    public Connexion(double poids, Neurone source, Neurone destination) {
        this.poids = poids;
        this.source = source;
        this.destination = destination;
    }
}
