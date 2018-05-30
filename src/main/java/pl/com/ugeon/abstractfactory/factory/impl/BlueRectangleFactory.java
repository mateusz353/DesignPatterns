package pl.com.ugeon.abstractfactory.factory.impl;

import pl.com.ugeon.abstractfactory.color.Color;
import pl.com.ugeon.abstractfactory.color.impl.Blue;
import pl.com.ugeon.abstractfactory.factory.AbstractFactory;
import pl.com.ugeon.abstractfactory.shape.Shape;
import pl.com.ugeon.abstractfactory.shape.impl.Rectangle;

/**
 * Created by mateusz on 30.05.18.
 */
public class BlueRectangleFactory extends AbstractFactory {

    @Override
    public Color getColor() {
        return new Blue();
    }

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
