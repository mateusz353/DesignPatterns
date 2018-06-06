package pl.com.ugeon.decorator.shape;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}