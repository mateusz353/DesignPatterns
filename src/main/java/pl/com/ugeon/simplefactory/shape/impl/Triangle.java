package pl.com.ugeon.simplefactory.shape.impl;

import pl.com.ugeon.simplefactory.shape.IShape;

/**
 * Created by mateusz on 30.05.18.
 */
public class Triangle implements IShape {
    @Override
    public void doSomething() {
        System.out.println("Triangle do something");
    }
}
