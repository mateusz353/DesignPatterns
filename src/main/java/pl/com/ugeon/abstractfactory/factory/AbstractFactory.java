package pl.com.ugeon.abstractfactory.factory;

import pl.com.ugeon.abstractfactory.color.Color;
import pl.com.ugeon.abstractfactory.shape.Shape;

/**
 * Created by mateusz on 30.05.18.
 */
public abstract class AbstractFactory {
    public abstract Color getColor();
    public abstract Shape getShape() ;
}
