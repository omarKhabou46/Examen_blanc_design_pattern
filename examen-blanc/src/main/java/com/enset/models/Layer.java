package com.enset.models;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private long id;
    private List<Neurone> neurones = new ArrayList<>();


    public void addNeurone(Neurone neurone) {
        neurones.add(neurone);
    }

}
