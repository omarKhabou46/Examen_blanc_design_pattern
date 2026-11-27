package com.enset.models.decorator;

import com.enset.models.Layer;

public abstract class LayerDecorator extends Layer {
    private Layer layer;

    public LayerDecorator(Layer layer) {
        this.layer = layer;
    }
}
