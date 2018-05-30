package pl.com.ugeon.simplefactory;

import pl.com.ugeon.simplefactory.factory.ShapeFactory;
import pl.com.ugeon.simplefactory.shape.IShape;
import pl.com.ugeon.simplefactory.type.ShapeType;

/**
 * Created by mateusz on 30.05.18.
 */
public class SimpleFactory {

    public static void main( String[] args ){
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape triangle = shapeFactory.CreateShape(ShapeType.Triangle);
        triangle.doSomething();

        IShape square = shapeFactory.CreateShape(ShapeType.Square);
        square.doSomething();
    }
}
