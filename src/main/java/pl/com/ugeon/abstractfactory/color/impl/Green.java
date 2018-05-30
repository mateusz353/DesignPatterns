package pl.com.ugeon.abstractfactory.color.impl;

import pl.com.ugeon.abstractfactory.color.Color;

/**
 * Created by mateusz on 30.05.18.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
