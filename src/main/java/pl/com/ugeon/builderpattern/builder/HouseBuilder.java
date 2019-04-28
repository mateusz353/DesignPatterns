package pl.com.ugeon.builderpattern.builder;

import pl.com.ugeon.builderpattern.product.House;

/**
 * @author Mateusz Nowakowski.
 */
public interface HouseBuilder {

  public void buildBasement();

  public void buildStructure();

  public void bulidRoof();

  public void buildInterior();

  public House getHouse();
}