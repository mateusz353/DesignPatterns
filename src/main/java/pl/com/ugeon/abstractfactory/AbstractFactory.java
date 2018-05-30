package pl.com.ugeon.abstractfactory;

import pl.com.ugeon.abstractfactory.factory.impl.BlueRectangleFactory;
import pl.com.ugeon.abstractfactory.factory.impl.RedSquareFactory;
import pl.com.ugeon.abstractfactory.producer.FactoryProducer;

/**
 * Created by mateusz on 30.05.18.
 */
public class AbstractFactory {
    public static void main( String[] args )
    {
        FactoryProducer blueRectangleFactory = new FactoryProducer(new BlueRectangleFactory());
        blueRectangleFactory.createColoredShape();

        FactoryProducer redSquareFactory = new FactoryProducer(new RedSquareFactory());
        redSquareFactory.createColoredShape();
    }
}
