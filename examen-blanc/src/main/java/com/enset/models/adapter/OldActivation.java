package com.enset.models.adapter;

public class OldActivation implements IOldActivation {
    @Override
    public double oldActivate(double x) {
        System.out.println("old activation");
        return 0;
    }
}
