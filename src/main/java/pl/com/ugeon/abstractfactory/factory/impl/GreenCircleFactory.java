package pl.com.ugeon.abstractfactory.factory.impl;

import pl.com.ugeon.abstractfactory.color.Color;
import pl.com.ugeon.abstractfactory.color.impl.Green;
import pl.com.ugeon.abstractfactory.factory.AbstractFactory;
import pl.com.ugeon.abstractfactory.shape.Shape;
import pl.com.ugeon.abstractfactory.shape.impl.Circle;

/**
 * Created by mateusz on 30.05.18.
 */
public class GreenCircleFactory extends AbstractFactory {

    @Override
    public Color getColor(){
        return new Green();
    }

    @Override
    public Shape getShape(){
        return new Circle();
    }

}
