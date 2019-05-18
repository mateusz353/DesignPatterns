package pl.com.ugeon.strategy.strategy;

/**
 * @author Mateusz Nowakowski.
 */
public class HappyHourStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice*0.5;
    }

}