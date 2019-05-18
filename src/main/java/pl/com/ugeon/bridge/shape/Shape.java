package pl.com.ugeon.bridge.shape;

import pl.com.ugeon.bridge.color.Color;

/**
 * @author Mateusz Nowakowski.
 */
public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}