package pl.com.ugeon.decorator.shape;

/**
 * @author Mateusz Nowakowski.
 */
public class Circle implements Shape {

  @Override
  public void draw() {

    System.out.println("Shape: Circle");
  }
}