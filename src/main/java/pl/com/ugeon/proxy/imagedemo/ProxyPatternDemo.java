package pl.com.ugeon.proxy.imagedemo;

import pl.com.ugeon.proxy.imagedemo.image.Image;
import pl.com.ugeon.proxy.imagedemo.image.ProxyImage;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}