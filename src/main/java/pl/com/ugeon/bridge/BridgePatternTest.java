package pl.com.ugeon.bridge;

import pl.com.ugeon.bridge.color.impl.GreenColor;
import pl.com.ugeon.bridge.color.impl.RedColor;
import pl.com.ugeon.bridge.shape.Shape;
import pl.com.ugeon.bridge.shape.impl.Pentagon;
import pl.com.ugeon.bridge.shape.impl.Triangle;

/**
 * @author Mateusz Nowakowski.
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}