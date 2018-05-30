package pl.com.ugeon.factorymethod.factory.impl;

import pl.com.ugeon.factorymethod.factory.ShapeFactory;
import pl.com.ugeon.factorymethod.shape.IShape;
import pl.com.ugeon.factorymethod.shape.impl.Square;

/**
 * Created by mateusz on 30.05.18.
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public IShape createShape() {
        return new Square();
    }
}
