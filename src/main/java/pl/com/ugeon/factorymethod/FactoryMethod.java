package pl.com.ugeon.factorymethod;

import pl.com.ugeon.factorymethod.factory.ShapeFactory;
import pl.com.ugeon.factorymethod.factory.impl.SquareFactory;
import pl.com.ugeon.factorymethod.shape.IShape;

/**
 * Created by mateusz on 30.05.18.
 */
public class FactoryMethod {
    public static void main( String[] args ){
        ShapeFactory shapeFactory = new SquareFactory();

        IShape square = shapeFactory.createShape();
        square.doSomething();
    }
}
