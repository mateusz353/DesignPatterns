package pl.com.ugeon.decorator.shape;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}