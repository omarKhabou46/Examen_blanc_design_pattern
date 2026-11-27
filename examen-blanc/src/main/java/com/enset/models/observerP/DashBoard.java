package com.enset.models.observerP;

import com.enset.models.NeuralNetwork;

public class DashBoard implements Observer {
    @Override
    public void update(NeuralNetwork neuralNetwork) {
        System.out.println("DashBoard");
        System.out.println("NeuralNetwork : " + neuralNetwork.getId() + " state is : " + neuralNetwork.getState());
    }
}
