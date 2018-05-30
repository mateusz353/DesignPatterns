package pl.com.ugeon.abstractfactory.factory.impl;

import pl.com.ugeon.abstractfactory.color.Color;
import pl.com.ugeon.abstractfactory.color.impl.Red;
import pl.com.ugeon.abstractfactory.factory.AbstractFactory;
import pl.com.ugeon.abstractfactory.shape.Shape;
import pl.com.ugeon.abstractfactory.shape.impl.Square;

/**
 * Created by mateusz on 30.05.18.
 */
public class RedSquareFactory extends AbstractFactory {

    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Shape getShape(){
        return new Square();
    }

}
