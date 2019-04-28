package pl.com.ugeon.builderpattern.product;

/**
 * @author Mateusz Nowakowski.
 */
public interface HousePlan
{
  public void setBasement(String basement);

  public void setStructure(String structure);

  public void setRoof(String roof);

  public void setInterior(String interior);
}