package pl.com.ugeon.decorator2.decorator;

import pl.com.ugeon.decorator2.component.Component;

/**
 * @author Capgemini.
 */
public class Decorator implements Component {

  private Component componentInstance;

  public Decorator(Component componentInstance) {

    this.componentInstance = componentInstance;
  }

  @Override
  public void componentHello() {

    componentInstance.componentHello();
  }
}