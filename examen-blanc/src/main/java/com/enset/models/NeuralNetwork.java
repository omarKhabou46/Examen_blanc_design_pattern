package com.enset.models;

import com.enset.models.enumiration.State;

import java.util.ArrayList;
import java.util.List;

public class NeuralNetwork {
    private long id;
    private State state;
    private List<Layer> layers = new ArrayList<>();

    public double[] predict(double[] input) {
        return new double[]{0, 0};
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }
}
