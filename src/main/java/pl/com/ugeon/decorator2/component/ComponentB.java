package pl.com.ugeon.decorator2.component;

/**
 * @author Capgemini.
 */
public class ComponentB implements Component {

  @Override
  public void componentHello() {
    System.out.println("Hello Component B.");
  }
}