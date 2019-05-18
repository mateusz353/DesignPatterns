package pl.com.ugeon.decorator;

import pl.com.ugeon.decorator.shape.Circle;
import pl.com.ugeon.decorator.shape.Rectangle;
import pl.com.ugeon.decorator.shape.RedShapeDecorator;
import pl.com.ugeon.decorator.shape.Shape;

/**
 * @author Mateusz Nowakowski.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}