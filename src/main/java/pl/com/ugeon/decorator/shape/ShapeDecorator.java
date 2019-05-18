package pl.com.ugeon.decorator.shape;

/**
 * @author Mateusz Nowakowski.
 */
public abstract class ShapeDecorator implements Shape {

  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {

    this.decoratedShape = decoratedShape;
  }

  public void draw() {

    decoratedShape.draw();
  }
}