package pl.com.ugeon.decorator2.component;

/**
 * @author Capgemini.
 */
public class ComponentA implements Component {

  @Override
  public void componentHello() {
    System.out.println("Hello Component A.");
  }
}