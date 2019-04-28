package pl.com.ugeon.builderpattern;

import pl.com.ugeon.builderpattern.builder.HouseBuilder;
import pl.com.ugeon.builderpattern.builder.TipiHouseBuilder;
import pl.com.ugeon.builderpattern.director.CivilEngineer;
import pl.com.ugeon.builderpattern.product.House;

/**
 * @author Mateusz Nowakowski.
 */
class Builder
{
  public static void main(String[] args)
  {
    HouseBuilder iglooBuilder = new TipiHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(iglooBuilder);

    engineer.constructHouse();

    //If the products had a different structure, you could create separate classes for each builder
    House house = engineer.getHouse();

    System.out.println("Builder constructed: "+ house);
  }
}