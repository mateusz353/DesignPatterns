package pl.com.ugeon.decorator2.decorator;

import pl.com.ugeon.decorator2.component.Component;

/**
 * @author Capgemini.
 */
public class DecoratorB extends Decorator {

  public DecoratorB(Component componentInstance) {

    super(componentInstance);
  }

  @Override
  public void componentHello() {

    super.componentHello();
    System.out.println("Hello Decorator B.");
  }
}