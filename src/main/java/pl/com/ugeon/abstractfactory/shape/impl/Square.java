package pl.com.ugeon.abstractfactory.shape.impl;

import pl.com.ugeon.abstractfactory.shape.Shape;

/**
 * Created by mateusz on 30.05.18.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
