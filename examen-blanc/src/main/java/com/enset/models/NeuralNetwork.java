package com.enset.models;

import com.enset.models.enumiration.State;
import com.enset.models.observerP.Observable;
import com.enset.models.observerP.Observer;

import java.util.ArrayList;
import java.util.List;

public class NeuralNetwork implements Observable {
    private long id;
    private State state = State.CONSTRUCTION;
    private List<Layer> layers = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public double[] predict(double[] input) {
        if (state != State.TRAINED) throw new RuntimeException("impossible");
        return new double[]{0, 0};
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public void train() {
        this.state = State.TRAINING;
        System.out.println("train");

        // at the end of training
        this.state = State.TRAINED;
    }

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
       observers.remove(ob);
    }

    @Override
    public void notifyAllObservers() {
      for (Observer observer: observers) {
          observer.update(this);
      }
    }

    public State getState() {
        return state;
    }

    public long getId() {
        return id;
    }
}
