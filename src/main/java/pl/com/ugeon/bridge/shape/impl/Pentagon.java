package pl.com.ugeon.bridge.shape.impl;

import pl.com.ugeon.bridge.color.Color;
import pl.com.ugeon.bridge.shape.Shape;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}