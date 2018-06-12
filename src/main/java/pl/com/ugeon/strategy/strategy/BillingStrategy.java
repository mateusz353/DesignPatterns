package pl.com.ugeon.strategy.strategy;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public interface BillingStrategy {
    double getActPrice(final double rawPrice);
}