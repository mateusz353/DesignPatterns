package pl.com.ugeon.strategy;

import pl.com.ugeon.strategy.customer.Customer;
import pl.com.ugeon.strategy.strategy.HappyHourStrategy;
import pl.com.ugeon.strategy.strategy.NormalStrategy;

/**
 * @author Mateusz Nowakowski.
 */
public class StrategyPatternWiki {

    public static void main(final String[] arguments) {
        Customer firstCustomer = new Customer(new NormalStrategy());

        // Normal billing
        firstCustomer.add(1.0, 1);

        // Start Happy Hour
        firstCustomer.setStrategy(new HappyHourStrategy());
        firstCustomer.add(1.0, 2);

        // New Customer
        Customer secondCustomer = new Customer(new HappyHourStrategy());
        secondCustomer.add(0.8, 1);
        // The Customer pays
        firstCustomer.printBill();

        // End Happy Hour
        secondCustomer.setStrategy(new NormalStrategy());
        secondCustomer.add(1.3, 2);
        secondCustomer.add(2.5, 1);
        secondCustomer.printBill();
    }
}