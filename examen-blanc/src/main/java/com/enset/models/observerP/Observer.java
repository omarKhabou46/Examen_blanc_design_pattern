package com.enset.models.observerP;

import com.enset.models.NeuralNetwork;

public interface Observer {
    void update(NeuralNetwork neuralNetwork);
}
