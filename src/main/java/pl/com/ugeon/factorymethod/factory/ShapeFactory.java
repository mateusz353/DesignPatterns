package pl.com.ugeon.factorymethod.factory;

import pl.com.ugeon.factorymethod.shape.IShape;

/**
 * Created by mateusz on 30.05.18.
 */
public interface ShapeFactory {
    public abstract IShape createShape();
}
