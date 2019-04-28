package pl.com.ugeon.builderpattern.product;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Mateusz Nowakowski.
 */
public class House implements HousePlan {

  private String basement;
  private String structure;
  private String roof;
  private String interior;

  public void setBasement(String basement) {

    this.basement = basement;
  }

  public void setStructure(String structure) {

    this.structure = structure;
  }

  public void setRoof(String roof) {

    this.roof = roof;
  }

  public void setInterior(String interior) {

    this.interior = interior;
  }

  @Override
  public String toString() {

    return new ToStringBuilder(this)
        .append("basement", basement)
        .append("structure", structure)
        .append("roof", roof)
        .append("interior", interior)
        .toString();
  }
}