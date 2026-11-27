package com.enset.models.observerP;

public interface Observable {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyAllObservers();
}
