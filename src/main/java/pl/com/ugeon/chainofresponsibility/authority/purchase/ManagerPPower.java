package pl.com.ugeon.chainofresponsibility.authority.purchase;

/**
 * @author Mateusz Nowakowski.
 */
public class ManagerPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}