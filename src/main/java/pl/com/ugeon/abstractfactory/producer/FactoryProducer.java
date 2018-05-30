package pl.com.ugeon.abstractfactory.producer;

import pl.com.ugeon.abstractfactory.color.Color;
import pl.com.ugeon.abstractfactory.factory.AbstractFactory;
import pl.com.ugeon.abstractfactory.shape.Shape;

/**
 * Created by mateusz on 30.05.18.
 */
public class FactoryProducer {

    private AbstractFactory abstractFactory;

    public FactoryProducer(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void createColoredShape() {
        Color color = abstractFactory.getColor();
        Shape shape = abstractFactory.getShape();
        System.out.println("Created " + color.getClass().getSimpleName() + " " + shape.getClass().getSimpleName());
    }
}
