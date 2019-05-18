package pl.com.ugeon.decorator2;

import pl.com.ugeon.decorator2.component.Component;
import pl.com.ugeon.decorator2.component.ComponentA;
import pl.com.ugeon.decorator2.decorator.DecoratorA;
import pl.com.ugeon.decorator2.decorator.DecoratorB;

/**
 * @author Capgemini.
 */
public class DecoratorPatternDemo2 {

  public static void main(String[] args) {

    Component component = new DecoratorB(new DecoratorA(new ComponentA()));
    component.componentHello();
  }

}