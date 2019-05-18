package pl.com.ugeon.bridge.shape.impl;

import pl.com.ugeon.bridge.color.Color;
import pl.com.ugeon.bridge.shape.Shape;

/**
 * @author Mateusz Nowakowski.
 */
public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}