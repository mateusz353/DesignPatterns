package pl.com.ugeon.strategy.strategy;

/**
 * @author Mateusz Nowakowski.
 */
public interface BillingStrategy {
    double getActPrice(final double rawPrice);
}