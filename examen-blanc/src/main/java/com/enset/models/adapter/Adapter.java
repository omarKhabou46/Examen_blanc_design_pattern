package com.enset.models.adapter;

import com.enset.models.strategy.IFActivation;

public class Adapter implements IFActivation  {

    private IOldActivation oldActivation = new OldActivation();

    @Override
    public double activate(double x) {
        return oldActivation.oldActivate(x);
    }

    public void setOldActivation(IOldActivation oldActivation) {
        this.oldActivation = oldActivation;
    }
}
