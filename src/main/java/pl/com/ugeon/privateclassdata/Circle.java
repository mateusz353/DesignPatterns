package pl.com.ugeon.privateclassdata;

import java.awt.*;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Circle {

    private CircleData circleData;

    public Circle(double radius, Color color, Point origin)
    {
        this.circleData = new CircleData(radius, color, origin);
    }
    public double Circumference()
    {
        return 2 * circleData.getRadius() * Math.PI;
    }
    public double Diameter()
    {
        return circleData.getRadius() * 2;
    }
}