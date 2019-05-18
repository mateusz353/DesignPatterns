package pl.com.ugeon.decorator.shape;

/**
 * @author Mateusz Nowakowski.
 */
public class Rectangle implements Shape {

  @Override
  public void draw() {

    System.out.println("Shape: Rectangle");
  }
}