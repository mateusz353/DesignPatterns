package pl.com.ugeon.decorator2.decorator;

import pl.com.ugeon.decorator2.component.Component;

/**
 * @author Capgemini.
 */
public class DecoratorA extends Decorator {

  public DecoratorA(Component componentInstance) {

    super(componentInstance);
  }

  @Override
  public void componentHello() {

    super.componentHello();
    System.out.println("Hello Decorator A.");
  }
}