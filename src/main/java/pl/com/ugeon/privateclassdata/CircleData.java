package pl.com.ugeon.privateclassdata;

import java.awt.*;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class CircleData {
    private double radius;
    private Color color;
    private Point origin;

    public CircleData(double radius, Color color, Point origin) {
        this.radius = radius;
        this.color = color;
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }
}