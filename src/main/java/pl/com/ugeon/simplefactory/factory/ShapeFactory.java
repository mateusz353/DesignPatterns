package pl.com.ugeon.simplefactory.factory;

import pl.com.ugeon.simplefactory.shape.IShape;
import pl.com.ugeon.simplefactory.shape.impl.Square;
import pl.com.ugeon.simplefactory.shape.impl.Triangle;
import pl.com.ugeon.simplefactory.type.ShapeType;

/**
 * Created by mateusz on 30.05.18.
 */
public class ShapeFactory
{
    public IShape CreateShape(ShapeType shapeType)
    {
        switch (shapeType)
        {
            case Square:
                return new Square();
            case Triangle:
                return new Triangle();
            default:
                throw new IllegalArgumentException();
        }
    }
}
